import java.util.Scanner;

public class pierwiastek {
    public static void main(){
        int x;
        double y;
        try{
            x = Integer.parseInt(InputString());
            if(x<0)throw new IllegalArgumentException();
            y = Math.sqrt(x);
            System.out.println(y);
        }catch (NumberFormatException e){
            System.err.println("niepoprawny format danych");
        }catch (IllegalArgumentException e){
            System.err.println("nielegalne liczba ujemna");
        }


    }

    public static String InputString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
