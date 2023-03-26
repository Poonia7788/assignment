package com.poonia;

public class Main {

    public static void main(String[] args) {

        MyStack ob=new MyStack();
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);
        ob.push(5);
        ob.push(6);
        ob.push(7);
       int min= ob.getMin();
        System.out.println(min);
    }
}
