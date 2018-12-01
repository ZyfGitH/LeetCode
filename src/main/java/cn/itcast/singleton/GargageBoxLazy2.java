package cn.itcast.singleton;

/**
 * Created by Yafei Zhang
 * on 2018-11-28 15:17
 */

/**
 * 饿汉式
 * 优点：减少懒汉式的复杂的双重判断，使用方便
 * 缺点：类初始化的时候就被创建，没有懒汉式的使用时创建的优点，降低了内存的使用率
 * 优化：使用静态内部类
 */
public class GargageBoxLazy2 {
    private static GargageBoxLazy2 instance = new GargageBoxLazy2();
    public static GargageBoxLazy2 getInstance(){
        return instance;
    }
    private GargageBoxLazy2(){}
}
