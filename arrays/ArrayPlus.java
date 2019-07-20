package ReadAgain.dataAndAlgo.arrays;

public class ArrayPlus {
    private int [] data;
    private int count;
    private int n;

    public ArrayPlus(int capacity){
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    // insert
    public void insert(int index, int value){
        if(index < 0 || index > count) return;

        for(int i = count; i > index; i--){
            data[i] = data[i - 1];
        }

        data[index] = value;
        count++;
        if(count == n){
            for(int i = 0; i < n; i++){
                System.out.print(data[i] + " ");
            }
            System.out.println("启动扩容");
            addCapacity();
        }
    }

    //动态扩容
    public void addCapacity(){
        int [] dataPlus = new int[2 * n];
        int index = 0;
        for(int i = 0; i < n; i++){
            dataPlus[index++] = data[i];
        }
        for(int i = n; i < 2 * n; i++){
            dataPlus[i] = 0;
        }
        System.out.println("扩容完成");
        for(int i = 0; i < dataPlus.length; i++){
            System.out.print(dataPlus[i] + " ");
        }
    }

    public static void main(String[] args){
       ArrayPlus demo = new ArrayPlus(5);
       demo.insert(0,1);
       demo.insert(1,2);
       demo.insert(2,3);
       demo.insert(3,4);
       demo.insert(4,5);
    }



}
