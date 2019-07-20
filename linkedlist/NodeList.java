package ReadAgain.dataAndAlgo.linkedlist;


// 单链表的增删
// 2.实现单链表反转
// 3.实现两个有序链表合并为一个有序链表
// 4.实现求链表的中间节点

public class NodeList {
    public Node head = null;

    //4.
    public Node midNode(){
        if(head == null) return null;
        int count = 0;
        Node p = head;
        Node q = head;
        while(p.next != null){
            p = p.next;
            count++;
        }

        count = count / 2;
        while(count > 0){
            q = q.next;
            count--;
        }
        return q;
    }

    //3.
    public Node merge(Node p1, Node p2){
        if(p1 == null && p2 == null) return null;
        if(p1 == null) return p2;
        if(p2 == null) return p1;

        Node newp = null;
        if(p1.val <= p2.val){
            newp = p1;
            newp.next = merge(p1.next,p2);
        }
        else{
            newp = p2;
            newp.next = merge(p1,p2.next);
        }
        return newp;
    }

    // 2.单链表的反转
    public Node reverse(){
        if(head == null)
            return head;

        Node temp = null;
        Node p = null;
        while(head != null){
            p = head.next;
            head.next = temp;
            temp = head;
            head = p;
        }
        return temp;
    }

    //删除一个节点
    public void delete(int data){
        if(head == null)
            return;

        Node p = head;
        Node q = head;
        while(p.val != data && p.next != null){
            p = p.next;
        }
        if(p.next == null && p.val != data){
            System.out.println("没有找到哦！");
            return;
        }
        else{
            if(p.next == null && p.val == data){
                while(q.next != p){
                    q = q.next;
                }
                q.next = null;
            }
            else if(p.val == data){
                while(q.next != p){
                    q = q.next;
                }
                q.next = p.next;
            }
        }
    }

    // 建立有序单链表,包含增加节点的操作
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node p = head;
        Node q = head;
        while(p.next != null && p.val < data){
            p = p.next;
        }

        if(p.val > data){
            while(q.next != p){
                q = q.next;
            }

            newNode.next = p;
            q.next = newNode;
        }
        else{
            p.next = newNode;
            newNode.next = null;
        }
    }

    //print
    public void printAll(){
        if(head == null) return;
        Node p = head;
        while(p != null){
            System.out.print(p.val + " ");
            p = p.next;
        }
    }
}
