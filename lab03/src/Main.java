import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //l3_zad1(10);
        l3_zad2();
        l3_zad3();
        //l3_zad4();
        //l3_zad5();
    }



    public static void l3_zad1(int n)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(n);
        int x=0;
        double wynik=0;
        int[] pkt = new int[n];
        while(x<n)
        {
            System.out.println("podaj ilość pkt: ");
            pkt[x] = input.nextInt();
            wynik+=pkt[x];
            x++;
        }

        wynik/=n;
        System.out.println("wynik: "+ wynik);
    }
    public static void l3_zad2(){
        int min,max;
        System.out.println("podaj min: ");
        min=in_int();

        System.out.println("podaj max: ");
        max=in_int();

        int size = 10;
        int[] tab = new int[size];
        for(int i=0;i<size;i++) {
            tab[i]=randomint(min, max);
        }

        int suma=0;

        for(int i : tab)
        {
            suma+=i;
        }
        System.out.println("suma: "+suma);
    }

    public static void l3_zad3() {
        System.out.println("podaj n");
        int n = in_int();
        int wynik;
        if(n<=0) System.out.println("niepoprawne dane");
        else {
            if (n % 2 == 0) wynik = (n/2)*((n/2)+1);
            else {
                n--;
                wynik = (n/2)*((n/2)+1);
            }
            System.out.println("wynik: "+wynik);
        }
    }

    public static void l3_zad4()
    {
        System.out.println("podaj n");
        int n = in_int();
        int wynik=0;

        if(n<1) System.out.println("niepoprawne dane");
        else {
            int[] tab = new int[n];
            for (int i = 0; i < n; i++) {
                //(-10,45) (0,55)
                tab[i]=(int)(Math.random()*(55)-10);
                System.out.println("tab["+(n+1)+"] = "+tab[i]);
            }
            for (int i = 0; i < n; i++) {
                if(tab[i]%2==0)wynik+=tab[i];
            }
            System.out.println(wynik);

        }
    }

    public static void l3_zad5()
    {
        Scanner input = new Scanner(System.in);
        String palindr = input.nextLine();
        palindrom(palindr);
    }

    public static void palindrom(String palindr)
    {
        System.out.println(palindr);
        char[] palindrom = palindr.toCharArray();
        boolean czy = true;
        int l = palindrom.length;
        for(int i=0;i<l;i++)
        {
            if(palindrom[i]!=palindrom[l-i-1]) {
                czy = false;
                break;
            }
        }
        if(czy) System.out.println("jest");
        else System.out.println("nie jest");
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
}