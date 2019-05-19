package cn.itcast;

import java.util.*;

/**
 * Created by Yafei Zhang
 * on 2018-11-27 21:46
 */
public class Test {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        int start = 0, end = nums.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start) /2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else
                start = mid + 1;
        }
        return start;
        // if(start < nums.length && nums[start] == target)
        //     return start;
        // else{
        //     return start - 1;
        // }
    }

    public void printNumber(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[][] nums = new int[][]{{1,3,5,6},{1,3,5,6}};
        test.printNumber(nums[2]);
//        int search = test.searchInsert(nums, 2);
//        System.out.println(search);

    }

}
