package com.alura.screenmatch.principal;

import java.util.Scanner;

public class multiplicar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Imgresa el numero a multiplicar");
        int num = sc.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num*i);

        }

    }
}
