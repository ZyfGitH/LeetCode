package cn.itcast.leetcode;

import java.util.Stack;

/**
 * Created by Yafei Zhang
 * on 2018-12-10 21:23
 */
public class Solution20 {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char c:chars){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if (stack.isEmpty())
                    return false;
                if (c == ')' && stack.pop() != '(')
                    return false;
                if (c == ']' && stack.pop() != '[')
                    return false;
                if (c == '}' && stack.pop() != '{')
                    return false;
                if (c == ' ')
                    continue;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "{( )}";
        boolean valid = isValid(s);
        System.out.println(valid);
    }
}
