package ReadAgain.dataAndAlgo.linkedlist;

/**
 * 1.实现单链表、循环链表、双向链表，支持增删操作
 * 2.实现单链表反转
 * 3.实现两个有序链表合并为一个有序链表
 * 4.实现求链表的中间节点
 */
public class main {
    public static void main(String[] args){
        NodeList demoList = new NodeList();
        demoList.insert(1);
        demoList.insert(3);
        demoList.insert(5);
        demoList.insert(7);
        demoList.insert(9);

        demoList.printAll();
        System.out.println();

        System.out.println(demoList.midNode().val);

//        NodeList demoList2 = new NodeList();
//        demoList2.insert(2);
//        demoList2.insert(4);
//        demoList2.insert(6);
//        demoList2.insert(8);
//        demoList2.printAll();
//        System.out.println();
//
//        NodeList demoList3 = new NodeList();
//        demoList3.head = demoList.merge(demoList.head,demoList2.head);
//        demoList3.printAll();




//        demoList.head = demoList.reverse();
//        demoList.printAll();
//        System.out.println();
//
//        demoList.delete(5);
//        demoList.printAll();
//        System.out.println();
    }
}
