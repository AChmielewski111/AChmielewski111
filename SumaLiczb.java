import java.util.Scanner;

public class NowaKlasa {
    public static void main(String[] args) {
        System.out.printf("1 liczba : ");
        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        System.out.printf("2 liczba : ");
        int liczba2 = scan.nextInt();

        int wynik = suma(liczba,liczba2);
        System.out.println("Suma tych liczb to: " + wynik);

        int tmp = 0;
        int [] tablica_liczb = new int [3];
        for(int i = 0 ; i < 3; i++) {
            System.out.println( (i+1) + "liczba do tablicy : ");
             tablica_liczb [i] = scan.nextInt();
            if( (i > 0) && (tablica_liczb[i] > tmp) ) {
                tmp = tablica_liczb[i];
            } else if (i == 0) {
                tmp = tablica_liczb[i];
            }
        }
        System.out.println( "Najwieksza liczba " + tmp );
        }


    public static int suma(int arg1 , int arg2) {return arg1 + arg2; }
}
