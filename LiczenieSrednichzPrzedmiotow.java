package pl.Javanauka.pl;

import java.util.Scanner;

public class FirstClass {
    public static void wczytajoceny(int arg[][]){
        Scanner inputScanner = new Scanner(System.in);
        for(int i = 0 ; i <3 ; i++){
            System.out.println("Oceny dla  przedmiotu  " + (i+1));
            for (int j = 0 ; j <4 ; j++){
            arg[i][j] = inputScanner.nextInt();}
        }
    }

    public static float [] liczsrednia(int argum[][] , float srednia[]){
        Scanner inputScanner = new Scanner(System.in);
        for(int i = 0 ; i <3 ; i++){
            for (int j = 0 ; j <4 ; j++){
                srednia[i] += argum[i][j] ;}
            srednia[i] = srednia[i]/4;
        }
        return srednia;
    }
    public static void wypisz(float srednia[]){
        for(int i = 0 ; i < srednia.length ; i++){
        System.out.println("Oceny dla  przedmiotu  " + (i+1));
        System.out.println(srednia[i]); }
    }
    public static void main(String[] args) {
        int [][] przedmioty = new int[3][4] ;
        FirstClass nowaklasa = new FirstClass();
        nowaklasa.wczytajoceny(przedmioty);
       float [] srednie = new float [3];
        nowaklasa.liczsrednia(przedmioty,srednie);

        nowaklasa.wypisz(srednie);

    }
}
