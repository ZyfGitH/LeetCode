package cn.itcast.thread;

/**
 * Created by Yafei Zhang
 * on 2019-08-29 16:08
 */
public class thread2 extends Thread{
    private Server server;
    private int[] nums;

    public thread2(Server server, int[] nums) {
        this.server = server;
        this.nums = nums;
    }

    @Override
    public void run() {
        for (int i = 1; i < nums.length; i = i+2)
            server.getNum2(i);
    }
}
