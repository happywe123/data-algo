package ReadAgain.dataAndAlgo.stack;

public class linkStack {
    class Node{
        public int val;
        public Node next = null;
        public Node pre = null;

        public Node(int data){
            this.val = data;
        }

    }
    public Node head = null;
    public Node top = head;

    // 进栈
    public void InStack(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            top = newNode;
            return;
        }

        top.next = newNode;
        newNode.pre = top;
        top = newNode;
    }

    // 出栈
    public void OutStack(){
        if(head == null) return;
        System.out.println(top.val);
        top = top.pre;
    }
}
