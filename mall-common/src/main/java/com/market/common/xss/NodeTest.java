package com.market.common.xss;

import java.util.Comparator;
import java.util.TreeSet;

public class NodeTest {
    public static void main(String[] args) {
        Linke<String> linke =new Linke<>();
        linke.add("1");
        linke.add("2");
        linke.add("3");
        linke.add("4");
        linke.show();

        TreeSet<String> treeSet =new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                o1.compareTo();
            }

        });
        treeSet.add()
    }
}

class Linke<T> {

    Node head = null;
    Node last = null;

    class Node {
        T t;
        Node pre;
        T data;
        Node next;

        public Node(Node pre, T data, Node next) {
            this.pre = pre;
            this.data = data;
            this.next = next;
        }

        public Node() {

        }
    }
    public void add(T data){
        Node l =last;
        Node newnode =new Node(l,data,null);
        last = newnode;
        if(l==null){
            head = newnode;
        }
        else {
            l.next =newnode;
        }
    }

    public void show(){
        Node h =this.last;
        if(this.head==null) return;
        while(this.head!=null){
            System.out.println(h.data);
            h=h.pre;
        }
    }
}