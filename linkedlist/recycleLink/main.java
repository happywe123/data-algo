package ReadAgain.dataAndAlgo.linkedlist.recycleLink;

// 循环链表,支持增删操作
public class main {
    public static void main(String[] args){
        NodeList demo = new NodeList();
        demo.head = demo.insert(2);
        demo.head = demo.insert(4);
        demo.head = demo.insert(5);
        demo.head = demo.insert(7);
        demo.head = demo.insert(6);
        demo.head = demo.insert(1);

        demo.delete(4);
        demo.print();
        System.out.println();
    }
}
