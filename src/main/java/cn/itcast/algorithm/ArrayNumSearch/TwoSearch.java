package cn.itcast.algorithm.ArrayNumSearch;

import java.util.HashMap;

/**
 * Created by Yafei Zhang
 * on 2019-04-04 10:58
 * 找出一个数组中两个数相加等于target的索引
 */

public class TwoSearch {
    public int[] TwoSum(int[] nums, int target){
        int[] res = new int[2];
        if (nums.length == 0)
            return res;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                res[0] = map.get(nums[i]);
                res[1] = i;
                return res;
            }else {
                map.put(target - nums[i],i);
            }
        }
        return res;
    }
}
