package study;
/**
 * Using scanner
 */
import java.util.Scanner;//find Scanner

public class KeyboardTypeIn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//create object
        System.out.println("please input integer:");
        int i = sc.nextInt();//recieve data
        System.out.println(i);
        sc.close();//close the port for security
    }
}
