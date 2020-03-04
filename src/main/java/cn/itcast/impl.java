package cn.itcast;

/**
 * Created by Yafei Zhang
 * on 2019-08-28 14:37
 */
public class impl implements inter{

    @Override
    public int getNum() {
        return 0;
    }

    @Override
    public int getNumber() {
        return 9;
    }

    public static void main(String[] args) {
        impl impl = new impl();
        int num = impl.getNum();
        String name = inter.getName();
    }
}
