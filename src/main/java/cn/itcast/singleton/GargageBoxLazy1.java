package cn.itcast.singleton;

/**
 * Created by Yafei Zhang
 * on 2018-11-28 15:17
 */

/**
 * 懒汉式
 * 优点：支持多线程，只有访问时候调用，减少内存的使用率
 * 缺点：需要两次的判断，复杂且容易出错
 * 优化：使用饿汉式
 */
public class GargageBoxLazy1 {
    private static GargageBoxLazy1 instance;
    public static GargageBoxLazy1 getInstance(){
        if (instance == null){
            synchronized (GargageBoxLazy1.class){
                if (instance == null){
                    instance = new GargageBoxLazy1();
                }
            }
        }
        return instance;
    }
    private GargageBoxLazy1(){}
}
