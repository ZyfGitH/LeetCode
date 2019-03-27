package cn.itcast.sort;

/**
 * Created by Yafei Zhang
 * on 2019-03-27 15:25
 */
public class ShellSort {
    public int[] sort(int[] nums){
        int len = nums.length;
        int grap = len/2;
        while (grap > 0){
            for (int i = grap; i < len; i++){
                int current = nums[i];
                int preIndex = i - grap;
                while (preIndex >= 0 && current < nums[preIndex]){
                    nums[preIndex+grap] = nums[preIndex];
                    preIndex -= grap;
                }
                nums[preIndex+grap] = current;
            }
            grap = grap/2;
        }
        return nums;
    }

    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        int[] nums = {87,45,78,32,17,65,53,9,122,133};
        for (int i:shellSort.sort(nums)){
            System.out.println(i);
        }
    }
}
