package cn.itcast;

/**
 * Created by Yafei Zhang
 * on 2019-08-28 14:35
 */
public interface inter {
    String name = "zhangyafei";
    int getNum();
    static String getName(){
        return name;
    }
    default int getNumber(){
        return 2;
    }

}
abstract class test extends A{
    abstract void f();
}
