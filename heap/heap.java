package ReadAgain.dataAndAlgo.heap;

public class heap {
    private int[] data;
    private int n;
    private int count;

    public heap(int capacity){
        this.data = new int[capacity];
        this.n = capacity;
        this.count = 0;
    }

    // insert MaxHeap
    // 自下往上堆化：将数据添加到数组的末尾，然后依次比较进行堆化
    public void insert(int val){
        if(count >= n) return;
        data[count] = val;
        int i = count;

        while((i - 1) / 2 > 0 && data[(i - 1)/2] < data[i]){
            swap(data,(i - 1) / 2, i);
            i = (i - 1) / 2;
        }
        count++;
    }

    // delete top
    // 从上往下进行堆化
    public void removeMax(){
        if(count == 0) return;
        data[0] = data[count];
        count--;
        heapify(data,count,0);
    }

    private void heapify(int [] data, int n, int i){
        while(true){
            int maxPos = i;
            if(i * 2 + 1 < n && data[i * 2 + 1] > data[i]) maxPos = 2 * i + 1;
            if(i * 2 + 2 < n && data[i * 2 + 2] > data[maxPos]) maxPos = 2 * i + 2;
            if(maxPos == i) break;
            swap(data,i,maxPos);
            i = maxPos;
        }
    }


    public void swap(int [] data, int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public static void main(String[] args){
        heap demo = new heap(5);
        demo.insert(1);
        demo.insert(4);
        demo.insert(2);
        demo.insert(3);
        demo.insert(5);

        for(int item: demo.data){
            System.out.print(item + " ");
        }
    }
}
