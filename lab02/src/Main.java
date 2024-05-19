import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //l2_zad1();
        //l2_zad2();
        //l2_zad3();
        //l2_zad4();
        //l2_zad5();
        //l2_zad6();
    }

    public static void l2_zad1()
    {
        System.out.println("podaj a: ");
        int a = in_int();
        System.out.println("podaj b: ");
        int b = in_int();
        System.out.println("podaj c: ");
        int c = in_int();
        double delta;
        delta = (b * b - 4 * a * c);
        if(delta>=0) {
            System.out.println("x1: " + ((-b + Math.sqrt(delta)) / (2 * a)) + " x2: " + ((-b - Math.sqrt(delta)) / (2 * a)));
        }else System.out.printf("nie ma miejsc zerowych!");
    }

    public static void l2_zad2()
    {
        double x,fx;
        System.out.printf("podaj x: ");
        x = in_double();
        if(x>0)fx=2*x;
        else fx=-3*x;
        System.out.println("a("+x+")= "+fx);
        if(x>=1)fx=x*x;
        else fx=x;
        System.out.println("b("+x+")= "+fx);
        if(x>2)fx=x+2;
        else {if(x!=2)fx=x-4;
        else fx=8;}
        System.out.println("c("+x+")= "+fx);

    }
    public static void l2_zad3()
    {
    int a,b,c;
        System.out.printf("podaj a: ");
        a=in_int();
        System.out.printf("podaj b: ");
        b=in_int();
        System.out.printf("podaj c: ");
        c=in_int();

        if(a<b){
            if(a<c){
                if(b<c){
                    System.out.printf(a+" "+b+" "+c);
                }
                else {
                    System.out.printf(a+" "+c+" "+b);
                }
            }
            else System.out.printf(c+" "+a+" "+b);
        }
        else if(b<c){
                if(a<c){
                    System.out.printf(b + " " + a + " " + c);
                }
                else {
                    System.out.printf(b+" "+c+" "+a);
                }
        }
        else System.out.printf(c+" "+b+" "+a);
    }
    public static void l2_zad4()
    {
        System.out.println("czy pada deszcz: ");
        boolean pada = input_boolean();
        System.out.println("czy jest bus: ");
        boolean bus = input_boolean();
        if(bus)
        {
            if(pada) System.out.println("wez parasol");
            System.out.println("Dostaniesz się");
            if(!pada) System.out.println("milego dnia i pieknej pogody");
        }
        else System.out.println("nie dostaniesz sie");
    }
    public static void l2_zad5()
    {
        System.out.println("czy jest zniżka: ");
        boolean sale = input_boolean();
        System.out.println("czy masz premię: ");
        boolean premia = input_boolean();

        if(sale||premia)
        {
            System.out.println("Możesz kupić samochód !");
            if(!premia)System.out.println("Zniżki na samochód nie ma");
        }
        else
        {
            System.out.println("Zakup samochód trzeba odłożyć na później...");
            System.out.println("Zniżki na samochód nie ma");
        }
    }
    public static void l2_zad6()
    {
        System.out.println("podaj liczbę a: ");
        int a = in_int();
        System.out.println("podaj liczbę b: ");
        int b = in_int();
        System.out.println("wpisz 1 aby dodać, 2 aby odjąć, 3 aby pomnożyć, lub 4 aby podzielić: ");
        int c = in_int();
        switch(c){
            case 1:
                System.out.println((a+b));
                break;
            case 2:
                System.out.println((a-b));
                break;
            case 3:
                System.out.println((a*b));
                break;
            case 4:
                if(b>a) System.out.println(a+"/"+b);
                else {
                    int r = a % b;
                    a -= r;
                    System.out.println((a / b) + " reszta: " + r);
                }
                break;
            default:
                System.out.println("bruh");
        }

    }
    public static String in_string()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static int randomint(int min, int max)
    {
        return (int)(Math.random()*(max-min+1)+min);
    }

    public static int in_int()
    {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static double in_double()
    {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    public static boolean input_boolean()
    {
        Scanner input = new Scanner(System.in);
        return input.nextBoolean();
    }
}