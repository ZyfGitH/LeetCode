package cn.itcast.sort;

/**
 * Created by Yafei Zhang
 * on 2019-03-27 15:21
 */
public class InsertSort {
    public int[] sort(int[] nums){
        int len = nums.length;
        for (int i = 0; i < len - 1; i++){
            int current = nums[i+1];
            int preIndex = i;
            while (preIndex >=0 && current < nums[preIndex]){
                nums[preIndex+1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex + 1] = current;
        }
        return nums;
    }

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int[] nums = {87,45,78,32,17,65,53,9,122,133};
        for (int i:insertSort.sort(nums)){
            System.out.println(i);
        }
    }
}
