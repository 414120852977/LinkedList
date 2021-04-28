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
}
