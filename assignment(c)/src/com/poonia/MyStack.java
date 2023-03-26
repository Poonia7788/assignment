package com.poonia;

import java.util.Stack;

public class MyStack {
    Stack<Integer> s;
    Integer minEle;
    //constructor
    MyStack(){
        s=new Stack<Integer>();
    }
    int getMin()
    {
        if (s.isEmpty())
            System.out.println("Stack is empty");
        else
            return minEle;

        return -1;
    }
    void peek()
    {
        if (s.isEmpty()) {
            System.out.println("Stack is empty ");
            return;
        }
        Integer t = s.peek();
        System.out.print("Top Most Element is: ");

        if (t < minEle)
            System.out.println(minEle);
        else
            System.out.println(t);
    }
    void pop()
    {
        if (s.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Top Most Element Removed: ");
        Integer t = s.pop();

        if (t < minEle) {
            System.out.println(minEle);
            minEle = 2 * minEle - t;
        }
        else
            System.out.println(t);
    }
    void push(Integer x)
    {
        if (s.isEmpty()) {
            minEle = x;
            s.push(x);
            System.out.println("Number Inserted: " + x);
            return;
        }
        if (x < minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        }
        else
            s.push(x);

        System.out.println("Number Inserted: " + x);
    }
}
