package ReadAgain.dataAndAlgo.queue;

public class arrQueue {
    public int [] data;
    public int head;
    public int tail;
    public int n;

    public arrQueue(int capacity){
        this.data = new int [capacity];
        this.n = capacity;
        this.head = 0;
        this.tail = 0;
    }

    // 向队列中插入一个元素
    public void insertIntoQueue(int val){
        if(tail == n) return;

        data[tail] = val;
        tail++;
    }

    // 从队列中取出元素
    public void outOfQueue(){
        if(head == tail) return;
        System.out.println(data[head]);
        head++;
    }

    // 打印出队列内的元素
    public void printAll(){
        int temp = head;
        while(temp < tail){
            System.out.print(data[temp] + " ");
            temp++;
        }
    }

}
