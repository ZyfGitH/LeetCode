package cn.itcast.algorithm.LinkedReverse;

import java.util.LinkedHashMap;

/**
 * Created by Yafei Zhang
 * on 2019-04-04 10:37
 */
public class Callback {
    public ListNode LinkedReverse(ListNode head){
        if (head == null || head.next == null)
            return head;
        else {
            ListNode node = LinkedReverse(head.next);
            head.next.next = head;
            head.next = null;
            return node;
        }
    }
}
