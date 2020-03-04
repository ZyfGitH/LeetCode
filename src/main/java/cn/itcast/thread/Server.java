package cn.itcast.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Yafei Zhang
 * on 2019-08-29 15:50
 */
public class Server {
    private Lock lock = new ReentrantLock();
    private boolean flag = false;
    private Condition condition = lock.newCondition();
    int[] nums = null;

    public Server(int[] nums) {
        this.nums = nums;
    }

    public void getNum1(int i){
        try {
            lock.lock();
            while (flag == true){
                condition.await();
            }
//            if (index1 > nums.length-1)
//                Thread.interrupted();
            System.out.println(nums[i]);
            flag = true;
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }

    public void getNum2(int i){
        try {
            lock.lock();
            while (flag == false)
                condition.await();
//            if (index2 > nums.length - 1)
//                Thread.interrupted();
            System.out.println(nums[i]);
            flag = false;
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
