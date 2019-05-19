package cn.itcast.algorithm.LinkedReverse;

/**
 * Created by Yafei Zhang
 * on 2019-04-04 10:53
 */
public class ThreePos {
    public ListNode LinkedReverse(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode pre = null;
        while (head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
