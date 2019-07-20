package ReadAgain.dataAndAlgo.arrays;


/**
 * 1.实现一个支持动态扩容的数组
 * 2.实现一个大小固定的有序数组，支持动态增删改查
 * 3.实现两个有序数组合并为一个有序的数组
 */
public class main {
    //1.见 ArrayPlus

    //2.见 Array

    //3.
    public int[] mergeArr(int [] arr1, int [] arr2){
        if(arr1 == null && arr2 == null) return null;
        if(arr1 == null) return arr2;
        if(arr2 == null) return arr1;

        int len1 = arr1.length;
        int len2 = arr2.length;
        int [] maxArr = new int [len1 + len2];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < len1 && j < len2){
            if(arr1[i] <= arr2[j]){
                maxArr[index++] = arr1[i++];
            }
            else
                maxArr[index++] = arr2[j++];
        }

        while(i < len1)  maxArr[index++] = arr1[i++];
        while(j < len2)  maxArr[index++] = arr2[j++];
        return maxArr;
    }


    public static void main(String[] args){
        main demo = new main();
        int [] arr1 = {1,3,5,7,9};
        int [] arr2 = {2,4,6,8,10};
        int [] maxArr = demo.mergeArr(arr1,arr2);
        for(int item: maxArr){
            System.out.print(item + " ");
        }
    }

}
