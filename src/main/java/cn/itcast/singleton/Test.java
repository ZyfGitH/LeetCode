package cn.itcast.singleton;

/**
 * Created by Yafei Zhang
 * on 2018-11-28 15:22
 */
public class Test {
    public static void main(String[] args) {
        GargageBoxLazy1 instance = GargageBoxLazy1.getInstance();
        GargageBoxLazy2 instance1 = GargageBoxLazy2.getInstance();
//        GargageBoxLazy1 gargageBoxLazy1 = new GargageBoxLazy1();
//        System.out.println(gargageBoxLazy1);
    }
}
