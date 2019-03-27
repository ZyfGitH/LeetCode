package cn.itcast.offer.Interview12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yafei Zhang
 * on 2019-03-05 10:36
 */
public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0)
            return 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        int cur = array[0],max = array[0];
        for(int i = 1; i < array.length; i++){
            if(cur > 0){
                cur += array[i];
                list.add(array[i - 1]);
            }else{
                cur = array[i];
            }
            if(cur > max)
                max = cur;
        }
        System.out.println(list);
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{6,-3,-2,7,-15,1,2,2};
        int max = solution.FindGreatestSumOfSubArray(array);
        System.out.println(max);
    }
}
