package ReadAgain.dataAndAlgo.bintree;

import java.util.LinkedList;
import java.util.Queue;

public class binTree {
    public TreeNode root = null;

    //创建二叉树,即插入
    public TreeNode createTree(int data){
        TreeNode newNode = new TreeNode(data);
        if(root == null){
            root = newNode;
            return root;
        }

        TreeNode current = root;
        TreeNode p = null;
        while(current != null){
            p = current;
            if(current.val > data){
                current = current.left;
                if(current == null){
                    p.left = newNode;
                    return root;
                }
            }
            else
            {
                current = current.right;
                if(current == null){
                    p.right = newNode;
                    return root;
                }
            }
        }
        return root;
    }

    //查找
    public void findInTree(int data){
        if(root == null)return;
        TreeNode p = root;
        while(p != null){
            if(p.val == data){
                System.out.println("找到了！");
                return;
            }
            else if(p.val > data){
                p = p.left;
            }
            else{
                p = p.right;
            }
        }
    }

    //删除
    public void delete(int data){
        TreeNode p = root;
        TreeNode pp = null;

        while(p.val != data && p != null){
            pp = p;
            if(p.val > data) p = p.left;
            else p = p.right;
        }

        if(p == null) return;

        if(p.left != null && p.right != null){
            TreeNode minp = p.right;
            TreeNode minpp = p;
            while(minp.left != null){
                minpp = minp;
                minp = minp.left;
            }
            p.val = minp.val;
            // 联系后面的代码看就知道如何删除了！
            p = minp;
            pp = minpp;
        }

        // 删除的节点是叶子节点，或者只有一个叶子节点
        TreeNode child ;
        if(p.left != null) child = p.left;
        else if(p.right != null) child = p.right;
        else child = null;

        if(pp == null) root = child; // 删除的是根节点
        else if(pp.left == p) pp.left = child;
        else pp.right = child;
    }

    // 查找某个节点的前驱节点，左子树的最大节点
    public TreeNode findMax(int data){
        if(root == null) return null;
        TreeNode p = root;
        while(p != null){
            if(p.val == data){
                break;
            }
            else if(p.val > data){
                p = p.left;
            }
            else{
                p = p.right;
            }
        }

        if(p.left != null) p = p.left;
        else return null;

        while(p.right != null){
            p = p.right;
        }
        return p;
    }

    // 查找某个节点的后继节点，右子树的最小节点
    public TreeNode findMin(int data){
        if(root == null) return null;
        TreeNode p = root;
        while(p.val != data && p != null){
            if(p.val == data) break;
            else if (p.val < data) p = p.right;
            else p = p.left;
        }

        if(p.right != null)p = p.right;
        else return null;

        while(p.left != null){
            p = p.left;
        }
        return p;
    }


    //前序遍历
    public void preOrder(TreeNode root){
        if(root != null){
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //中序遍历
    public void midOrder(TreeNode root){
        if(root != null){
            midOrder(root.left);
            System.out.print(root.val + " ");
            midOrder(root.right);
        }
    }

    //后序遍历
    public void lastOrder(TreeNode root){
        if(root != null){
            lastOrder(root.left);
            lastOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    //按层遍历
    public void breadthOrder(TreeNode root){
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.print(temp.val + " ");
            if(temp.left != null)
                queue.add(temp.left);
            if(temp.right != null)
                queue.add(temp.right);
        }
    }
}
