import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter output = null;
        String line;
        System.out.println("podaj sciezke pliku zródłowego:");
        try{
            output = new FileWriter(scanner.nextLine());
            System.out.println("podaj zawartosc pliku: ");
            while(true){
                line = scanner.nextLine();
                if(line.equals("-"))break;
                output.write(line);
                output.write(System.lineSeparator());
            }
        }finally {
            if(output !=null)output.close();
        }

    }
}