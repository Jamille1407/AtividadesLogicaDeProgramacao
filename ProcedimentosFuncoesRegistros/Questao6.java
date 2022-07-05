package com.company.ProcedimentosFuncoesRegistros;

import java.util.Scanner;

public class Questao6 {

    public static void NumPrimo(int num){

        boolean condicao = true;

        if(num>0){
            for (int j = 2; j<num; j++){
                if(num%j == 0){
                    condicao = false;
                }
            }
        }
        System.out.println(" ");
        System.out.println(condicao);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scan.nextInt();
        NumPrimo(num);
    }
}
