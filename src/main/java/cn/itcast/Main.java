package cn.itcast;

/**
 * Created by Yafei Zhang
 * on 2019-03-27 19:10
 */
/**
 * 2
 * 0acbh1nin
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int i = Integer.parseInt(in.nextLine());
            String s = in.nextLine();
            System.out.println(fun(s, i));
            ArrayList arrayList = new ArrayList();
            HashSet<Integer> integers = new HashSet<Integer>();
            HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        }
    }

    public static String fun(String s,int n){
        String res = "";
        for (int i = 0; i < n; i++){
            if ((s.charAt((i*9))+ "")
                    .equals("0")){
                res = res + new
                        StringBuffer(s.substring(
                                9*i+1,9*i+9)).reverse()
                        .toString()+" ";

            }else {
                res = res + s.substring(9*i+1,9*i+9)+" ";
            }
        }
        return res.substring(0,res.length()-1);
    }
}
