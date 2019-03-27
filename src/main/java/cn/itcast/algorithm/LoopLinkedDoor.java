package cn.itcast.algorithm;

/**
 * Created by Yafei Zhang
 * on 2019-03-08 16:56
 */

/**
 * 输入一个链表，链表包括环，找出环的入口节点
 * 解题思路：
 * 1）定义两个指针，一个指向root.next，另一个指向root.next.next
 * 2）循环，如果两个指针相等，则把第二个指针指向root
 * 3）然后两个指针一步步往下走，直到两个指针相等，即是环的入口
 */
//public class ListNode{
//    int val;
//
//    ListNode(int val){
//        this.val = val;
//    }
//}
public class LoopLinkedDoor {
    public ListNode EntryNodeOfLoop(ListNode root){
        if(root == null || root.next == null){
            return null;
        }
        ListNode p1 = root;
        ListNode p2 = root;
        while(p2 != null && p2.next != null ){
            p1 = p1.next;
            p2 = p2.next.next;
            if(p1 == p2){
                p2 = root;
                while(p1 != p2){
                    p1 = p1.next;
                    p2 = p2.next;
                }
                if(p1 == p2 )
                    return p2;
            }
        }
        return null;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}