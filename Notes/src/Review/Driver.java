package Review;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Driver {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(7);
        list.add(5);
        list.add(10);

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        removeDuplicates(list);


    }

    public static void sort(LinkedList<Integer> list) {
        Collections.sort(list);
        System.out.println(list);
    }

    public static void reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reverse = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reverse.add(list.get(i));
        }
        System.out.println("Reverse: " + reverse);
    }

    public static void removeMiddle(LinkedList<Integer> list) {
        if (list.size() % 2 == 0) {
            list.remove(list.size() / 2 - 1);
        } else
            list.remove(list.size() / 2);
        System.out.println(list);
    }

    public static void removeDuplicates(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    System.out.println("Duplicates: " + list.get(i));
                    list.remove(i);
                }
            }
        }
        System.out.println(list);
    }

    public static void merge(LinkedList<Integer> list, LinkedList<Integer> list2) {
        LinkedList<Object> temp = new LinkedList<>();
        temp.addAll(list);
        temp.addAll(list2);
        System.out.println(temp);
        System.out.println("\n");
    }

    public static void swap(LinkedList<Integer> list) {
        LinkedList<Integer> temp = new LinkedList<>();

        for(int i = list.size()/2; i < list.size(); i++) {
            temp.add(list.get(i));
        }
        for(int j = 0; j < list.size() / 2; j++) {
            temp.add(list.get(j));
        }
        System.out.println(temp);
    }

}
