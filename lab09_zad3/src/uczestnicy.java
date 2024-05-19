import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class uczestnicy {
    public int ID;
    public String name;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    uczestnicy(int ID,String name, int wiek){
        this.ID = ID;
        this.name = name;
        this.wiek = wiek;
    }

    public int wiek;

    public static List<uczestnicy> fitler(List<uczestnicy> uczestnik){
        return uczestnik.stream().filter(uczestnicy->uczestnicy.wiek>=18).collect(Collectors.toList());
    }

    public String toString() {
        return ("ID: " + this.ID + " imię: " + this.name + " wiek: " + this.wiek);
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof uczestnicy)) return false;
        uczestnicy that = (uczestnicy) o;
        return ID == that.ID && Objects.equals(name, that.name) && wiek == that.wiek;
    }

    public int hashCode(){
        return Objects.hash(this.ID,this.name,this.wiek);
    }
}
