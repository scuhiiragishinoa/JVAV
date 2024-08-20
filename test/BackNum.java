package test;

import java.util.*;
/**
 * BackTest
 */
public class BackNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = a;
        int r = 0;
        int num = 0;
        while (a != 0) {
            
            num *= 10;
            r = a % 10;
            a /= 10;
            num += r;
            
        }
        if (num == s) {
            System.out.println("true "+num);
        }
    }
}