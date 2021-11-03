package com.zadanka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Zadanie stricte wyniki :)");
        Scanner in = new Scanner(System.in);
        // najpierw zmienne
        int a1 =  (101 + 0) / 3;
        double a2 = 3.0e-6 * 10000000.1;
        boolean a3 = true && true;
        boolean a4 = false && true;
        boolean a5 = (false && false)||(true && true);
        boolean a6 = (false && false)&&(true && true);
    // wyswietlenie zmiennych 
        System.out.println("(101 + 0)/3)-> "+a1);
        System.out.println("(3.0e-6 * 10000000.1)-> "+a2);
        System.out.println("((true & true))-> "+a3);
        System.out.println("((false && true))-> "+a4);
        System.out.println("((false && false)||(true && true))-> "+a5);
        System.out.println("((false && false)&&(true && true))-> "+a6);
    }
}
//zadanie 1 
/*
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
 */
//zadanie 2 
/* 
     System.out.println("Zadanie stricte wyniki :)");
        Scanner in = new Scanner(System.in);
        // najpierw zmienne
        int a1 =  (101 + 0) / 3;
        double a2 = 3.0e-6 * 10000000.1;
        boolean a3 = true && true;
        boolean a4 = false && true;
        boolean a5 = (false && false)||(true && true);
        boolean a6 = (false && false)&&(true && true);
    // wyswietlenie zmiennych 
        System.out.println("(101 + 0)/3)-> "+a1);
        System.out.println("(3.0e-6 * 10000000.1)-> "+a2);
        System.out.println("((true & true))-> "+a3);
        System.out.println("((false && true))-> "+a4);
        System.out.println("((false && false)||(true && true))-> "+a5);
        System.out.println("((false && false)&&(true && true))-> "+a6);
    }
}
*/
