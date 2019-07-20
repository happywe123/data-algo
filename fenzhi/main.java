package ReadAgain.dataAndAlgo.fenzhi;

/**
 *
 * 利用分治算法求一组数据的逆序对个数
 * 注意：前面大于后面就叫逆序对
 */
public class main {

    private int count = 0;
    public int sum(int[] data, int n){
        count = 0;
        mergeSort(data,0,n - 1);
        return count;
    }


    public void mergeSort(int [] data,int low, int high){
        if(low >= high)
            return;

        int mid = low + ((high - low) >> 1);
        mergeSort(data,low,mid);
        mergeSort(data,mid + 1, high);
        merge(data,low,mid,high);
    }

    public void merge(int [] data, int low, int mid, int high){
        int [] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int index = 0;

        while(i <= mid && j <= high){
            if(data[i] > data[j]){
                count += (mid - i + 1);
                temp[index++] = data[j++];
            }
            else{
                temp[index++] = data[i++];
            }
        }

        while(i <= mid)  temp[index++] = data[i++];
        while(j <= high)   temp[index++] = data[j++];

        for(int key = 0; key < index; key++){
            data[low + key] = temp[key];
        }
    }

    public static void main(String[] args){
        int [] data = {2,4,3,1,5,6};
        main demo = new main();
        int re = demo.sum(data,data.length - 1);
        System.out.println(re);
    }
}
