package cn.itcast.offer.Interview5;

import java.util.Stack;

/**
 * Created by Yafei Zhang
 * on 2018-11-29 22:12
 */
public class Solution5 {
    public void printListReverseByStack(ListNode node){
        if (node == null){
            return;
        }
        Stack<ListNode> stack = new Stack<ListNode>();
        while (node != null){
            stack.push(node);
            node = node.next;
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().value);
        }
    }

    public void printListReverseByRecursion(ListNode node){
        if (node ==  null)
            return;
        printListReverseByRecursion(node.next);
        System.out.println(node.value);
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode();
        ListNode listNode2 = new ListNode();
        ListNode listNode3 = new ListNode();
        listNode1.value = 1;
        listNode2.value = 2;
        listNode3.value = 3;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = null;
//        new Solution5().printListReverseByStack(listNode1);
        new Solution5().printListReverseByRecursion(listNode1);
    }
}

class ListNode{
    int value;
    ListNode next;
}
