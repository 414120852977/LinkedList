package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LinkedListTest {
    @Test
    public void createLinkedlistAddOneByOneToFront() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
          linkedList.viewlist();
    }

    /**
     * appending 30 and 70 to 56
     * first 56 will be created then next appent 30 to 56 and finally append 70 to 30
     */
    @Test
    public void insertAtLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertLast(56);
        linkedList.insertLast(30);
        linkedList.insertLast(70);
        linkedList.insertLast(70);
        linkedList.viewlist();
    }
    /**
     * inset At position method work to place the element in exact position
     */
    @Test
    public void insertAtExactPosition() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(70);
        linkedList.insertAtPosition(30,1);
        linkedList.insertFirst(56);
        linkedList.viewlist();
    }

    /**
     * method is to delete first position of a linked list
     */
    @Test
    public void deleteFirstPosition() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
        linkedList.deletefirst();
        linkedList.viewlist();
    }

    /**
     * deleting list from last position
     */
    @Test
    public void deletelistfromLast() {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(70);
        linkedList.insertFirst(30);
        linkedList.insertFirst(56);
        linkedList.deleteLast();
        linkedList.viewlist();
    }
}
