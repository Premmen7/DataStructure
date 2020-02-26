package Assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Sorting {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<>();

        list.add(44);
        list.add(122);
        list.add(-4);
        list.add(10);
        list.add(0);
        list.add(99);

        ArrayList array = new ArrayList();

        for(int i = 0; i < 6; i++) {
            array.add(list.poll());
        }
        Collections.sort(array);
        Queue<Integer> list2 = new LinkedList<>(array);
        for(int i = 0; i < 6; i++) {
            System.out.println(list2.poll());
        }

    }
}
