package cn.itcast.sort;

/**
 * Created by Yafei Zhang
 * on 2019-03-27 15:08
 */
public class BubbleSort {
    public int[] sort(int[] nums){
        int len = nums.length;
        boolean flag = true;
        for (int i = 0; i < len - 1; i++){
            flag = false;
            for (int j = len - 2; j >= i; j--){
                if (nums[j] > nums[j + 1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    flag = true;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = {87,45,78,32,17,65,53,9,122,133};
        for (int i:bubbleSort.sort(nums)){
            System.out.println(i);
        }
    }
}
