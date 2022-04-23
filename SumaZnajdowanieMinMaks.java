import java.util.Scanner;

public class NowaKlasa {
    public int sumaliczb(int [] numbers) {
        return numbers[0] + numbers[1];
    }
    public int najwiekszaliczba(int [] numbers) {
        int tmp = numbers[0];
        for(int i = 1 ; i < numbers.length ; i++){
            if(numbers[i]>tmp){
                tmp = numbers[i];
            }
        }
        return tmp;
    }
    public int najmniejszaliczba(int [] numbers) {
        int tmp = numbers[0];
        for(int i = 1 ; i < numbers.length ; i++){
            if(numbers[i]<tmp){
                tmp = numbers[i];
            }
        }
        return tmp;
    }


    public static void main(String[] args) {
        NowaKlasa PierwszyProgram = new NowaKlasa();
        int [] Tablica_do_sumowania = {10 , 22} ;
        System.out.println("Suma liczb to:  ");
        System.out.println(PierwszyProgram.sumaliczb(Tablica_do_sumowania));


        int [] Tablica_3_Elemenentów = {10 , 2, 44,100, 10 , 11 ,101 , 500 , -11 , 501 };
        System.out.println("Najwieksza liczba w tablicy to:  ");
        System.out.println(PierwszyProgram.najwiekszaliczba(Tablica_3_Elemenentów));

        System.out.println("Namniejsza liczba w tablicy to:  ");
        System.out.println(PierwszyProgram.najmniejszaliczba(Tablica_3_Elemenentów));


    }



}
