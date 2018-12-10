package cn.itcast.offer.Interview7;

import java.util.Stack;

/**
 * Created by Yafei Zhang
 * on 2018-12-10 18:36
 */
public class Solution7 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        if (stack1.isEmpty() && stack2.isEmpty()){
            throw new RuntimeException("Quene is empty!");
        }
        int node;
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                node = stack1.pop();
                stack2.push(node);
            }
        }
        return stack2.pop();
    }
}

class test{
    public static void main(String[] args) {
        Solution7 Quene = new Solution7();
        Quene.push(1);
        Quene.push(2);
        Quene.push(3);
        Quene.push(4);
        Quene.push(5);
        System.out.println(Quene.pop());
        System.out.println(Quene.pop());
        System.out.println(Quene.pop());
        System.out.println(Quene.pop());
        System.out.println(Quene.pop());
    }
}
