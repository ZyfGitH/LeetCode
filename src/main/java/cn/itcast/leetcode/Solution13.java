package cn.itcast.leetcode;

/**
 * Created by Yafei Zhang
 * on 2018-11-28 16:45
 */
public class Solution13 {
    public static int romanToInt(String s){
        int num = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            switch (chars[i]){
                case 'I':
                    if (i < chars.length -1 && (chars[i+1] == 'V' || chars[i+1] == 'X')){
                        num -= 1;
                    }else
                        num += 1;
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if (i < chars.length -1 && (chars[i+1] == 'L' || chars[i+1] == 'C'))
                        num -= 10;
                    else
                        num += 10;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if (i < chars.length -1 && (chars[i+1] == 'D' || chars[i+1] == 'M'))
                        num -= 100;
                    else
                        num += 100;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
            }

        }
        return num;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        int i = romanToInt(s);
        System.out.println(i);

    }
}
