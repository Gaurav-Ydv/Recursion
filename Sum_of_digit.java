package Recursion;

import java.util.Scanner;

public class Sum_of_digit {

    static int sumOfDigits(int n){
        //base case
        if(n >= 0 && n <= 9) {
            return n;
        }

//------simplest form of below recursive work and self work
        return sumOfDigits(n/10) + n % 10;
//        //recursive work -> small ans
//        int smallAns =  sumOfDigits(n/10);
//
//        //self work
//        return smallAns + n%10;
    }
    static int count(int n){
        int count = 0;
        if(n >= 0)
            count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" number : ");
        int m = sc.nextInt();
        System.out.println("Sum of the digit is : ");
        System.out.println(sumOfDigits(m));
        System.out.println("total digit is : ");
        System.out.println(count(m));



    }
}
