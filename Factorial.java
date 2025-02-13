package Recursion;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {

        if(n == 0) {
        return 1;
        }
        return n * factorial(n-1);


//--------Another way or sort way to Approach this problem
//        //base case
//        if(n == 0) return 1;

//        //smaller problems - recursive work
//        int smallAns = factorial(n-1);

//        //big problem - self work
//        int ans = n * smallAns; // n * factorial(n-1)
//        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Factorial of number "+n+" is : ");
        System.out.println(factorial(n));

    }
}
