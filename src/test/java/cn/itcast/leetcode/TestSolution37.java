package cn.itcast.leetcode;

import org.junit.Test;

import java.util.Stack;

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

    @Test
    public void test4(){
        String s = "zhang";
        System.out.println(s.length());
        System.out.println(s.toCharArray().length);
    }

    @Test
    public void test5(){
        System.out.println(5&0x1);
    }

//    @Test
//    public void test6(){
//        Stack<> ints = new Stack<integer>();
//        ints.push(2);
//    }
}
