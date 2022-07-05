package com.company.ProjetoDeLogicaDeProgramacao;

public class Questao2 {
    public static void main(String[] args) {
        int[] vetor = {1,2,3,4,5};
        int[] vetor2 = {1,4,5,3,7};
        int[] vetor3 = {0,0,0,0,0};

        for(int i = 0; i < vetor.length; i++){
         vetor3 [i] = vetor2[i] +  vetor[i];
            System.out.println("Total: "+ vetor3[i]);
        }
    }
}
