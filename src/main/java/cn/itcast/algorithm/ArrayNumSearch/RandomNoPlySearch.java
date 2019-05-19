package cn.itcast.algorithm.ArrayNumSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yafei Zhang
 * on 2019-05-18 21:11
 */
public class RandomNoPlySearch {
    public List<List<Integer>> randomNoPlySearch(int[] nums, int target){
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (nums.length == 0)
            return res;
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
            if (i > index && nums[i] == nums[i-1])
                continue;
            ArrayList<Integer> temp = new ArrayList<Integer>(list);
            temp.add(nums[i]);
            findList(nums,target-nums[i],res,temp,i+1);
        }
    }

    public static void main(String[] args) {
        RandomNoPlySearch randomNoPlySearch = new RandomNoPlySearch();
        int[] nums = new int[]{10,1,2,7,6,1,5};
        System.out.println(randomNoPlySearch.randomNoPlySearch(nums,8));
    }
}
