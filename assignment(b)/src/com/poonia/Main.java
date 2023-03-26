package com.poonia;

import java.util.LinkedList;
import com.poonia.Likedlist;
public class Main {

    public static void main(String[] args) {
        Likedlist ob=new Likedlist();
        ob.push(10);
        ob.push(9);
        ob.push(8);
        ob.push(7);
        ob.push(6);
        ob.push(5);
        ob.push(4);
        ob.push(3);
        ob.push(2);
        ob.push(1);
        Likedlist.Node temp=ob.head;
        int ans=ob.nthNode(temp,3) ;
        System.out.println("ans:"+ans);
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
