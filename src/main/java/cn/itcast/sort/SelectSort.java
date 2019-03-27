package cn.itcast.sort;

/**
 * Created by Yafei Zhang
 * on 2019-03-27 15:14
 */
public class SelectSort {
    public int[] sort(int[] nums){
        int len = nums.length;
        int min;
        for (int i = 0; i < len - 1; i++){
            min = i;
            for(int j = i + 1; j < len; j++){
                if (nums[j] < nums[min])
                    min = j;
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int[] nums = {87,45,78,32,17,65,53,9,122,133};
        for (int i:selectSort.sort(nums)){
            System.out.println(i);
        }
    }
}
