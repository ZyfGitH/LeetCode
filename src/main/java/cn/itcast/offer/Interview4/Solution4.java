package cn.itcast.offer.Interview4;

/**
 * Created by Yafei Zhang
 * on 2018-11-29 18:57
 */
public class Solution4 {
    public static String replaceSpace(String str){
        if (str == null || str.length() == 0){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == ' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
    public static String replaceSpace1(char[] chars,int length){
        if (chars == null || chars.length <= 0){
            return null;
        }
        int count = 0;
        for (char c:chars){
            if (c == ' ')
                count++;
        }
        int newLength = length + count * 2;
        int i = length - 1;
        int j = newLength - 1;
        while (i >= 0 && j >= i){
            if (chars[i] == ' '){
                chars[j--] = '0';
                chars[j--] = '2';
                chars[j--] = '%';
            }else {
                chars[j--] = chars[i];
            }
            i--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "we are family";
        int length = str.length();
        char[] oldChars = str.toCharArray();
        char[] chars = new char[100];
        for (int i = 0; i<oldChars.length; i++){
            chars[i] = oldChars[i];
        }
        String s = replaceSpace1(chars,length);
        System.out.println(s);
    }
}
