package cn.itcast;

import java.util.*;

/**
 * Created by Yafei Zhang
 * on 2018-11-27 21:46
 */
public class Test {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len == 0)
            return 0;
        if(len == 1)
            return 1;
        int start = 0,end = 0;
        int res = 0;
        HashSet<Character> set = new HashSet<Character>();
        while(start < len && end < len){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }else{
                set.add(s.charAt(end++));
                res = (end - start) > res?(end - start):res;
            }
        }
        return res;
    }

    public int reverse(int x) {
        if(x < 10 || x > -10)
            return x;
        int num = x > 0?x:-1*x;
        int res = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        while(num/10 != 0){
            q.add(num%10);
            num = num /10;
        }
        q.add(num);
        while(!q.isEmpty()){
            res = 10 * res + q.poll();
        }
        return x>0?res:-1*res;
    }
    public int myAtoi(String str) {
        if(str.length() == 0)
            return 0;
        int index = 0,sign = 1;
        long sum = 0;
        int len = str.length();
        while((str.charAt(index) == ' ') && (index < len)){
            index++;
            if (index == len)
                return 0;
        }
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+'?1:-1;
            index++;
        }
        while(index < str.length()){
            int dig = str.charAt(index) - '0';
            if(dig < 0 || dig > 9)
                break;
            sum = sum*10 + dig;
            if (sign*sum > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if (sign*sum < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            index++;
        }
        return (int)(sign*sum);

    }
    public static void main(String[] args) {
        Test test = new Test();
        String s = "9223372036854775808";
        System.out.println(test.myAtoi(s));

    }



}
