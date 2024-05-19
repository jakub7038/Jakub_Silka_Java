import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> imiona = new HashSet<>();
        System.out.println("Wprowadź imiona, napisz '-' aby zakończyć");
        while (true) {
            String imie = InputString();
            if ("-".equals(imie))break;
            imiona.add(imie);
        }
        System.out.println("Liczba unikalnych imion: " + imiona.size());
    }
    public static String InputString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}