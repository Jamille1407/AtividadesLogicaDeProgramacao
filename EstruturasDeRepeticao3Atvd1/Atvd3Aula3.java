package com.company.EstruturasDeRepeticao3Atvd1;

import java.util.Scanner;

public class Atvd3Aula3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos da sala: ");
        int quantAlunos = scan.nextInt();
        int quantAprovados = 0;
        int quantReprovados = 0;


        while(quantAlunos > 0){
            System.out.println("Qual o nome do aluno ? ");
            String nome = scan.next();
            System.out.println("Qual a matricula do aluno ? ");
            int matricula = scan.nextInt();
            System.out.println("Informe a primeira nota do aluno: ");
            double nota1 = scan.nextDouble();
            System.out.println("Informe a segunda nota do aluno: ");
            double nota2 = scan.nextDouble();
            System.out.println("Informe a terceira nota do aluno: ");
            double nota3 = scan.nextDouble();
            double media = ((2 * nota1) +(3* nota2) +(4* nota3) )/ 9;

            if(nota1 > 10 || nota2 > 10 || nota3 > 10 || nota1 < 0 || nota2 < 0 || nota3 < 0){
                System.out.println("Nota invalida, digite uma nota válida: ");
                continue;
            }

            if(media >= 5){
                System.out.println("nome do aluno: " + nome);
                System.out.println("\nmatricula do aluno: " + matricula);
                System.out.println("Média do aluno: " + media);
                System.out.println("Status: APROVADOOOOO :)");
                quantAprovados++;

            }else {
                System.out.println("nome do aluno: " + nome);
                System.out.println("\nmatricula do aluno: " + matricula);
                System.out.println("Média do aluno: " + media);
                System.out.println("Status: REPROVADO :(");

            }

        }
        System.out.println("Quantidade de aprovados: " + quantAprovados);
         System.out.println("Quantidade de reprovados: " + quantReprovados);

    }
}
