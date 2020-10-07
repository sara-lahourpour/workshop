package com.company;

import java.util.Scanner;

public class Coprime {

    public static void main(String[] args) {

        int high , low , gcd=0;
        Scanner in = new Scanner(System.in);
        int num_1 = in.nextInt();
        int num_2 = in.nextInt();
        if ( num_2 > num_1 ){
            high = num_2;
            low = num_1;
        }else {
            high = num_1;
            low = num_2;
        }
        for(int i = 1; i <= low ; ++i) {

            if(low % i==0 && high % i==0) {
                gcd = i;
            }
        }
        if ( gcd == 1){
            System.out.println(low + " and " + high + " are coprime ");
        }
        else {
            System.out.println(low + " and " + high + " are NOT coprime ");
        }

    }
}
