package cn.itcast.algorithm.ArrayNumSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yafei Zhang
 * on 2019-05-18 20:59
 */
public class RandomReplySearch {
    public List<List<Integer>> randomReplySearch(int[] nums, int target){
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (nums.length == 0){
            return res;
        }
        Arrays.sort(nums);
        findList(nums,target,res,list,0);
        return res;
    }

    private void findList(int[] nums, int target, ArrayList<List<Integer>> res, ArrayList<Integer> list, int index) {
        if (target == 0)
            res.add(list);
        if (target < nums[0])
            return;
        for (int i = index; i < nums.length && target >= nums[i]; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>(list);
            temp.add(nums[i]);
            findList(nums,target-nums[i],res,temp,i);
        }
    }

    public static void main(String[] args) {
        RandomReplySearch randomReplySearch = new RandomReplySearch();
        int[] nums = new int[]{2,3,5,8};
        System.out.println(randomReplySearch.randomReplySearch(nums,8));
    }
}
