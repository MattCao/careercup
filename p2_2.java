package com.mattcao.p2_2;

/**
 * Created with IntelliJ IDEA.
 * User: caoyangkaka
 * Date: 4/1/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 *
 * Question:
 * Implement an algorithm to find the kth to last element of a singly linked list.
 * idea:
 * use two positions whose distance is k, then trace
 *
 */
public class p2_2 {
    public static void main(String[] args) {
        Node list = new Node(14);
        int k = 3;
        for(int i = 0; i < 15; i++) {
            list.add(i);
        }
        findA(list, k);
        list.display();
    }
    // this is my idea  time O(n), space O(1)
    public static void find(Node list, int k) {
        if(list == null || k < 0) {
            System.out.println("Something wrong the given data!");
        }
        Node start = null;
        Node first = list;
        int index = 0;
        while(list.next != null) {
            list = list.next;
            index++;
            if(index == k) {
                start = first;
            }else if(index > k) {
                start = start.next;
            }
        }
        if(start == null) {
            System.out.println("The value of k is large than the length of the linkedlist.");
        } else {
            System.out.println("The kth to the last element is: " + start.data);
        }
    }
    // the others given ideas:
    // first, just traverse the whole linked list, get the length of the linked list, then get the kth element to the
    // the last element. time O(n), space O(1), but is not good as mine.
    public static void findA(Node list, int k) {
        if(list == null || k < 0){
            System.out.println("Something wrong with the given data!");
            return;
        }
        Node s = list;
        int length = 0;
        while(s != null) {
            s = s.next;
            length++;
        }
        if( k > length) {
            System.out.println("The value of k is larger than the length.");
            return;
        }
        s = list;
        for(int i = 0; i < length - k - 1; i++) {
            s = s.next;
        }
        System.out.println("The kth to the last element is: " + s.data);
    }
    // some of the algorithm using the idea of recursive, I think it should better to be familiar with this design

}





