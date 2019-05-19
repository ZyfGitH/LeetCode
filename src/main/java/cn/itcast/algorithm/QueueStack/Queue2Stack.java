package cn.itcast.algorithm.QueueStack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Yafei Zhang
 * on 2019-04-02 21:44
 */
public class Queue2Stack {
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    public void push(int node){
        if (queue1.isEmpty() && queue2.isEmpty()){
            queue1.add(node);
            return;
        }
        if (queue1.isEmpty()){
            queue2.add(node);
            return;
        }
        if (queue2.isEmpty()){
            queue1.add(node);
            return;
        }

    }
    public int pop(){
        int temp = 0;
        if (queue1.isEmpty()){
            int size = queue2.size();
            for (int i = 0; i < size - 1; i++){
                queue1.add(queue2.poll());
            }
            temp = queue2.poll();
            return temp;
        }
        if(queue2.isEmpty()){
            int size = queue1.size();
            for (int i = 0; i < size - 1; i++){
                queue2.add(queue1.poll());
            }
            temp = queue1.poll();
            return temp;
        }
        if (queue2.isEmpty() && queue1.isEmpty())
            throw new RuntimeException("Stack is empty!");
        return temp;
    }

    public static void main(String[] args) {
        Queue2Stack queue2Stack = new Queue2Stack();
        queue2Stack.push(2);
        queue2Stack.push(3);
        queue2Stack.push(4);
        for (int i = 0; i < 4;i++)
            System.out.println(queue2Stack.pop());
    }
}
