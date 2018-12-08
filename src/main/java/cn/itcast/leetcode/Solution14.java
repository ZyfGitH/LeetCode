package cn.itcast.leetcode;

/**
 * Created by Yafei Zhang
 * on 2018-12-08 21:21
 */
public class Solution14 {
    public static String longestCommonPrefix(String[] strs){
        String s = "";
        int judge = 1;
        if (strs.length == 0){
            return s;
        }
        for (int i = 0; i < strs[0].length(); i++){
            char a = strs[0].charAt(i);

            for (int j = 0; j < strs.length;j++){
                if (i >= strs[j].length()){
                    judge = 0;
                    break;
                }
                if (a != strs[j].charAt(i)){
                    judge = 0;
                    break;
                }else {
                    if (j == strs.length -1){
                        s = s + a;
                    }
                }
            }
            if (judge == 0){
                break;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String[] strings = {"aa","a"};
        String s = longestCommonPrefix(strings);
        System.out.println(s);
    }
}
