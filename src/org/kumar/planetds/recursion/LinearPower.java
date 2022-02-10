package org.kumar.planetds.recursion;

import java.util.Scanner;

public class LinearPower {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        System.out.println("Enter index ");
        int index = sc.nextInt();
        int power = calculateLinearPower(n, index);
        System.out.println(power);
    }

    private static int calculateLinearPower(int n, int index) {
        if(index == 0){
            return 1;
        }
        int linPowM1 = calculateLinearPower(n,index-1);
        int pow = n * linPowM1;
        return pow;

    }
}
