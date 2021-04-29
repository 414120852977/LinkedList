package com.bridgelabz;

public class LinkedList<K> {
    int size;
    Node start;

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Operations");
    }
    // ability to create linked list 56,30 and 70


    public LinkedList() {
        this.size = 0;
        this.start = null;
    }

    public int getSize() {
        return size;
    }


    /**
     * insert node at beigining 30 qnd 56 to 70
     *
     * @return
     */
//    public static<K extends Comparable<K>> void inserBegining(int val) {
//        Node n;
//        n = new Node();
//        n.getData(val);
//        n.setNext(start);
//        start = n;
//        size++;
//    }
    public boolean isEmpty() {
        if (start == null) {
            return true;
        } else
            return false;
    }

    public void viewlist() {
        Node t;
        if (isEmpty()) {
            System.out.println("list is empty");
        } else {
            t = start;
            for (int i = 0; i < size; i++) {
                System.out.print(t.getData() + "  ->  ");
                t = t.getNext();
            }
        }
    }

    public void insertFirst(int val) {
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(start);
        start = n;
        size++;
    }

    public void insertLast(int val) {
        Node n, t;
        n = new Node();
        n.setData(val);
        t = start;
        if (t == null) {
            start = n;
        } else {
            while (t.getNext() != null)
                t = t.getNext();
            t.setNext(n);
            size++;
        }
    }

    public void insertAtPosition(int val,int pos){
        if (pos == 1){
            insertFirst(val);
        }
        else if(pos == size+1){
            insertLast(val);
        }else if(pos>1 && pos<size){
            Node n,t;
            n=new Node();
            n.setData(val);
            n.setNext(null);
            t=start;
            for(int i=1;i<pos;i++) {
                t = t.getNext();
                n.setNext(t.getNext());
                t.setNext(n);
                size++;
            }
        }
    }

    public void deletefirst() {
        if(start == null) {
            System.out.println("list is empty");
        }
        else {
            start =start.getNext();
            size--;
        }
    }

    public void deleteLast(){
        if (start == null){
            System.out.println("empty");
        }
        else if(size == 1){
            start=null;
            size--;
        }else{
            Node t;
            t=start;
            for(int i=1;i<size-1;i++)
                t=t.getNext();
            t.setNext(null);
            size--;
        }
    }
}



