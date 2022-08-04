package com.yourajlearningjava.customLinkedList;

public class Main {
    public static void main(String[] args) {
    CustomLinkedList cs = new CustomLinkedList();
    cs.insertFirstValue(1);
    cs.insertFirstValue(2);
    cs.insertFirstValue(4);
    cs.insertFirstValue(15);
    cs.insertValueLast(100);
    cs.insertAtIndex(11, 2);
//    cs.displayValues();
//    System.out.println(cs.deleteFirstValue());
//    cs.displayValues();
//    cs.insertAtIndex(21, 0);
//    cs.displayValues();
//    cs.insertFirstValue(22);
        System.out.println(cs.deleteFirstValue());
        cs.displayValues();
        System.out.println(cs.deleteLast());
        cs.displayValues();
        System.out.println(cs.deleteAtIndex(2));
        cs.displayValues();
        System.out.println(cs.isValuePresent(11));
        cs.displayValues();
    }
}
