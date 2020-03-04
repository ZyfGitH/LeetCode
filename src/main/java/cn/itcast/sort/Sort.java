package cn.itcast.sort;

import java.util.Arrays;




/**
 * Created by Yafei Zhang
 * on 2019-10-14 19:58
 */
public class Sort {
    private static int[] bubbleSort(int[] nums){
        if (nums.length < 2)
            return nums;
        boolean flag = true;
        for (int i = 0; i < nums.length-1 && flag; i++){
            flag = false;
            for (int j = nums.length - 2; j >= i; j--){
                if (nums[j] > nums[j+1]){
                    swap(nums,j,j+1);
                    flag = true;
                }
            }
        }
        return nums;
    }

    private static int[] selectSort(int[] nums){
        if (nums.length < 2)
            return nums;
        int min;
        for (int i = 0; i < nums.length -1; i++){
            min = i;
            for (int j = i; j < nums.length; j++){
                if (nums[j] < nums[min])
                    min = j;
            }
            swap(nums,min,i);
        }
        return nums;
    }

    private static int[] insertSort(int[] nums){
        if (nums.length < 2)
            return nums;
        int current, preIndex;
        for (int i = 0; i < nums.length -1; i++){
            current = nums[i+1];
            preIndex = i;
            while (preIndex >= 0 && nums[preIndex] > current){
                nums[preIndex+1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex + 1] = current;
        }
        return nums;
    }

    private static int[] shellSort(int[] nums){
        if (nums.length < 2)
            return nums;
        int grap = nums.length/2;
        int current, preIndex;
        while (grap > 0){
            for (int i = grap; i < nums.length; i++){
                current = nums[i];
                preIndex = i - grap;
                while (preIndex >= 0 && nums[preIndex] > current){
                    nums[preIndex+grap] = nums[preIndex];
                    preIndex -= grap;
                }
                nums[preIndex+grap] = current;
            }
        }
        return nums;
    }

    private static int[] mergeSort(int[] nums){
        if (nums.length < 2)
            return nums;
        int mid = nums.length/2;
        int[] left = Arrays.copyOfRange(nums,0,mid);
        int[] right = Arrays.copyOfRange(nums,mid+1,nums.length-1);
        return merge(mergeSort(left),mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if (left[i] < right[j])
                res[k++] = left[i++];
            else
                res[k++] = right[j++];
        }
        while (i < left.length)
            res[k++] = left[i++];
        while (j < right.length)
            res[k++] = right[j++];
        return res;
    }

    private static int[] quitSort(int[] nums){
        if (nums.length < 2)
            return nums;
        return sort(nums,0,nums.length-1);
    }

    private static int[] sort(int[] nums, int start, int end) {
        if (start < 0 || start > end || end > nums.length-1)
            return  null;
        int p = partition(nums,start,end);
        if (p > start)
            sort(nums,start,p);
        if (p < end)
            sort(nums,p+1,end);
        return nums;
    }

    private static int partition(int[] nums, int start, int end){
        int pivot = nums[start];
        int i = start, j = end;
        while (i < j){
            while (nums[j] > pivot && j >= start)
                j--;
            while (nums[i] < pivot && i < end)
                i++;
            if (i < j)
                swap(nums,i,j);
        }
        if (j != start)
            swap(nums,j,start);
        return j;
    }

    private static int[] heapSort(int[] nums){
        if (nums.length < 2)
            return nums;
        int[] maxHeap = builderMaxHead(nums);
        for (int i = maxHeap.length-1; i >= 0; i--){
            swap(maxHeap,i,0);
            adjustMax(maxHeap,0,i);
        }
        return nums;
    }
 
    private static int[] builderMaxHead(int[] nums) {
        for (int i = (nums.length-2)/2; i >= 0; i--){
            adjustMax(nums,i,nums.length);
        }
        return nums;
    }

    private static void adjustMax(int[] nums, int k, int length) {
        int temp = nums[k];
        for (int i = 2*k+1; i < length; i = 2*i+1){
            if ((i+1)<length && nums[i+1] > nums[i])
                i++;
            if (nums[i] < temp)
                break;
            else {
                nums[k] = nums[i];
                k = i;
            }
        }
        nums[k] = temp;
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
