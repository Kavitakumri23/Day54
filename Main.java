import Com.kavita.Interview.QueueUsingStack;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueUsingStack queue = new QueueUsingStack();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Front element: " + queue.peek()); // 10
        System.out.println("Removed: " + queue.remove()); // 10
        System.out.println("Removed: " + queue.remove()); // 20
        System.out.println("Front element: " + queue.peek()); // 30
    }

}