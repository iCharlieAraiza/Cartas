package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        String tipo, b;
        String A[] = new String[52];
        int k = 0;


        for(int i = 0; i < 4; i++){
            for (int j= 0; j< 13; j++){
                b = ((j+2) == 11 ) ? ("Jack ") : ((j+2) == 12 ) ? "Reina " : ((j+2) == 13 ) ? "rey " : "as ";
                tipo = (i==0) ? "Espadas" : i==1 ?  "Corazones" : i==2 ? "Rombos" : "Treboles";
                A[k] = ((j+2 < 11) ? String.valueOf(j+2) : b)  + " de " + tipo ;
                k++;
            }
        }

        for (int i=0; i<52; i++){
            System.out.println(A[i]);
        }
    }
}
