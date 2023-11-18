package Linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist_Demo {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(101);
        ll.add(111);
        ll.add(121);
        System.out.print(ll);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);

        ll.addAll(1, al);

        System.out.print(ll);

        ll.remove();
        System.out.print(ll);

        System.out.print(ll.get(2));

        System.out.print(ll.contains(34) + " " + ll.contains(300));

        ll.set(2, 700);
        System.out.print(ll);

        ll.add(null);
        ll.add(700);

        System.out.print(ll);

    }

}
