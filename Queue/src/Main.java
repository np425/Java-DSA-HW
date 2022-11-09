public class Main {
    private static <T> void cleanQueue(Queue<T> queue) {
        // Clean queue
        while (!queue.isEmpty()) {
            queue.deQueue();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.printReverse();

        System.out.println("A. Expected: [1]");
        queue.enQueue(1);
        queue.printReverse();
        cleanQueue(queue);

        System.out.println("B. Expected: []");
        queue.deQueue();
        queue.printReverse();
        cleanQueue(queue);

        System.out.println("C. Expected: [3,2]");
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.deQueue();
        queue.printReverse();
        cleanQueue(queue);

        System.out.println("D. Expected: [70, 60, 40]");
        queue.add(70, 0);
        queue.add(60, 0);
        queue.add(40, 0);
        queue.printReverse();
        cleanQueue(queue);

        System.out.println("E. Expected: [40, 60, 70]");
        queue.add(70, 3);
        queue.add(60, 3);
        queue.add(40, 3);
        queue.printReverse();
        cleanQueue(queue);

        System.out.println("F. Expected: [40, 60, 70]");
        queue.add(70, 0);
        queue.add(60, 1);
        queue.add(40, 2);
        queue.printReverse();
        cleanQueue(queue);

        System.out.println("G. Expected: [40, 60, 70]");
        queue.add(70, 0);
        queue.add(60, 1);
        queue.add(40, 2);
        queue.printReverse();
        cleanQueue(queue);

        System.out.println("H. Expected: []");
        queue.add(70, 0);
        queue.add(60, 1);
        queue.add(40, 2);
        queue.remove(0);
        queue.remove(0);
        queue.remove(0);
        queue.printReverse();
        cleanQueue(queue);

        System.out.println("I. Expected: [65, 70]");
        queue.add(70, 0);
        queue.add(65, 0);
        System.out.print(queue.deQueue() + " ");
        System.out.println(queue.deQueue());
    }
}