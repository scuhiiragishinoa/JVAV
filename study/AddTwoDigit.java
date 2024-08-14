package study;
/**
 * iobin.Add two digit together,using keyboard input
 */

import java.util.Scanner;
public class AddTwoDigit {
    public static void main(String[] args) {
        Scanner scx = new Scanner(System.in);
        System.out.println("input the first integer:");
        int x = scx.nextInt();
        Scanner scy = new Scanner(System.in);
        System.out.println("input the second integer:");
        int y = scy.nextInt();
        System.out.println("sum:"+(x + y));
        scx.close();
        scy.close();
    }
}