package ReadAgain.dataAndAlgo.queue;

/**
 * 1.用数组实现一个顺序队列
 * 2.用链表实现一个链式队列
 * 3.实现一个循环队列
 */
public class main {
    public static void main(String[] args){
        circularQueue demo = new circularQueue(4);
        demo.insertIntoQueue(1);
        demo.insertIntoQueue(2);
        demo.insertIntoQueue(3);

        demo.printAll();
        System.out.println();

        demo.outOfQueue();
        demo.insertIntoQueue(4);
        System.out.println();
        demo.printAll();





//        arrQueue queue = new arrQueue(5);
//        queue.insertIntoQueue(1);
//        queue.insertIntoQueue(2);
//        queue.insertIntoQueue(3);
//        queue.insertIntoQueue(4);
//        queue.insertIntoQueue(5);
//
//        queue.printAll();
//
//        queue.outOfQueue();
//        queue.outOfQueue();
//        queue.printAll();
    }
}
