package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Element of An Array");
        for(int i=0; i<3; i++){
            array[i] = in.nextInt();
        }

        for (int i=0; i<array.length; i++){
            Boolean isPrime =true;
            for (int j=2; j<i; j++){
                if(i%j==0){
                    System.out.println(array[i] + "Not a prime number");
                    isPrime=false;
                    break;
                }
            }

            if (isPrime==true);
            System.out.println(array[i] + " prime number of array ");
        }



    }
}
