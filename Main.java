package com.zadanka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program przyjmuje od uzytkownika 4 inty i pisze ze sa rowne jesli sa rowne a jesli nie to niespodzianka");
        Scanner in = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe");
        int a1 = in.nextInt();
        System.out.println("podaj druga liczbe");
        int a2 = in.nextInt();
        System.out.println("podaj trzecia liczbe");
        int a3 = in.nextInt();
        System.out.println("podaj czwarta liczbe");
        int a4 = in.nextInt();

        if(a1 == a2 && a2 == a3 && a3 == a4){
            System.out.println("Sa rowne");
        }else{
            System.out.println("Slabo");
        }
    }
}
