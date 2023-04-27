package org.example.arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<T> {
    private Node head;
    Logger logger = LogManager.getLogger("org.example.arrays.LinkedList");

    class Node {
        private T data;
        private Node pointer;

        private Node(T data) {
            this.data = data;
            this.pointer = null;
        }
    }

    public void add(T data) {
        Node node = new Node(data);

        //if we have no head
        if(this.head == null) {
            this.head = node;
        } else {
           Node iteratorNode = this.head;
           while (iteratorNode.pointer != null) {
               iteratorNode = iteratorNode.pointer;
           }
            iteratorNode.pointer = node;
        }
    }

    public void print() {
        Node iteratorNode = this.head;
        while (iteratorNode != null) {
            logger.info("LinkedList Node: " + iteratorNode.data);
            iteratorNode = iteratorNode.pointer;
        }
    }
}
