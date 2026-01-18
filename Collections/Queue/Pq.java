
import java.util.PriorityQueue;
import java.util.Queue;


class Pq{
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(100);
        pq.offer(50);
        pq.offer(20);
        pq.offer(30);
        pq.offer(10);
        pq.offer(80);
        pq.offer(90);

        System.out.println(pq);
        int n = pq.size();

        for (int i = 0; i < n; i++) {
            System.out.println(pq.poll());
        }


    }
}