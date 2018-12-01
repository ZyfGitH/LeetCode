package cn.itcast.leetcode;

/**
 * Created by Yafei Zhang
 * on 2018-11-28 16:14
 */

/**
 * 字符相等，使用==是值和内存地址都相同，这里不能使用，equal是值相等
 */
public class Solution9 {
    public boolean isPalindrome(int x){
        if (x<0 || (x>0&&x%10==0))
            return false;
        if (x/10 == 0)
            return true;
        String[] s = String.valueOf(x).split("");
        int length = s.length;
        for (int i = 0;i<length/2;i++){
            if (!s[i].equals(s[length-i-1])) {
                return false;
            }
        }
        return true;
    }
}
