package com.poonia;

public class Likedlist {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public int nthNode(Node head,int n){
        int ans=0;
        Node answer=head;
        Node last=head;
        for(int i=0;i<n-1;i++){
            last=last.next;
        }
        while(last.next!=null){
            last=last.next;
            answer=answer.next;
        }
        ans=answer.data;
        return ans;
    }
}
