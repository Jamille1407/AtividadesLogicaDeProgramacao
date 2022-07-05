package com.company.EstruturaDeCondicional3Atvd2;

import java.util.Scanner;

public class SalarioFixo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salarioFixo = 1200.00;

        System.out.println("Digite o total das vendas: ");
        double totalVendas = scan.nextDouble();



        if(totalVendas < 1500){
            System.out.println("Comissão de 3% do total de vendas: " + (totalVendas * 0.03 + (salarioFixo)));
        }else{
            System.out.println("Sua comissão foi de 5%: " + (totalVendas * 0.05 + (salarioFixo)));
        }
    }

}
