package com.mattcao.p2_1;

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
 *    ListIterator<String> iter = list.listIterator();
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
        Node list = new Node(10);
        for(int i = 0; i < 15; i++) {
            list.add(i);
        }
        removeDup(list);
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

// the having buffer function
    public static void removeDupA(Node list) {
        //use the hashmap, please review this part
    }
}





