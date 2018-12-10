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
        for (int i = 1;i < array.length -1; i++){
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static void main(String[] args) {
//        int[] array = {3,4,5,1,2};
//        int[] array = {1,2,3,4,5};
        int[] array = {1,1,1,0,1};
        int i = minElement(array);
        System.out.println(i);
    }
}
