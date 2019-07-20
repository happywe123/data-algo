package ReadAgain.dataAndAlgo.linkedlist.recycleLink;

public class NodeList {

    public Node head = null;

    // insert
    public Node insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return newNode;
        }

        if(head.next == head){
            head.next = newNode;
            newNode.next = head;
            return head;
        }

        if(head.data > data){
            newNode.next = head;
            return newNode;
        }

        Node q = head;
        Node p = head;
        while(p.next != head && p.data < data){
            p = p.next;
        }

        if(p.data > data){
            while(q.next != p){
                q = q.next;
            }

            newNode.next = p;
            q.next = newNode;
            return head;
        }
        else{
            p.next = newNode;
            newNode.next = head;
            return head;
        }
    }

    //delete
    public void delete(int data){
        if(head == null)
            return;

        Node p = head;
        Node q = head;
        while(p.next != head && p.data != data){
            p = p.next;
        }

        if(p.data == data){
            while(q.next != p){
                q = q.next;
            }
            q.next = p.next;
        }
    }


    //print
    public void print(){
        if(head.next == head){
            System.out.println(head.data);
            return;
        }

        Node p = head;
        Node q = head;
        while(p.next != q){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println(p.data);
        return;

    }

}
