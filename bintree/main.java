package ReadAgain.dataAndAlgo.bintree;

/**
 * 1.实现一个二叉查找树，并且支持插入、删除、查找操作
 * 2.实现查找二叉查找树中某个节点后继节点、前驱结点
 * （ 这里理解题目很关键，
 *  某个节点的前驱指的是该节点的左子树中的最大节点，
 *  该节点的后驱指的是该节点的右子树中的最小节点 ）
 *
 * 3.实现二叉树的前、中、后序以及按层遍历
 */
public class main {
    public static void main(String[] args){
        binTree demoTree = new binTree();
        int [] data = {7,5,10,4,6,9,11};
        for(int item:data){
            demoTree.createTree(item);
        }

        demoTree.preOrder(demoTree.root);
        System.out.println();

        System.out.println(demoTree.findMin(7).val);
//        demoTree.delete(4);
//        System.out.println();
//        demoTree.preOrder(demoTree.root);

//        demoTree.findInTree(11);


//        demoTree.preOrder(demoTree.root);
//        System.out.println();
//        demoTree.midOrder(demoTree.root);
//        System.out.println();
//        demoTree.lastOrder(demoTree.root);
//        System.out.println();
//        demoTree.breadthOrder(demoTree.root);
    }
}
