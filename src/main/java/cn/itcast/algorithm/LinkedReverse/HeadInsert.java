package cn.itcast.algorithm.LinkedReverse;

/**
 * Created by Yafei Zhang
 * on 2019-04-04 10:49
 */
public class HeadInsert {
    public ListNode LinkedReverse(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode p = null;
        ListNode temp = p;
        while (head != null){
            ListNode next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        return temp;
    }
}
