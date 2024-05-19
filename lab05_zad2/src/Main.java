import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020,10,20);
        Budynek budynek1 = new Budynek("budynek1",10, date);
        Budynek budynek2 = new Budynek();
        budynek2.setNazwa("budynek2");
        budynek2.setL_piętr(5);
        budynek2.setData(LocalDate.of(2018,5,12));
        budynek1.opisz();
        budynek2.opisz();
    }
}