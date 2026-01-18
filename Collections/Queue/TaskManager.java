
import java.util.PriorityQueue;
import java.util.Queue;
// import javax.management.Query;

// Write a Java program that uses a PriorityQueue to schedule and execute tasks based on their priority (lower number = higher priority). You should:
// Create a Task class with name and priority.
// Store tasks in a PriorityQueue<Task> so that tasks with higher priority (i.e., lower priority value) are processed first.
// Add at least 5 tasks with different priorities.
// Print the tasks in the order they are executed.
// In a priority queue, elements are ordered based on priority (not insertion order). By default Java’s PriorityQueue behaves like a min-heap, meaning the smallest element is at the head.

class Task{
    String name;
    int zaroori;
    public Task(int zaroori,String name){
        this.zaroori = zaroori;
        this.name = name;
    }

    public String toString(){
        return this.name+" : "+this.zaroori;
    }

    public  boolean equals(Object obj){
        return true;
    }

}

public class TaskManager{
    public static void main(String[] args) {
        Task t1 = new Task(50,"t1");
        Task t2 = new Task(40,"t2");
        Task t3 = new Task(20,"t3");
        Task t4 = new Task(60,"t4");
        Task t5 = new Task(70,"t5");

        Queue <Task> pq = new PriorityQueue<Task>();
        pq.offer(t1);
        pq.offer(t2);
        pq.offe-r(t3);
        pq.offer(t4);
        pq.offer(t5);

        System.out.println(pq);
        

    }
}