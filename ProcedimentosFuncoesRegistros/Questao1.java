package com.company.ProcedimentosFuncoesRegistros;

import java.util.Scanner;

public class Questao1 {
        public static void Ficheiro(int codigo, double quantidade){
            switch (codigo){
                case 1:
                    System.out.println("Total: R$" + (quantidade * 4.00));
                    break;
                case 2:
                    System.out.println("Total: R$" + (quantidade * 4.50));
                    break;
                case 3:
                    System.out.println("Total: R$" + (quantidade * 5.00));
                    break;
                case 4:
                    System.out.println("Total: R$" + (quantidade * 2.00));
                    break;
                case 5:
                    System.out.println("Total: R$" + (quantidade * 1.50));
                    break;
            }
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o codigo do produto: ");
        int codigo = scan.nextInt();
        System.out.println("Informe a quantidade do produto: ");
        double quantidade = scan.nextDouble();
        Ficheiro( codigo, quantidade);
    }

    }
