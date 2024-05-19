import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        //l1_zad1();

        //l1_zad2();

        //l1_zad3();

        //l1_zad4();

        //l1_zad5();

        //l1_zad6();

        //l1_zad7();
    }

    public static void l1_zad1()
    {
        System.out.println("podaj imię: ");
        String imie = instring();
        System.out.println("podaj wiek: ");
        int wiek = inint();
        System.out.println("imię: "+imie+"\nwiek: "+wiek);
    }

    public static void l1_zad2()
    {
        System.out.println("podaj liczbe a: ");
        int a = inint();
        System.out.println("podaj liczbe b: ");
        int b = inint();
        System.out.println("suma: "+a+" + "+b+" wynosi: "+(a+b));
        System.out.println("suma: "+a+" - "+b+" wynosi: "+(a-b));
        System.out.println("suma: "+a+" * "+b+" wynosi: "+(a*b));
    }

    public static void l1_zad3()
    {
        System.out.println("podaj liczbe: ");
        int n = inint();
        if(isEven(n)) System.out.println("jest parzysta");
        else System.out.println("nie jest parzysta");
    }

    public static void l1_zad4()
    {
        System.out.println("podaj liczbe: ");
        int n = inint();
        System.out.println(isdevidable(n));
    }

    public static void l1_zad5()
    {
        System.out.println("podah liczbe: ");
        int n = inint();
        System.out.println(potega3(n));
    }

    public static void l1_zad6()
    {
        System.out.println("podaj liczbe: ");
        int n = inint();
        System.out.println(root(n));
    }

    public static void l1_zad7()
    {
        System.out.println("podaj a: ");
        int a = inint();
        System.out.println("podaj b: ");
        int b = inint();
        System.out.printf("podaj c: ");
        int c = inint();
        System.out.println(is_triangle(a,b,c));
    }

    public static boolean is_triangle(int a, int b, int c)
    {
        if(a+b>c && a+c>b && b+c>a)return true;
        return false;
    }

    public static double root(int n)
    {
        return Math.sqrt(n);
    }
    public static int potega3(int n)
    {
        return (int)Math.pow(n,3);
    }

    public static boolean isdevidable(int n)
    {
        if(n%3==0 && n%5==0)return true;
        return false;
    }

    public static int inint()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String instring()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static boolean isEven(int n)
    {
        if(n%2==0)return true;
        return false;
    }
}