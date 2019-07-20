package ReadAgain.dataAndAlgo.queue;

public class circularQueue {
    public int [] data;
    public int head;
    public int tail;
    public int n;

    public circularQueue(int capacity){
        this.data = new int [capacity];
        this.n = capacity;
        this.head = 0;
        this.tail = 0;
    }

    // 向队列中插入一个元素
    public void insertIntoQueue(int val){
       if((tail + 1) % n == head) return;
        data[tail] = val;
        tail = (tail + 1) % n;
    }

    // 从队列中取出元素
    public void outOfQueue(){
        if(head == tail) return;
        System.out.println(data[head]);
        head = (head + 1) % n;
    }

    // 打印出队列内的元素
    public void printAll(){
        int temp = head;
        while(temp != tail){
            System.out.print(data[temp] + " ");
            temp = (temp + 1) % n;
        }
    }

}
