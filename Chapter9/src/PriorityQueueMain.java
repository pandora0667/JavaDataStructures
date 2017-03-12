/**
 * Created by seongwonlee on 2017. 3. 13..
 */
public class PriorityQueueMain {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(5);

        priorityQueue.insert(new PriorityQueueNode(1));
        priorityQueue.insert(new PriorityQueueNode(5));
        priorityQueue.insert(new PriorityQueueNode(7));
        priorityQueue.insert(new PriorityQueueNode(8));

        priorityQueue.printAll();

        priorityQueue.delete();
        priorityQueue.printAll();

        priorityQueue.delete();
        priorityQueue.printAll();
    }
}
