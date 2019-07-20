package ReadAgain.dataAndAlgo.hashtable;

/**
 * 1.实现一个基于链表法解决冲突问题的散列表
 * 2.实现一个 LRU 缓存淘汰算法
 */
public class main {

    public static void main(String[] args){
        linkLRU demo = new linkLRU();
        demo.head = demo.insert(1);
        demo.head = demo.insert(2);
        demo.head = demo.insert(3);
        demo.head = demo.insert(4);
        demo.head = demo.insert(5);
        demo.print();

        demo.head = demo.insert(6);
        demo.print();

        demo.head = demo.insert(3);
        demo.print();

        demo.head = demo.insert(2);
        demo.print();

        demo.head = demo.insert(2);
        demo.print();





//        linkHash demo = new linkHash(5);
//        int [] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        for(int item:data){
//            demo.insert(item);
//        }
//
//        demo.printAll();
    }
}
