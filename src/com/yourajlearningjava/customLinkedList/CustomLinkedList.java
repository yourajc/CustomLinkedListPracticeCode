package com.yourajlearningjava.customLinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    public void insertFirstValue(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size += 1;
    }
    public int deleteFirstValue() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size --;
        return val;
    }

    public void insertAtIndex(int val, int index) {
        if(index == 0) {
            insertFirstValue(val);
            return;
        }
        if(index == size) {
            insertValueLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size ++;
    }
    public void insertValueLast(int val) {
        if(tail == null){
            insertFirstValue(val);
            return;
        }
        Node n = new Node(val);
        n.next = tail;
        tail = n;
        size ++;

    }
    // create a method to capture the reference of 2nd last node form the tail
    public int deleteLast() {
        if(size <= 1){
            deleteFirstValue();
        }
        Node secondLastNode = getRefOfSecondLastNode(size -2);
        int val = tail.value;
        tail = secondLastNode;
        tail.next = null;
        return val;
    }
    public int deleteAtIndex(int index) {
        if (index == 0) {
            return deleteFirstValue();
        }
        if (index == size -1) {
            return deleteLast();
        }
        Node prevNode = getRefOfSecondLastNode(index -1);
        int val = prevNode.next.value;
        prevNode.next = prevNode.next.next;

        return val;
    }

    /**
     * IsValuePresent? -> This method check if value is present in the list , starts form head and traverses
     * through the list
     * @param value takes an integer value
     * @return null if value is not present, else returns node
     */
    public Node isValuePresent(int value) {
        Node node = head;
        while ( node != null) {
            if( node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node getRefOfSecondLastNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void displayValues() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +", ");
            temp = temp.next;
        }
        System.out.println(" End of the list");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
