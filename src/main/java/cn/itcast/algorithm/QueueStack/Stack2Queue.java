package cn.itcast.algorithm.QueueStack;

import java.util.Stack;

/**
 * Created by Yafei Zhang
 * on 2019-04-02 21:32
 */
public class Stack2Queue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node){
        stack1.push(node);
    }
    public int pop(){
        if (stack2.empty()){
            if (stack1.empty())
                throw new RuntimeException("Queue is empty!");
            else
                while (!stack1.empty())
                    stack2.push(stack1.pop());
            return stack2.pop();
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        Stack2Queue queue = new Stack2Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
    }
}
