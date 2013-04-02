package com.mattcao.p2_1;

import java.util.HashSet;
/**
 * Created with IntelliJ IDEA.
 * User: caoyangkaka
 * Date: 4/1/13
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 *
 *Question:
 *
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 * Some basic ideas about linkedlist:
 * 1, LinkedList<Integer> list = new LinkedList<Integer>();
 * 2, add element: list.add(10); time is O(1)
 * 3, a head and tail pointer included. so we can access/add the first/last in a time O(1)
 *    list.addFirst(), list.add(), listRemoveFirst(), listRemoveLast(), getFirst(), getLast();
 * 4, traverse the list:
 *    ListIterator<String> iter = list.ListIterator();
 *    while (iter.hasNext()) {
 *      String word = iter.next();
 *      System.out.println(word);
 *    }
 * 5, use the iterator to change the element:
 * iter.set(newValue),iter.remove(),  it will replace the element last returned by next()
 * My idea:
 * the basic idea is that just compare with each other then remove the duplicated one, but the timing is
 * about n^2, which is totally not great.
 * Others' idea:
 *
 *
 */
public class p2_1 {
    public static void main(String[] args) {
        Node list = new Node(14);
        for(int i = 0; i < 15; i++) {
            list.add(i);
        }
        removeDupA(list);
        list.display();
    }
// the no buffer one function
    public static void removeDup(Node list) {
        Node start;
        while(list != null) {
            start = list;
            while(start.next != null) {
                if(start.next.data == list.data) {
                    start.next = start.next.next;
                } else {
                    start = start.next;
                }
            }
            list = list.next;
        }
    }
/**
 * Here we will use the hashmap to do the mapping, but firstly, we should go overview with the hashmap:
 *        Set and Map
 *        Set ADT: add only the unduplicated value, so here, we can use this method.
 *        functions:
 *        1. Set<elementType> s = new hashSet<elementType>();  do not care about the sorted order
 *        when iterate
 *        notice: the elementType need support equals() and hashCode()
 *        2. Set<elementType> s = new treeSet<elementType>();  care about the sorted order when
 *        iterate
 *        notice: elementType must implement Comparable (has compareTo)
 *        3.
 *        s.add(12), return true if success, return false if not
 *        s.remove(12), the same
 *        s.contains(12), the same
 *        4. traverse
 *        Iterator<String> iter = s.iterator();
 *
 *
 */
// the having buffer function
    public static void removeDupA(Node list) {
        //1. use hashSet
        HashSet<Integer> s = new HashSet<Integer>();
        s.add(list.data);
        while(list.next != null) {
            if(s.add(list.next.data)){
                list = list.next;
            } else {
                list.next = list.next.next;
            }
        }
        if(!s.add(list.data))
            list = null;
    }
//still here, we can still use the map to do this part.
}





