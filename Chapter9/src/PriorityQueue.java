/**
 * Created by seongwonlee on 2017. 3. 13..
 */
public class PriorityQueue {
    private PriorityQueueNode[] queueNodes;
    private int currentIndex;

    public PriorityQueue(int length) {
        queueNodes = new PriorityQueueNode[length+1];
        currentIndex = 0;
    }

    private boolean queueEmpty(){
        if (currentIndex == 0)
            return true;
        else
            return false;
    }

    private boolean queueFull() {
        if (currentIndex == queueNodes.length)
            return true;
        else
            return false;
    }

    public void insert(PriorityQueueNode node) {
        if (queueFull()) {
            System.out.println("데이터를 저장할 수 없습니다 ");
            return;
        }
        currentIndex++;
        queueNodes[currentIndex] = node;
        int child = currentIndex;
        while (child != 1 && queueNodes[child].getData() < queueNodes[child/2].getData()) {
            PriorityQueueNode tmp = queueNodes[child];
            queueNodes[child] = queueNodes[child/2];
            queueNodes[child/2] = tmp;
            child /= 2;
        }
    }

    public void delete() {
        if (queueEmpty()) {
            System.out.println("Heap 이 비어있습니다 ");
            return;
        }

        queueNodes[1] = queueNodes[currentIndex];
        currentIndex--;
        sorting();
    }

    private void sorting() {
        int root = 1;
        while (root*2 <= currentIndex) {
            PriorityQueueNode temp = queueNodes[root];
            if (queueNodes[root*2].getData() <= queueNodes[root*2+1].getData()) {
                queueNodes[root] = queueNodes[root*2];
                queueNodes[root*2] = temp;
                root *= 2;
            } else {
                queueNodes[root] = queueNodes[root*2+1];
                queueNodes[root*2+1] = temp;
                root = root*2+1;
            }
        }
    }

    public void printAll() {
        for (int i=1; i<=currentIndex; i++)
            System.out.print(queueNodes[i].getData() + " ");
        System.out.println();
    }
}