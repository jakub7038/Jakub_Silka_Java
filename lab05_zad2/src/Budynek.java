import java.time.LocalDate;
import java.util.Date;

public class Budynek {
private String nazwa;
private int l_piętr;
private LocalDate data = LocalDate.of(2024,5,12);
private LocalDate localdate = LocalDate.of(2024,5,12);

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getL_piętr() {
        return l_piętr;
    }

    public void setL_piętr(int l_piętr) {
        this.l_piętr = l_piętr;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String wiek(){
        return String.valueOf((this.localdate.getYear()-this.data.getYear()));
    }
    public Budynek(String nazwa, int l_piętr, LocalDate data){
        this.data = data;
        this.l_piętr = l_piętr;
        this.nazwa = nazwa;
    }

    public Budynek(){};

    public void opisz()
    {
        System.out.println("nazwa: "+nazwa+" wiek: "+wiek()+" l_piętr: "+l_piętr);
    }
}
