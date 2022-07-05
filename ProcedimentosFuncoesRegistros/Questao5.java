package com.company.ProcedimentosFuncoesRegistros;

import java.util.Scanner;

public class Questao5 {
    public static void Notas(double nota1, double nota2, double nota3) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a média que você irá utilizar. \nA -> Média Aritmetica. \nP -> Média Ponderada" +
                "\nH -> média harmônica.");
        String escolha = scan.next();
        while (nota1<0 && nota1>10){
            System.out.println("Digite um valor válido");
            nota1 = scan.nextDouble();}
        while (nota2<0&&nota2>10){
            System.out.println("Digite um valor válido");
            nota1 = scan.nextDouble();}
        while (nota3<0&&nota2>10){
            System.out.println("Digite um valor válido");
            nota1 = scan.nextDouble();
        }
        switch (escolha) {
            case "A":
                System.out.println((nota1 + nota2 + nota3) / 3);
                break;
            case "P":
                System.out.println(((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10);
                break;
            case "H":
                System.out.println(3 / (1 / nota1 + 1 / nota2 + 1 / nota3));
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
         System.out.println("Informe a nota2: ");
        double nota2 = scan.nextDouble();
         System.out.println("Informe a nota3: ");
        double nota3 = scan.nextDouble();
        Notas(nota1, nota2, nota3);

    }
}
