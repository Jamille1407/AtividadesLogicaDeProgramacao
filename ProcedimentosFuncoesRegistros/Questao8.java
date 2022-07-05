package com.company.ProcedimentosFuncoesRegistros;

import java.util.Scanner;

public class Questao8 {

    public static void Duracao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o segundos da duracao do da fabrica: ");
        int controle = scan.nextInt();
        int segundos = 0;
        int horas = 0;
        int minutos = 0;

        while (controle > 0) {
            controle--;
            segundos++;

            if(segundos >= 60){
                minutos++;
                segundos = 0;
            }

            if (minutos >= 60) {
                minutos = 0;
                horas += 1;
            }
        }
        System.out.println(horas + " : " + minutos + " : " + segundos);
    }

    public static void main(String[] args) {
        Duracao();
    }
}



