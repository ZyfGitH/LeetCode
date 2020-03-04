package cn.itcast;

import java.util.HashMap;

/**
 * Created by Yafei Zhang
 * on 2019-08-28 16:35
 */
public class A {
    String val;

    public A(){};

    public A(String val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public static void main(String[] args) {
        HashMap<A,Integer> map = new HashMap<>();
        A a = new A("a");
        A a1 = new A("a");
        map.put(a,0);
        map.put(a1,1);
        System.out.println(map.size());
    }
}
