/**
 * Enter a three-digit number on the keyboard and obtain the values ​​of each digit.
 */
package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int number;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please input a three-digit number:");
            number = sc.nextInt();
            //judge
            if (number >= 1000 || number <= 99) {
                System.out.println("please check and enter again");
                continue;
            }
            if (number > 99 && number < 1000) {
                break;
            }
            sc.close();
        }
        
        //get each digit
        int onesDigit = number % 10;
        int tenthDigit = number / 10 % 10;
        int hundredsDigit = number / 100 % 10;
        System.out.println("The hundreds digit number is:" + hundredsDigit);
        System.out.println("The tenth digit number is:" + tenthDigit);
        System.out.println("The ones digit number is:" + onesDigit);
    }
}
