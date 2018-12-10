package cn.itcast.utils.search;

/**
 * Created by Yafei Zhang
 * on 2018-12-10 19:45
 */
public class BiSearch {
    //非递归模式
    public static int search1(int[] array,int a){
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high){
            mid = (low + high) / 2;
            if (array[mid] == a){
                return mid+1;
            }else if (array[mid] > a){
                high = mid -1;
            }else
                low = mid + 1;
        }
        return -1;
    }

    //递归形式
    public static int search2(int[] array,int a, int low, int high){
        if (low <= high){
            int mid = (low + high) /2;
            if (array[mid] == a) {
                return mid + 1;
            } else if (array[mid] > a) {
                return search2(array, a, low, mid - 1);
            }else {
                return search2(array, a, mid + 1, high);
            }
        }
        return -1;
    }

    //查找第一个元素出现的位置（允许元素重复）
    public static int search3(int[] array, int a){
        int low = 0;
        int high = array.length - 1;
        while (low < high){
            int mid = (low + high)/2;
            if (a > array[mid]){
                low = mid + 1;
            }else {
                high = mid;
            }
        }
        if (array[low] != a){
            return -1;
        }else
            return low + 1;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5,8,9};
        int i = search1(array, 8);
        System.out.println(i);
        System.out.println(search2(array,8,0,array.length-1));
        System.out.println(search3(array,5));
    }
}
