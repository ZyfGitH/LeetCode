package cn.itcast.sort;

/**
 * Created by Yafei Zhang
 * on 2019-03-27 16:18
 */
public class QuitSort {
    public static int[] sort(int[] nums){
        int len = nums.length;
        return quitSort(nums,0,len-1);
    }
    public static int[] quitSort(int[] nums, int start, int end){
        if(start < 0 || start > end || end >= nums.length)
            return null;
        int p = partition(nums,start,end);
        if (p > start)
            quitSort(nums,start,p);
        if (p < end)
            quitSort(nums,p+1,end);
        return nums;
    }
    
    public static int partition(int[] nums, int start, int end){
        int first = nums[start];
        int i = start,j = end;
        while (i < j){
            while (nums[j] > first && j >= start){
                j--;
            }
            while (nums[i] <= first && i <= end)
                i++;
            if (i < j)
                swap(nums,i,j);
        }
        if (j != start)
            swap(nums,j,start);
        return j;
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }


    public static void main(String[] args) {
        int[] nums = {87,45,78,32,17,65,53,9,122,133};
        int[] sort = sort(nums);
        for (int i:sort){
            System.out.print(i + " ");
        }
    }

}
