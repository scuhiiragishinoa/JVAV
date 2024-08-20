/**
 * # [NOIP2002 普及组] 过河卒
 * ## 题目描述
 * 棋盘上 $A$ 点有一个过河卒，需要走到目标 $B$ 点。卒行走的规则：可以向下、或者向右。
 * 同时在棋盘上 $C$ 点有一个对方的马，该马所在的点和所有跳跃一步可达的点称为对方马的控制点。因此称之为“马拦过河卒”。
 * 棋盘用坐标表示，$A$ 点 $(0, 0)$、$B$ 点 $(n, m)$，同样马的位置坐标是需要给出的。
 * ![](https://cdn.luogu.com.cn/upload/image_hosting/ipmwl52i.png)
 * 现在要求你计算出卒从 $A$ 点能够到达 $B$ 点的路径的条数，假设马的位置是固定不动的，并不是卒走一步马走一步。
 * ## 输入格式
 * 一行四个正整数，分别表示 $B$ 点坐标和马的坐标。
 * ## 输出格式
 * 一个整数，表示所有的路径条数。
 * ## 样例 #1
 * ### 样例输入 #1
 * ```
 * 6 6 3 3
 * ```
 * ### 样例输出 #1
 * ```
 * 6
 * ```
 */
package test;
import java.util.Scanner;

public class SoldierPassRiver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        boolean [][]enable = new boolean[a][b];
        int [][] board = new int[a][b];
        board[0][0] = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                enable[i][j] = false;
            }
        }
        enable[c][d] = true;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (enable[i][j]) {
                    enable[i+1][j+2] = true;
                    enable[i+1][j-2] = true;
                    enable[i+2][j+1] = true;
                    enable[i+2][j-1] = true;
                    enable[i-1][j+2] = true;
                    enable[i-1][j-2] = true;
                    enable[i-2][j+1] = true;
                    enable[i-2][j-1] = true;
                }
            }
        }
        enable[c][d] = false;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (!enable[i][j]) {
                    board[i][j] = 0;
                }
            }

        }
    }
}