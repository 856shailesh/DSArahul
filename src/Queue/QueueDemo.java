package Queue;

public class QueueDemo {
    int rear;
    int front;
    int[] a;
    int size;

    public QueueDemo(int size){
        rear = -1;
        this.size = size;
    this.a = new int[size];
    }

    public void enQueue(int x){
        rear++;
        a[rear] = x;
    }

    public int deQueue(){
        int ele = a[0];
        for (int i = 0; i < rear ; i++) {
            a[i] = a[i+1];
        }
        rear--;
        return ele;
    }

    public void printQueue(){
        for (int i = 0; i <= rear ; i++) {
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args) {
        QueueDemo q = new QueueDemo(5);
        q.enQueue(10);
        q.enQueue(15);
        q.enQueue(20);
        q.deQueue();
        q.enQueue(30);
        q.printQueue();
    }
}
