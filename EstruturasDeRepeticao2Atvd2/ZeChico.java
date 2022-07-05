package com.company.EstruturasDeRepeticao2Atvd2;

public class ZeChico {
    public static void main(String[] args) {
        double chico = 1.50;
        double ze = 1.10;
        int ano = 0;

        while(chico>ze){
            ze += 0.03;
            chico += 0.02;
            ano++;
        }
        System.out.println(ano + " Anos");

        }
    }

