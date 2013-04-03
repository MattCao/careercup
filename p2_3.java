package com.mattcao.p2_1;

import java.util.HashSet;
/**
 * Created with IntelliJ IDEA.
 * User: caoyangkaka
 * Date: 4/1/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 *
 * Question:
 * Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 * idea:
 * c = c.next
 *
 */
public class p2_1 {
    public static void main(String[] args) {
        Node list = new Node(14);
        int k = 3;
        for(int i = 0; i < 15; i++) {
            list.add(i);
        }
        Node n = list;
        while(list.data != 5){
            list = list.next;
        }
        findA(list);
        n.display();
    }

    public static boolean findA(Node list) {
        if(list == null || list.next == null) {
            return false;
        }
        list.data = list.next.data;
        list.next = list.next.next;
        return true;
    }

}





