package com.company.EstruturasCondicionais1;

import java.util.Scanner;

public class Atvd1Questao8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\ninforme a primeira nota do primeiro bimestre: ");
            double nota1B1 = scan.nextInt();
            if (nota1B1 >= 0 && nota1B1 <= 10) {
                System.out.println("\nnota 1 do primeiro bimestre: " + nota1B1);
            } else {
                System.out.println("\nnota inválida, digite uma nota válida... ");
                continue;
            }
            System.out.println("\ninforme a segunda nota do primeiro bimestre: ");
            double nota2B1 = scan.nextInt();
            if (nota2B1 >= 0 && nota2B1 <= 10) {
                System.out.println("\nnota 2 do primeiro bimestre: " + nota2B1);
            } else {
                System.out.println("\nNota inválida");
                continue;

            }System.out.println("\ninforme a primeira nota do segundo bimestre: ");
            double nota1B2 = scan.nextInt();
            if (nota1B2 >= 0 && nota1B2 <= 10) {
                System.out.println("\nnota 1 do segundo bimestre: " + nota1B2);
            } else {
                System.out.println("\nnota inválida, digite uma nota válida... ");
                continue;
            }
            System.out.println("\ninforme a segunda nota do segundo bimestre: ");
            double nota2B2 = scan.nextInt();
            if (nota2B1 >= 0 && nota2B1 <= 10) {
                System.out.println("\nnota 2 do segundo bimestre: \n" + nota2B2);
            } else {
                System.out.println("\nerro, nota inválida...");

                break;
            }
            double notaBimestre1 = nota1B1 + nota2B1;
            System.out.println("\nA nota do primeiro Bimestre foi: " + notaBimestre1);
            double notaBimestre2 = nota1B2 + nota2B2;
            System.out.println("A nota do segundo Bimestre foi: " + notaBimestre2);
            double mediaDosSemestres = (notaBimestre1 + notaBimestre2) / 4;
            System.out.println("A média do semestre foi: " + mediaDosSemestres);




        }
    }
}



