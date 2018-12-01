package cn.itcast.singleton;

/**
 * Created by Yafei Zhang
 * on 2018-11-28 15:17
 */

/**
 * 静态类
 * 优点：和饿汉式一样，但初始化的时候不会被实例化，减少内存的使用率
 */
public class GargageBoxLazy3 {
    private GargageBoxLazy3(){}
    private static class GargageBoxLazy3Holder{
        private final static GargageBoxLazy3 instance=new GargageBoxLazy3();
    }
    public static GargageBoxLazy3 getInstance(){
        return GargageBoxLazy3Holder.instance;
    }

}
