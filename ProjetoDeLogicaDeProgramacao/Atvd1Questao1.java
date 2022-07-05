package com.company.ProjetoDeLogicaDeProgramacao;

public class Atvd1Questao1 {
    public static void main(String[] args) {
        int a[] = new int [10];

        for(int i = 0; i <10; i++){
            a[i] = i;
            System.out.println(a[i]);
        }
        int b[] = a;
        System.out.println();

        for(int i = 0; i< 10; i++){
            a[i] = i;
            System.out.println(b[i]);
        }
    }
}
