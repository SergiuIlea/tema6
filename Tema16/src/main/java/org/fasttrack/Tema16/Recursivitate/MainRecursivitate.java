package org.fasttrack.Tema16.Recursivitate;

public class MainRecursivitate {
    public static void main(String[] args) {
        System.out.println(sumOfFirstNEvenIntegers(5));
        System.out.println(sumOfDigits(123));
        System.out.println(finonacciArray(7));
    }

    public static int sumOfFirstNEvenIntegers(int n){
        if(n>0){
            return n*2 + sumOfFirstNEvenIntegers(n-1);
        }else return 0;
    }

    public static int sumOfDigits(int n){
        if(n<10){
            return n;
        }else {
            return n%10 + sumOfDigits(n/10);
        }
    }

    public static int finonacciArray(int n){
        if(n<2){;
            return n;
        } else {
            return finonacciArray(n-1) + finonacciArray(n-2);
        }
    }

    public static int sumOfNr(int n){
        if(n==1){
            return 1;
        }
        else return n+ sumOfNr(n-1);
    }
}
