package com.company.EstruturaDeCondicional3Atvd1;

import java.util.Scanner;

public class CarrosVendidos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salarioFixo = 2000.00;
        double comissaoFixa = 200.00;

        System.out.println("Quantos carros foram vendidos? ");
        double quantDeCarrosVendidos = scan.nextDouble();
        System.out.println("Valor total de suas vendas: ");
        double valorTotalDeVendas = scan.nextDouble();

        double resultadoDaComissaoDaVenda = valorTotalDeVendas * 0.05;
        System.out.println("Resultado da comissão da venda: " + resultadoDaComissaoDaVenda);


        double resultadoFinal = (quantDeCarrosVendidos * comissaoFixa) + resultadoDaComissaoDaVenda + salarioFixo;
        System.out.println("O salario do funcionario com a comissão é: " + resultadoFinal);
    }
}
