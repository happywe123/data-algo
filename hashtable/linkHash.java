package ReadAgain.dataAndAlgo.hashtable;

import java.util.LinkedList;

public class linkHash {

    public int [] data;
    public LinkedList<Integer> adj[];

    public linkHash(int capacity){
        this.data = new int[capacity];
        adj = new LinkedList[capacity];
        for(int i = 0; i < capacity; i++){
            adj[i] = new LinkedList<>();
        }
        for(int i = 0; i < capacity; i++){
            data[i] = -1;
        }
    }

    //向散列表中插入数据
    public void insert(int val){
        int address = val % data.length;
        if(data[address] != -1){
            adj[address].add(val);
            return;
        }
        data[address] = val;
    }

    // 查询
    public void find(int val){
        int address = val % data.length;
        if(data[address] != val){
            for(int i = 0; i < adj[address].size(); i++){
                if(adj[address].get(i) == val){
                    System.out.println("该数字存在于链表中！");
                    return;
                }
            }
        }
        else{
            System.out.println("该数字存在于一维的结构中！");
        }
    }

    // printAll
    public void printAll(){
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
            for(int j = 0; j < adj[i].size(); j++){
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}
