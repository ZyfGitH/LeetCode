package cn.itcast.offer.Interview3;

import cn.itcast.offer.Interview4.Solution4;
import org.junit.Test;

/**
 * Created by Yafei Zhang
 * on 2018-11-29 20:16
 */
public class TestSolution4 {

    public static void main(String[] args) {
        String str = "we are family";
        int length = str.length();
        char[] oldChars = str.toCharArray();
        char[] chars = new char[110];
        for (int i = 0; i<oldChars.length; i++){
            chars[i] = oldChars[i];
        }
        Solution4 solution4 = new Solution4();
        String s = solution4.replaceSpace1(chars,length);
        System.out.println(s);
    }


}
