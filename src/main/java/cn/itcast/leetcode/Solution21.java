package cn.itcast.leetcode;

/**
 * Created by Yafei Zhang
 * on 2018-12-10 21:55
 */
public class Solution21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        ListNode temp;
        if (l1.val <= l2.val){
            temp = l1;
            temp.next = mergeTwoLists(l1.next,l2);
        }else{
            temp = l2;
            temp.next = mergeTwoLists(l1,l2.next);
        }
        return temp;
    }


    public static void main(String[] args) {
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        ListNode l21 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l11.next = l12;
        l12.next = l13;
        l13.next = null;

        l21.next = l22;
        l22.next = l23;
        l23.next = null;

        ListNode listNode = mergeTwoLists(l11, l21);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
        System.out.println(listNode.next.next.next.val);
        System.out.println(listNode.next.next.next.next.val);
        System.out.println(listNode.next.next.next.next.next.val);

    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}
