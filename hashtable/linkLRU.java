package ReadAgain.dataAndAlgo.hashtable;

import java.util.LinkedList;

public class linkLRU {
   public Node head = null;
   public int length = 5;
   public int count = 0;

   // 头插法插入节点：若队列没满，直接插入；若满，则删除尾节点
   public Node insert(int data){
       Node temp = new Node(data);
       if(count < length){
           if(head == null){
               head = temp;
               count++;
               return head;
           }
           temp.next = head;
           count++;
           return temp;
       }
       else{
           if(isExist(data)){
               // 将节点移动到队头
               if(head.data == data) return head;
               Node p = head;
               Node q = head;
               while(p.next != null){
                   p = p.next;
                   if(p.data == data) break;
               }

               while(q.next != p) q = q.next;

               if(p.next == null){
                   q.next = null;
                   p.next = head;
                   return p;
               }
               else
               {
                   q.next = p.next;
                   p.next = head;
                   return p;
               }
           }
           else{
               head = deleteLast();
               temp.next = head;
               count++;
               return temp;
           }
       }
   }

   // 删除尾节点
    public Node deleteLast(){
        Node p = head.next;
        Node q = head;
        while(p.next != null){
            p = p.next;
            q = q.next;
        }
        q.next = null;
        count--;
        return head;
    }

    // 查询节点是否存在
    public boolean isExist(int data){
        if(head == null) return false;
        Node p = head;
        while(p.next != null){
            if(p.data == data) return true;
            p = p.next;
        }
        return false;
    }

    // 打印
    public void print(){
        Node p = head;
        while(p != null){
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }
}
