package com.company.EstruturasDeRepeticao2Atvd2;

import java.util.Scanner;

public class AlunosRestaurante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double percentualDeVisitasUm = 0;
        double percentualDeVisitasDois = 0;
        double percentualDeVisitastres = 0;
        double quantDeEscolhaUm = 0;
        double quantDeEscolhaDois = 0;
        double quantDeEscolhaTres = 0;


        for(int alunos = 1; alunos <= 5; alunos++){

            System.out.println("""
                    Escolha uma das opcões abaixo na qual você se encaixa, \s
                    em relação a quantidades de visitas ao restaurante da universidade:\s
                    1. Menos de 10 vezes.
                    2. Entre 10 e 15 vezes.\s
                    3. Acima de 15 vezes.\s""");
            int escolha = scan.nextInt();

            if(escolha == 1){
                quantDeEscolhaUm++;
                percentualDeVisitasUm = (quantDeEscolhaUm * 100) / 5;

            } else if(escolha == 2){
                quantDeEscolhaDois++;
                percentualDeVisitasDois = (quantDeEscolhaDois * 100) / 5;
            }else if (escolha == 3){
                quantDeEscolhaTres++;
                percentualDeVisitastres = (quantDeEscolhaTres * 100) / 5;
            }

        }
        System.out.println("Percentual de visitas menos de 10 vezes: " + percentualDeVisitasUm + " %");
        System.out.println("Percentual de visitas entre 10 e 15 vezes: " + percentualDeVisitasDois + " %");
        System.out.println("Percentual de visitas acima de 15 vezes: " + percentualDeVisitastres + " %");
    }
}
