package com.company;

import java.util.Scanner;

public class AreaTriangulo {
    public static void areaDoTriangulo(double base, double altura){
            double resultado = (base*altura)/2;
            System.out.println(resultado);


        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a base: ");
        double base = scan.nextDouble();
        System.out.println("Informe a altura: ");
        double altura = scan.nextDouble();
        areaDoTriangulo( base, altura);





    }


    }
