package com.company.EstruturaDeCondicional3Atvd2;

import java.util.Scanner;

public class CompraMacas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas maças foram compradas: ");
        int totalMacas = scan.nextInt();

        if(totalMacas < 12){
            System.out.println("\nTotal da compra: " + (totalMacas * 1.30));
        } else {
            System.out.println("\nTotal da compra: " + totalMacas);
        }
    }
}
