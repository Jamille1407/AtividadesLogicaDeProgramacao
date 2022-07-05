package com.company.EstruturasDeRepeticao3Atvd1;

import java.util.Scanner;

public class Atvd5Aula03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double idade ;
        double altura;
        double alturaMedia = 0;
        double idadeMedia = 0;
        int somaIdade = 0;
        double somaAltura = 0;
        int alunos = 0;
        double quantIdade = 0;
        double quantAltura = 0;
        while(alunos <= 87){
            alunos++;
            System.out.println("Qual a sua idade: ");
            idade = scan.nextDouble();
            System.out.println("Qual a sua altura: ");
            altura = scan.nextDouble();

            if( altura < 1.70){
                quantAltura++;
                somaIdade += idade;
                idadeMedia = somaIdade /quantAltura;

            }else if(idade > 20){
                quantIdade++;
                somaAltura += altura;
                alturaMedia = somaAltura / quantAltura;

            }
        }
        System.out.println("A média de idade dos alunos que tem menos que 1,70 de altura é: " + idadeMedia);
        System.out.println("A altura média dos alunos com mais de 20 anos é: " + alturaMedia);
    }
}




