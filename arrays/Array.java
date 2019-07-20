package ReadAgain.dataAndAlgo.arrays;


//2.实现一个大小固定的有序数组，支持动态增删改查

public class Array {
    private int [] data;
    private int count;  // 当前存放数据的大小
    private int n;    // 空间容量

    public Array(int capacity){
        this.data = new int[capacity];
        this.count = 0;
        this.n = capacity;
    }

    //insert
    public void insert(int index, int value){
        if(count == n) return;
        if(index < 0 || index > count) return;

        for(int i = count; i > index; i--){
            data[i] = data[i - 1];
        }
        data[index] = value;
        count++;
    }

    //delete
    public void delete(int index){
        if(index < 0 || index > count)
            return;

        for(int i = index; i < count - 1; i++){
            data[i] = data[i + 1];
        }
        count--;

    }

    //find
    public void find(int index){
        if(index < 0 || index > count) return;
        System.out.println(data[index]);
    }

    public void printAll(){
        for(int i = 0; i < count; i++){
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args){
        Array demo = new Array(10);
        demo.insert(0,1);
        demo.insert(1,2);
        demo.insert(2,4);
        demo.insert(3,5);
        demo.insert(4,6);
        demo.printAll();
        System.out.println();

        demo.insert(2,3);
        demo.printAll();
        System.out.println();

        demo.delete(2);
        demo.printAll();
        System.out.println();

        demo.find(2);


    }
}
