package cn.itcast.offer.Interview3;

/**
 * Created by Yafei Zhang
 * on 2018-11-29 19:26
 */
public class TestSolution3 {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean b = solution3.find1(array, 100);
        System.out.println(b+","+array.length);
    }
}
