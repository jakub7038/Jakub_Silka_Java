import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List<uczestnicy> ludzie = new LinkedList<>();
        List<uczestnicy> ludzie = new ArrayList<>();

        ludzie.add(new uczestnicy(1,"Ala",10));
        ludzie.add(new uczestnicy(2,"Ola",20));
        ludzie.add(new uczestnicy(3,"Ada",23));

        List<uczestnicy> dorosli = uczestnicy.fitler(ludzie);

        for(uczestnicy item : dorosli){
            System.out.println(item.toString());
        }

    }
}