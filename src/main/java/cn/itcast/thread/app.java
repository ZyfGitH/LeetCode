package cn.itcast.thread;

/**
 * Created by Yafei Zhang
 * on 2019-08-29 16:09
 */
public class app {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        Server server = new Server(nums);
        thread1 thread1 = new thread1(server,nums);
        thread2 thread2 = new thread2(server,nums);
        thread1.start();
        thread2.start();
    }
}
