package ReadAgain.dataAndAlgo.sorted;

/**
 * 1.实现归并排序、插入排序、冒泡排序、选择排序
 * 2.编程实现 O(n) 时间复杂度内找到一组数据的第 K 大元素
 */
public class main {

    // 快速排序的变体
    public static int quickPlus(int [] arr,int k){
        if(arr == null || arr.length < k)
            return -1;

        int partition = partition(arr,0,arr.length - 1);
        while(partition + 1 != k){
            if(partition + 1 < k){
                partition = partition(arr,partition + 1,arr.length - 1);
            }
            else{
                partition = partition(arr,0,partition - 1);
            }
        }
        return arr[partition];
    }

    private static int partition(int [] arr, int p, int r){
        int pivot = arr[r];

        int i = p;
        for(int j = p; j < r; j++){
            if(arr[j] <= pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,r);
        return i;
    }

    private static void swap(int [] arr, int i, int j){
        if(i == j)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 归并排序
    public void mergeSort(int [] arr, int low, int high){
        if(arr == null || arr.length == 0)
            return;

        if(low >= high) return;
        int mid = low + ((high - low)>>1);
        mergeSort(arr,low,mid);
        mergeSort(arr,mid + 1,high);
        mergeOne(arr,low,mid,high);
    }

    private void mergeOne(int[] arr,int low,int mid,int high){
        int i = low;
        int j = mid + 1;
        int [] temp = new int[high - low + 1];
        int index = 0;
        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp[index++] = arr[i++];
            }
            else{
                temp[index++] = arr[j++];
            }
        }

        while(i <= mid) temp[index++] = arr[i++];
        while(j <= high) temp[index++] = arr[j++];

        for(int key = 0; key < index; key++){
            arr[low + key] = temp[key];
        }
    }

    // 选择排序
    public void selectSort(int [] arr){
        if(arr == null || arr.length == 0)
            return;

        int len = arr.length;
        for(int i = 0; i < len - 1; i++){
            int index = i;
            for(int j = i; j < len; j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            if(index != i){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }

    // 插入排序
    public void insertTo(int [] arr){
        if(arr == null || arr.length == 0)
            return;

        int length = arr.length;
        for(int i = 1; i < length - 1; i++){
            int cur = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > cur){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = cur;
        }
    }

    // 冒泡排序
    public void bubbleSort(int [] array){
        if(array == null || array.length == 0)
            return;

        int length = array.length;
        for(int i = 0; i < length - 1; i++){
            for(int j = i; j < length - 1 - i; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        main demo = new main();
        int [] array = {2,9,3,10,7,4,1,41};
        // 1,2,3,4,7,9,10,41
        System.out.println(demo.quickPlus(array,2));

    }
}
