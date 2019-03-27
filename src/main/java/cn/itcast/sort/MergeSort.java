package cn.itcast.sort;

/**
 * Created by Yafei Zhang
 * on 2019-03-27 15:43
 */
public class MergeSort {
    public int[] sort(int[] nums){
        int len = nums.length;
        return partAndMerge(nums,0,len-1);
    }
    public static int[] partAndMerge(int[] nums,int start, int end){
        int mid = (start + end)/2;
        if (start < end){
            partAndMerge(nums,start,mid);
            partAndMerge(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
        return nums;
    }
    public static void merge(int[] nums, int start, int mid, int end){
        int[] array = new int[end - start + 1];
        int x = 0;
        int i = start,j = mid + 1;
        while (i <= mid && j <= end){
            if (nums[i] < nums[j]){
                array[x++] = nums[i++];
            }else
                array[x++] = nums[j++];
        }
        while (i <= mid)
            array[x++] = nums[i++];
        while (j <= end)
            array[x++] = nums[j++];
        for (int m = 0; m < array.length; m++)
            nums[start + m] = array[m];
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] nums = {87,45,78,32,17,65,53,9,122,133};
        for (int i:mergeSort.sort(nums)){
            System.out.println(i);
        }
    }

}
