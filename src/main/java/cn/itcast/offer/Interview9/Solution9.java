package cn.itcast.offer.Interview9;

/**
 * Created by Yafei Zhang
 * on 2018-12-11 21:52
 */
public class Solution9 {
    public static int Fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int f0 = 0;
        int f1 = 1;
        for (int i = 2; i <= n; i++){
            f1 += f0;
            f0 = f1 - f0;
        }
        return f1;
    }

    public static void main(String[] args) {
        int fibonacci = Fibonacci(8);
        System.out.println(fibonacci);
    }
}
