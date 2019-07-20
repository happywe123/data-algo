package ReadAgain.dataAndAlgo.linkedlist.doubleLink;

// 双向链表，支持增删操作
public class main {
    public static void main(String[] args){
        NodeList demo = new NodeList();
        demo.head = demo.insert(2);
        demo.head = demo.insert(4);
        demo.head = demo.insert(7);
        demo.head = demo.insert(5);
        demo.head = demo.insert(8);
        demo.head = demo.insert(1);

        demo.printAll();
        System.out.println();

        demo.head = demo.delete(4);
        demo.printAll();
        System.out.println();
    }
}
