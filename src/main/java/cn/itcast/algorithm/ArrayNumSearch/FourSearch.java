package cn.itcast.algorithm.ArrayNumSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yafei Zhang
 * on 2019-04-04 11:11
 */
public class FourSearch {
    public List<List<Integer>> FourSum(int[] nums){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (nums.length < 4)
            return list;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++){
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            for (int j = i+1; j < nums.length - 1; j++){
                if (j > i + 1 && nums[j] == nums[j-1])
                    continue;
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right){
                    if (nums[i] + nums[j] + nums[left] + nums[right] < 0)
                        left++;
                    else if (nums[i] + nums[j] + nums[left] + nums[right] > 0)
                        right--;
                    else {
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left-1])
                            left++;
                        while (right > left && nums[right] == nums[right+1])
                            right--;
                    }
                }
            }
        }
        return list;
    }
}
