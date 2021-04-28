package com.bridgelabz;

public class LinkedList<K> {
  int size;
  Node start;

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Operations");
    }
    // ability to create linked list 56,30 and 70


    public LinkedList( ) {
        this.size = 0;
        this.start = null;
    }

    public int getSize() {
        return size;
    }


    /**
     * insert node at beigining 30 qnd 56 to 70
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
      if(start == null){
        return true;
    }
      else
          return  false;
    }

    public void viewlist() {
    Node t;
    if(isEmpty()) {
        System.out.println("list is empty");
    }
    else {
        t = start;
        for(int i = 0;i<size;i++) {
            System.out.print(t.getData()+"  ->  ");
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
}
