public class Queue {
    private int[] array;
    private int front; //
    private int rear;

    /*
    这是一个基于数组实现的循环队列♻️
     */

    public Queue(int capacity) {
        this.array = new int[capacity];
    }

    /*
    入队
    (rear+1)%array.length用这个公示来表示循环中的下一位
     */
    public void enQueue(int element) throws Exception {
        if ((rear + 1) % array.length == front) {
            throw new Exception("队列已满");
        }

        array[rear] = element;//在尾指针处插入数据
        rear = (rear + 1) % array.length;
    }

    /*
    出队
     (rear+1)%array.length用这个公示来表示循环中的下一位
     */
    public int deQueue() throws Exception {
        if (rear == front) {
            throw new Exception("队列为空");
        }
        int deQueueElement = array[front];
        front = (front + 1) % array.length;
        return deQueueElement;
    }


    /*
    输出队列
     */
    public void output() {
        for (int i = front; i != rear; i = (i + 1) % array.length) {
            System.out.println(array[i]);
        }

    }

    /*
    主程序
     */
    public static void main(String[] args) throws Exception {
        Queue myQueue = new Queue(6);
        myQueue.enQueue(1);
        myQueue.enQueue(1);
        myQueue.enQueue(1);
        myQueue.enQueue(1);
        myQueue.enQueue(1);
        myQueue.output();
    }


}
