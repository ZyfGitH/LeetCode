package cn.itcast.leetcode;

/**
 * Created by Yafei Zhang
 * on 2018-11-28 15:49
 */
/**
 * 7
 */
public class Solution7 {
    public int reverse(int x){
        boolean flag = x>0?true:false;
        long sum = 0;
        x = Math.abs(x);
        int gewei = x%10;
        while (x != 0){
            x = x/10;
            sum = sum * 10 + gewei;
            gewei = x%10;
        }
        if ((sum > (Math.pow(2,31) - 1)) || (sum < (-1)*(Math.pow(2,31))))
            return 0;
        return flag?(int)sum:(int)(0-sum);
    }
}
