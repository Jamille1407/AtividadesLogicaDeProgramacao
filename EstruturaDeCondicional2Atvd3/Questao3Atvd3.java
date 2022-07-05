package com.company.EstruturaDeCondicional2Atvd3;

import java.util.Scanner;

public class Questao3Atvd3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double num = scan.nextDouble();
        System.out.println("Escolha a condição do pagamento: \n01- Venda a vista -> Desconto de 10%." +
                "\n02 - Venda a prazo de 30 dias -> Desconto de 5%. \n03 - Venda a Prazo 60 dias -> mesmo preço." +
                "\n04 - Venda a Prazo 90 dias -> acréscimo de 5%. \n05 - Venda com cartão de débito -> desconto de 8%." +
                "\n06 - Venda com cartão de crédito -> desconto de 7%.");
        System.out.println("Informe a sua escolha: ");
        int escolhaCondicao = scan.nextInt();

        switch (escolhaCondicao) {

            case 01:
                System.out.println("Desconto da venda: " + (num / 10));
                break;
            case 02:
                System.out.println("Desconto da venda: " + (num / 5));
                break;
            case 03:
                System.out.println("Valor: " + num);
                break;
            case 04:
                System.out.println("Acrescimo de: " + num + (num * 0.5));
                break;
            case 05:
                System.out.println("Desconto de: " + (num /8));
                break;
            case 06:
                System.out.println("Desconto de: " + (num / 7));
                break;
            default:
                System.out.println("Valor da compra inválido.");

        }

    }

}
