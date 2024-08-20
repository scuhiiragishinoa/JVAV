/**
 * 
 * # [NOIP1999 提高组] 邮票面值设计
    ## 题目背景
    [关于此类题目的详细内容](https://www.luogu.com.cn/paste/isdgwj5l)

    ## 题目描述
    给定一个信封，最多只允许粘贴 $N$ 张邮票，计算在给定 $K$（$N+K \le 15$）种邮票的情况下（假定所有的邮票数量都足够），
    如何设计邮票的面值，能得到最大值 $\mathsf{MAX}$，使在 $1$ 至 $\mathsf{MAX}$ 之间的每一个邮资值都能得到。
    例如，$N=3$，$K=2$，如果面值分别为 $1$ 分、$4$ 分，则在 $1\sim 6$ 分之间的每一个邮资值都能得到（当然还有 $8$ 分、$9$ 分和 $12$ 分）；
    如果面值分别为 $1$ 分、$3$ 分，则在 $1\sim 7$ 分之间的每一个邮资值都能得到。
    可以验证当 $N=3$，$K=2$ 时，$7$ 分就是可以得到的连续的邮资最大值，所以 $\mathsf{MAX}=7$，面值分别为 $1$ 分、$3$ 分。
    ## 输入格式
    $2$ 个整数，代表 $N$，$K$。
    ## 输出格式
    输出共 $2$ 行。
    第一行输出若干个数字，表示选择的面值，从小到大排序。
    第二行，输出 `MAX=S`，$S$ 表示最大的面值。
    ## 样例 #1
    ### 样例输入 #1
    ```
    3 2
    ```
    ### 样例输出 #1
    ```
    1 3
    MAX=7
    ```
 */
package test;

import java.util.Scanner;
import java.util.Stack;

public class Poststamp {

    public static int findLost(int N, int K, int []saveStr){
        Stack<Integer> stack0 = new Stack<>();
        int i = 0;
        int j = 1;
        int point = 1;
        int flag = 1;
        int time = 0;
        while (true) {
            if (point < saveStr[i + 1] && j < N) {
                j++;
                point+=saveStr[i];
                stack0.push(saveStr[i]);
                continue;
            }

            if (point < saveStr[i + 1] && j == N) {
                return point;
            }

            if (point == saveStr[i + 1] && j < N) {
                flag = stack0.peek();
                while (flag == stack0.peek()) {
                    time++;
                    stack0.pop();
                }
                stack0.push(saveStr[i]);
                j = j - time + 1;
                time = 0;
            }
            
        }

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        Scanner sck = new Scanner(System.in);
        int K = sck.nextInt();
        scn.close();
        sck.close();
        
    }
}


/**K/N/arr
 * 2/3/1,4
 * 1
 * 11
 * 111
 *    4
 *    41
 *    411
 *    4  *4
 *    4   41
 *    4   4 **4 ->6/12
 * 
 * 2/3/1,3
 * 1
 * 11
 *   3
 *   31
 *   311
 *   3  3
 *   3  31
 *   3  3 *3    ->7/9
 * 
 * 2/3/1,2
 * 1
 *  2
 *  21
 *  2 2
 *  2 21
 *  2 2 2       ->6/6
 * 
 * 6/6->7/9->6/12->3/15->3/18   max=arr[k-1]*N-(arr[k-1]-1)*(arr[k-1]-2)
 * 
 * 3/3/1,3,8
 * 1
 * 11
 *   3
 *   31
 *   311
 *   3  3
 *   3  31
 *        8
 *        81
 *        811
 *        8  3
 *        8  31
 *        8  3 *3
 *        8      **8
 *        8      **81
 *        8      **8 *3
 *        8      **8   ****8    ->12/24
 * 
 * 1
 * 11
 *   3
 *   31
 *   311
 *   3  3
 *       7
 *       71
 *       711
 *       7  3
 *       7  31
 *       7  3 *3
 *       7      7
 *       7      71
 *       7      7 *3
 *       7      7   ***7        ->11/21
 * 
 * 1
 * 11
 *   3
 *   31
 *   311
 *      6
 *      61
 *      611
 *      6  3
 *      6  31
 *      6  3 *3                 ->10/21
 * 
 * 
 */