package ReadAgain.dataAndAlgo.queue;

public class linkedQueue {
    class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public Node head = null;

    // 插入队列
    public void insertIntoQueue(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            return;
        }

        Node p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = temp;
        temp.next = null;
    }

    // 取出队列
    public Node outOfQueue(){
        if(head == null) return head;
        System.out.println("取出的元素为：" + head.data);
        Node p = head.next;
        return p;
    }

    // 打印队列
    public void printAll(){
        if(head == null){
            return;
        }

        Node p = head;
        while(p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
}
