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
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x>=0 && x <10)
            return true;
        String s = x + "";
        StringBuffer sb1 = new StringBuffer();
        for(int i = 0; i < s.length(); i++){
            sb1.append(s.charAt(i));
        }
        String s2 = sb1.reverse().toString();
        if(s.equals(s2))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        System.out.println(main1.isPalindrome(121));

    }
}
