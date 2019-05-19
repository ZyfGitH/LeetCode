package cn.itcast.algorithm.LinkedReverse;

import java.util.Stack;

/**
 * Created by Yafei Zhang
 * on 2019-04-04 10:45
 */
public class StackHead {
    public ListNode LinkedReverse(ListNode head){
        if (head == null || head.next == null)
            return head;
        Stack<ListNode> stack = new Stack<ListNode>();
        while (head != null){
            stack.push(head);
            head = head.next;
        }
        ListNode p = stack.pop();
        ListNode temp = p;
        while (!stack.empty()){
            temp.next = stack.pop();
            temp = temp.next;
        }
        p.next = null;
        return p;
    }
}
