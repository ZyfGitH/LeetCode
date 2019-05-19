package cn.itcast.algorithm.ArrayNumSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yafei Zhang
 * on 2019-04-04 11:03
 */
public class ThreeSearch {
    public List<List<Integer>> ThreeSum(int[] nums){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if (nums.length < 3)
            return list;
        for (int i = 0; i < nums.length - 1; i++){
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                if (nums[i] + nums[left] + nums[right] < 0)
                    left++;
                else if (nums[i] + nums[left] + nums[right] > 0)
                    right--;
                else {
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (right > left && nums[right] == nums[right + 1])
                        right--;
                }
            }
        }
        return list;
    }
}
