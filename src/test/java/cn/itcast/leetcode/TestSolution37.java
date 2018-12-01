package cn.itcast.leetcode;

import org.junit.Test;

/**
 * Created by Yafei Zhang
 * on 2018-11-28 16:01
 */
public class TestSolution37 {
    @Test
    public void test1(){
        Solution7 intreverse = new Solution7();
        int reverse = intreverse.reverse(-1391739232);
        System.out.println(reverse);
    }

    @Test
    public void test2(){
        int x = -123;
        String[] split = String.valueOf(x).split("");
        for (String i:split){
            System.out.println(i);
        }
    }

    @Test
    public void test3(){
        Solution9 solution9 = new Solution9();
        boolean palindrome = solution9.isPalindrome(121);
        System.out.println(palindrome);
    }
}
