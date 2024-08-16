/**
 * iobin.Diplay basic structrue of code: sequential structure, branching structure, circular structure
 */

package study;
import java.util.Scanner;
public class CodeStructure {
    public static void main(String[] args) {
        Scanner scx = new Scanner(System.in);
        System.out.println("please input x:");
        int x = scx.nextInt();
        System.out.println("x is:" + x);
        
        for (int i = 0; i < 100; ++i) {
            if (i < x) {
                System.out.println(i + 1);
                continue;
            }
            else {
                break;
            }
        }

        Scanner scy = new Scanner(System.in);
        System.out.println("please input y:");
        int y = scy.nextInt();
        System.out.println("y is:" + y);
        scx.close();
        scy.close();
    }
}
