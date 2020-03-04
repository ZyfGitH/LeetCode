package cn.itcast.produceconsumer;

import java.util.LinkedList;

/**
 * Created by Yafei Zhang
 * on 2018-10-10 14:59
 */
public class TickPool {
    private LinkedList<Integer> pool = new LinkedList<Integer>();
    private int MAX = 100;
    public synchronized int add(Integer i){
        while (pool.size() >= MAX){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pool.add(i);
        notifyAll();
        return i;
    }

    public synchronized int remove(){
        while (pool.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Integer i = pool.removeFirst();
        notifyAll();
        return i;
    }
}
