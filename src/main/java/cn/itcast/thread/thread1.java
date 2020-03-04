package cn.itcast.thread;

/**
 * Created by Yafei Zhang
 * on 2019-08-29 16:07
 */
public class thread1 extends Thread {
    private Server server;
    private int[] nums;

    public thread1(Server server,int[] nums) {
        this.server = server;
        this.nums = nums;
    }

    @Override
    public void run() {
        for (int i = 0; i < nums.length; i = i + 2){
            server.getNum1(i);
        }

    }
}
