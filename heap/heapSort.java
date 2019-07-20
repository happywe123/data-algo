package ReadAgain.dataAndAlgo.heap;

public class heapSort {

    public void sorted(int [] data,int length){
        for(int i = length / 2 - 1; i >= 0; i--){
            heapify(data,i,length);
        }

        for(int i = length - 1; i >= 0; i--){
            swap(data,0,i);
            heapify(data,0,i);
        }
    }

    private void heapify(int [] data, int i,int n){
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
        heapSort demoSort = new heapSort();
        int [] data = {1,7,5,4,3,10,9,8,6};
        demoSort.sorted(data,data.length);
        for(int item: data){
            System.out.print(item + " ");
        }
    }
}
