package com.company.EstruturaDeCondicional3Atvd1;



import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o total de eleitores do municipio: ");
        int eleitores = scan.nextInt();
        System.out.println("Informe o total de votos nulos: ");
        int votosNulos = scan.nextInt();
        System.out.println("Informe o total de votos brancos: ");
        int votosBrancos = scan.nextInt();
        int resultadoNulos = (votosNulos * 100) / eleitores;
        int resultadoVotosBrancos = (votosBrancos * 100) / eleitores;
        int votosValidos = (eleitores-(votosBrancos+votosNulos));
        int resultadoVotosValidos = (votosValidos * 100) / eleitores;
        System.out.println("Percentual de votos nulos : " + resultadoNulos + "%");
        System.out.println("Percentual de votos brancos: " + resultadoVotosBrancos + "%");
         System.out.println("Percentual de votos validos: " + resultadoVotosValidos + "%");



    }
}
