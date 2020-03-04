package cn.itcast.produceconsumer;

/**
 * Created by Yafei Zhang
 * on 2018-10-10 15:10
 */
public class App {
    public static void main(String[] args) {
        TickPool tickPool = new TickPool();
        Producer p1 = new Producer("p1", tickPool);
        Producer p2 = new Producer("p2",tickPool);
        Consumer c1 = new Consumer("c1", tickPool);
        p1.start();
        p2.start();
        c1.start();
    }
}
