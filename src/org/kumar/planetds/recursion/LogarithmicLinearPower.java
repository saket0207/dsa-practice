package org.kumar.planetds.recursion;

import java.util.Scanner;

public class LogarithmicLinearPower {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        System.out.println("Enter index ");
        int index = sc.nextInt();
        int logLinPow = logLinPower(n, index);
        System.out.println(logLinPow);
    }

    private static int logLinPower(int n, int index) {
        if(index == 0){
            return 1;
        }
        int pow = logLinPower(n, index/2);
        int logLinPow = pow * pow;
        if(index % 2 == 1){
            logLinPow = logLinPow * n;
        }
        return logLinPow;
    }
}
