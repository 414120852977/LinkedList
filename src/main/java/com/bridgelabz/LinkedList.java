package com.bridgelabz;

public class LinkedList<K> {
    private  LinkedList next;
    private K key;

    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Operations");
    }
    // ability to create linked list 56,30 and 70

    public LinkedList(K key) {
        this.key = key;
        this.next = null;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }
}
