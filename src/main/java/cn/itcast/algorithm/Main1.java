package cn.itcast.algorithm;

/**
 * Created by Yafei Zhang
 * on 2019-03-09 19:48
 */
public class Main1 {
    public int getMain(int n, int m){
        if (m > n)
            return -1;
        if (m == 0 || m ==n)
            return 1;
        int x1 = getMultify(n,m);
        int x2 = getMultify(m,1);
        return 2*x1/x2;
    }
    public int getMultify(int n,int m){
        if (n == m)
            return n;
        return n*getMultify(n-1,m);
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        System.out.println(main1.getMain(3,3));
    }
}
