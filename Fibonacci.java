package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fib(int n){

        //base case
        if(n == 0 || n == 1){
            return n;
        }
//------this term is the shortcut of below Sub_problems - Recursive work
        return fib(n-1) + fib(n-2);

//--------//sub_problems - Recursive work
//        int prev = fib(n-1);
//        int prevPrev = fib(n-2);
//
//        //self work
//        return prev + prevPrev;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("print "+n+" fibonacci number : ");
        for (int i = 0; i <= n ; i++) {
            System.out.print(fib(i)+" ");
        }
        System.out.println();
        System.out.println(+n+"th term fibonacci number is : ");
        System.out.println(fib(n));

    }
}
