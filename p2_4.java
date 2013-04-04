package com.mattcao.p2_1;
/**
 * Created with IntelliJ IDEA.
 * User: caoyangkaka
 * Date: 4/1/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 *
 * Question:
 * Write code to partition a linked list around a value x, such that all
 * nodes less than x come before all nodes greater than of equal to x.
 * idea:
 * traverse the linked list, use another two linked list to get the two different linked list, then
 * combine them together.
 *
 */
public class p2_4 {
    public static void main(String[] args) {
        Node list = new Node(14);
        int x = 5;
        for(int i = 0; i < 15; i++) {
            list.add(i);
        }
        Node newList = partition(list, x);
        newList.display();
    }

    public static Node partition(Node list, int x) {
        Node n = list;
        Node lHead = null, lTail = null;
        Node gHead = null, gTail = null;
        while(n != null) {
            if( n.data < x) {
                if(lHead == null) {
                    lHead = n;
                    lTail = n;
                }else {
                    lTail.next = n;
                    lTail = n;
                }
            } else {
                if(gHead == null) {
                    gHead = n;
                    gTail = n;
                } else {
                    gTail.next = n;
                    gTail = n;
                }
            }
            n = n.next;
        }
        if(lHead == null) {
            return gHead;
        } else {
            lTail.next = gHead;
            return lHead;
        }
    }

}





