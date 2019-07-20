package ReadAgain.dataAndAlgo.linkedlist.doubleLink;

public class NodeList {
    public Node head = null;

    // 有序链表 ，插入节点
    public Node insert(int data){
        if(head == null){
            head = new Node(data);
            return head;
        }

        Node newNode = new Node(data);
        Node p = head;
        if(p.val > data){
            newNode.next = p;
            p.pre = newNode;
            return newNode;
        }

        while(p.next != null && p.val < data){
            p = p.next;
        }

        if(p.val > data){
            newNode.next = p;
            newNode.pre = p.pre;
            p.pre.next = newNode;
            p.pre = newNode;
        }
        else{
            p.next = newNode;
            newNode.pre = p;
            newNode.next = null;
        }
        return head;
    }


    // 删除节点
    public Node delete(int data){
        Node p = head;

        if(p.val == data)
            return p.next;

        while(p.next != null && p.val != data){
            p = p.next;
        }
        if(p.val == data && p.next == null){
            p.pre.next = null;
            return head;
        }
        else{
            p.pre.next = p.next;
            p.next.pre = p.pre;
            return head;
        }
    }

    //打印
    public void printAll(){
        Node newNode = head;
        while(newNode != null){
            System.out.print(newNode.val + " ");
            newNode = newNode.next;
        }
    }





}
