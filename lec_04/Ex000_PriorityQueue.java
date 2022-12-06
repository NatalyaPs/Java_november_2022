package lec_04;
import java.util.PriorityQueue;

public class Ex000_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);  //  [1, 3, 13, 123]
        System.out.println(pq.poll()); // извлекаем -- выводит в консоль  1
        System.out.println(pq.poll());// извлекаем -- выводит в консоль  1
        System.out.println(pq.poll());// извлекаем -- выводит в консоль  13
        System.out.println(pq.poll());// извлекаем -- выводит в консоль  123
        System.out.println(pq.poll());// null
       

    }
}

