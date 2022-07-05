package com.company.EstruturaDeRepeticao5;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o segundos da duracao do evento: ");
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
}