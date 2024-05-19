import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,String> pary = new LinkedHashMap<>();
        System.out.println("Wprowadź imiona, napisz '-' aby zakończyć");
        while (true) {
            System.out.println("imie 1: ");
            String imie1 = InputString();
            if ("-".equals(imie1)) break;
            System.out.println("imie 2: ");
            String imie2 = InputString();
            pary.put(imie1,imie2);
        }

        System.out.println("podaj imie: ");
        String imie = InputString();
        if(pary.containsKey(imie)){
            System.out.printf(imie+" - "+pary.get(imie));
        }
        else System.out.printf("takiego imiona nie ma na liscie");

    }
    public static String InputString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}