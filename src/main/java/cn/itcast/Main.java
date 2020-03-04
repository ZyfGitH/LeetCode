package cn.itcast;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] field = in.nextLine().split(" ");
        int res = 0;
        for (int i = 0; i < field.length; i++){
            res += Integer.parseInt(field[i]);
        }
        System.out.println(res);
    }
}
