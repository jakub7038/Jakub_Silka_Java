import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter output = null;
        String line;
        System.out.println("podaj sciezke pliku zródłowego:");
        int i =0;
        try {
            File file = new File(scanner.nextLine());
            Scanner scanner2 = new Scanner(file);
            while (scanner2.hasNextLine()) {
                line = scanner2.nextLine();
                System.out.printf(line);
                i++;
            }
        } finally {
            if (output != null) output.close();
        }
    }
}

