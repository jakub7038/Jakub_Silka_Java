import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //l4_zad1();
        //l4_zad2();
        //l4_zad3();
        //l4_zad4();
        //l4_zad5();
        //l4_zad6();
        l4_zad7();
    }

    public static void l4_zad1()
    {
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

        int suma=0, srednia=0;
        for(int i=0;i<size;i++) {

        }
        for(int i : tab)
        {
            suma+=tab[i];
        }
    }

    public static void l4_zad2(){
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8,9};
        int i =0;
        for(i=0; i < array1.length; i=i+2){
            System.out.println(array1[i]);
        }
        for(i=0; i < array2.length; i=i+2){
            System.out.println(array2[i]);
        }

    }

    public static void l4_zad3() {
        String[] array = {"Ala","ma","kota"};
        for(String string : array){
            System.out.println(string.toUpperCase());
        }
    }

    public static void l4_zad4() {
        String[] array = new String[5];
        for(int i =0; i< array.length; i++) {
            System.out.println("podaj słowo: ");
            array[i]=in_string();
        }
        for(int i = array.length-1;i>=0;i--) {
            for(int j = array[i].length()-1;j>=0;j--){
                System.out.print(array[i].charAt(j));
            }
            System.out.println();
        }

    }

    public static void l4_zad5() {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = in_int();
        }
        Arrays.sort(array);
        for (int item : array){
            System.out.println(item+" ");
        }
    }

    public static void l4_zad6(){
        int[] array = new int[5];
        for(int i = 0; i< array.length; i++){
            array[i]=in_int();
        }
        for(int item : array){
            System.out.println(silnia(item));
        }
    }

    public static void l4_zad7(){
        String[] array1= {"ala","ma","kota"};
        String[] array2= {"ala","ma","kota"};
        boolean czy = true;
        String s1,s2;
        if(array1.length!=array2.length)czy = false;
        else for(int i =0;i<array1.length;i++){
            s1 = array1[i];
            s2 = array2[i];
            if(!compare(s1,s2))czy = false;
        }
        System.out.println(czy);
    }
    public static boolean compare(String s1,String s2){
        if(s1.equals(s2))return true;
        return false;
    }
    public static int silnia(int n){
        if(n==0||n==1)return 1;
        return n*silnia(n-1);
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
    public static String in_string()
    {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}