package com.company.MaoNaMassaStart;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de amostras feitas no laboratorio: ");
        int quantidadeAmostras = scan.nextInt();
        int quantCobaias;
        int somaCoelho = 0;
        int somaRato = 0;
         int somaSapo = 0;
         int somaCobaias = 0;


        while(quantidadeAmostras > 0){
            quantidadeAmostras--;
            System.out.println("Informe a quantidade de cobaias usadas: ");
            quantCobaias = scan.nextInt();
            somaCobaias += quantCobaias;
            System.out.println("""
                    Informe um caractere para o tipo de cobaia utilizado nos testes.\s
                    C -> coelho
                    R -> rato\s
                    S -> sapo""");
            String cobaia = scan.next();

            switch (cobaia){

                case "C":
                   somaCoelho += quantCobaias;
                   break;
                case "R":
                    somaRato += quantCobaias;
                    break;
                case "S":
                    somaSapo += quantCobaias;
                    break;
            }
        }
        System.out.println("Total de cobaias: " + somaCobaias);
        System.out.println("Total de cobaias coelhos: " + somaCoelho);
        System.out.println("Total de cobaias Ratos: " + somaRato);
        System.out.println("Total de cobaias Sapo: " + somaSapo);
        System.out.println("Percentual de coelhos: " + ((somaCoelho * 100)/somaCobaias));
         System.out.println("Percentual de coelhos: " + ((somaRato*100)/somaCobaias));
         System.out.println("Percentual de coelhos: " + ((somaSapo*100)/somaCobaias));
    }
}
