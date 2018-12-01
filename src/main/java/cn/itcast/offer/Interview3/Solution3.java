package cn.itcast.offer.Interview3;

/**
 * Created by Yafei Zhang
 * on 2018-11-29 18:56
 */
public class Solution3 {
    //右上角元素开始
    public boolean find(int[][] array,int target){
        if (array == null)
            return false;
        int rows = array.length;
        int columns = array[0].length;
        int row = 0;
        int column = columns-1;
        while (row < rows && column >= 0){
            if (array[row][column] == target){
                System.out.println(row+","+column);
                return true;
            }
            else if (array[row][column] > target){
                column--;
            }else{
                row++;
            }
        }
        return false;
    }

    //左下角元素开始
    public boolean find1(int[][] array,int target){
        if (array == null){
            return false;
        }
        int rows = array.length;
        int columns = array[0].length;
        int column = 0;
        int row = rows - 1;
        while (row >= 0 && column < columns){
            if (array[row][column] == target){
                System.out.println(row + "," + column);
                return true;
            }
            if (array[row][column] > target){
                row--;
            }
            else {
                column++;
            }
        }
        return false;
    }
}
