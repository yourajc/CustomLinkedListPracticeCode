package com.yourajlearningjava.customLinkedList.singlyLinkedList.doubly;

public class DoublyLinkedList {
    Node head;
    public void insertFirstElement(int values) {
        Node node = new Node(values);
        node.next = head;
        node.prev = null;
        if( head != null) {
            head.prev = node;
        }
        head = node;

    }
    private class Node {
        private Node next;
        private Node prev;
        private int values;

        public Node(int values) {
            this.values = values;
        }
        public Node(Node next, Node prev, int values) {
            this.next = next;
            this.prev = prev;
            this.values = values;
        }
    }

}
