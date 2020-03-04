package cn.itcast.sort;

/**
 * Created by Yafei Zhang
 * on 2019-03-27 14:37
 * 时间复杂度nlog(n)
 */
public class HeapSort {
    public static int[] buildMaxHeap(int[] nums){
        int len = nums.length;
        for (int i = (len - 2)/2;i >= 0; i--){
            HeapAdjust(nums,i,len);
        }
        return nums;
    }

    public static void HeapAdjust(int[] nums, int k, int length){
        int temp = nums[k];
        for (int i = 2*k + 1; i < length; i = 2*i+1){
            if ((i+1) < length && nums[i] < nums[i+1])
                i++;
            if (temp > nums[i])
                break;
            else {
                nums[k] = nums[i];
                k = i;
            }
        }
        nums[k] = temp;
    }



    public int[] sort(int[] nums){
        int len = nums.length;
        int[] maxHeap = buildMaxHeap(nums);
        for (int i = len-1; i > 0; i--){
            int temp = maxHeap[i];
            maxHeap[i] = maxHeap[0];
            maxHeap[0] = temp;
            HeapAdjust(maxHeap,0,i);
        }
        return maxHeap;
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] nums = new int[]{87,45,78,32,17,65,53,9,122,133};
        for (int i:heapSort.sort(nums))
            System.out.println(i);
    }
}
