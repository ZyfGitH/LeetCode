package cn.itcast.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by Yafei Zhang
 * on 2018-12-11 22:00
 */
public class Solution26 {
    public static int removeDuplicates(int[] nums){
        if (nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int j = 0;
        for (int i = 0; i < nums.length -1; i++){
            if (nums[i] < nums[i+1]){
                nums[++j] = nums[i+1];
            }
        }
        for (int i:nums){
            System.out.println(i);
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }
}
