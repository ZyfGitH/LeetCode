package cn.itcast.offer.Interview10;

/**
 * Created by Yafei Zhang
 * on 2018-12-12 19:54
 */
public class Solution10 {
    public static int NumberOf1(int n){
        int count = 0;
        while (n != 0){
            ++count;
            n = (n-1)&n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(-2));
    }
}
