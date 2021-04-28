package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void givenValuesToCreateLinkedList() {
        LinkedList linkedList = new LinkedList(56);
        LinkedList linkedList1 = new LinkedList(30);
        LinkedList linkedList2 = new LinkedList(70);

        linkedList.setNext(linkedList1);
        linkedList1.setNext(linkedList2);

        boolean result = linkedList.getNext().equals(linkedList1) &&
                linkedList1.getNext().equals(linkedList2);

        Assert.assertTrue(result);
    }
}
