/**
 * iobin.Compare two digot and print the bigger one.
 */
package study;

import java.util.Scanner;

public class CompareTwoDigit {
    public static void main(String[] args) {
        Scanner scx = new Scanner(System.in);
        System.out.println("please input the first number as A:");
        int a = scx.nextInt();
        Scanner scy = new Scanner(System.in);
        System.out.println("please input the second number as B:");
        int b = scy.nextInt();

        //two ideas, the first one uses least lines.
        if (a != b) {
            System.out.println("the bigger one is " + ( a > b ? ("A:"+ a) : ("B:"+ b)));
        }
        else {
            System.out.println("A and B are equal.");
        }

        /*
        if (a > b) {
            System.out.println("the bigger one is A:"+ a);
        }
        if (a < b) {
            System.out.println("the bigger one is B:"+ b);
        }
        else {
            System.out.println("A and B are equal.");
        }
        */


        scx.close();
        scy.close();
    }
}
