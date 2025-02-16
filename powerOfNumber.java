package Recursion;

import java.util.Scanner;

public class powerOfNumber {
////--------------Approach-1 to find the power of a number in which TIME COMPLEXITY and SPACE COMPLEXITY = O(q)-----------------
//    static int pow(int p, int q){  //p^q -> TC - O(q), where q is the power of p
//        //base case
//        if(q == 0){
//            return 1;
//        }
//        //recursive work and self work
//        return pow(p,q-1) * p;  // p^q-1 * p = p^q
//    }

//----------------------------------------------BETTER APPROACH---------------------------------------------------
//----------------Approach-2 to find the power of a number in which TIME COMPLEXITY and SPACE COMPLEXITY = O(log q)--------------
    static int pow(int p, int q){
        //base case
        if(q == 0) return 1;

        int smallPow = pow(p,q/2);
        if(q % 2 == 0){ //even
            return smallPow * smallPow;
        }else{  //odd
            return p * smallPow * smallPow;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the power : ");
        int m = sc.nextInt();
        System.out.println(+n+" to the power "+m+" is : ");
        System.out.println(pow(n,m));

    }
}
