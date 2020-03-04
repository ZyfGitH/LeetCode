package cn.itcast.produceconsumer;

/**
 * Created by Yafei Zhang
 * on 2018-10-10 14:58
 */
public class Producer extends Thread {
    private String name ;
    private static int index = 0;
    private TickPool tickPool;

    public Producer(String name, TickPool tickPool) {
        super();
        this.name = name;
        this.tickPool = tickPool;
    }

    public void run() {
        while (true) {
            int i = tickPool.add(index++);
            System.out.println(name + ":produce:" + i);
        }

    }
}
