package cn.itcast.offer.Interview8;

/**
 * Created by Yafei Zhang
 * on 2018-12-10 20:32
 */
public class Solution8 {
    public static int minElement(int[] array){
        if (array.length == 0)
            return 0;
        int left = 0;
        int right = array.length - 1;
        int mid = left;
        while (array[left] >= array[right]){
            if (right - left == 1)
                break;
            mid = (left + right) / 2;
            if (array[left] == array[mid] && array[mid] == array[right])
                return minFromSortSearch(array);
            else if (array[mid] > array[left]){
                left = mid;
            }else
                right = mid;
        }
        return array[mid];
    }

    private static int minFromSortSearch(int[] array) {
        int min = array[0];
        for (int i = 1;i < array.length ; i++){
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }




    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0)
            return 0;
        int left = 0;
        int right = array.length -1;
        int mid;
        while(left < right){
            mid = left + (right - left) / 2;
            if(array[mid] > array[right]){
                left = mid + 1;
            }else if(array[mid] == array[right]){
                right = right -1;
            }else
                right = mid;
        }
        return array[left];
    }

    public static void main(String[] args) {
//        int[] array = {3,4,5,0,1,2};
        int[] array = {2,2,3,4,5,6,6};
//        int[] array = {1,1,1,0,1};
        int i = minElement(array);
        System.out.println(i);
    }
}
