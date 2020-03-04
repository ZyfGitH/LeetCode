package cn.itcast.produceconsumer;

/**
 * Created by Yafei Zhang
 * on 2018-10-10 14:58
 */
public class Consumer extends Thread {
    private String name ;
    private TickPool tickPool;

    public Consumer(String name, TickPool tickPool) {
        super();
        this.name = name;
        this.tickPool = tickPool;
    }

    public void run() {
        while (true) {
            int i = tickPool.remove();
            System.out.println(name + ":remove:" + i);
        }
    }
}
