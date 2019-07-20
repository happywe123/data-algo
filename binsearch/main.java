package ReadAgain.dataAndAlgo.binsearch;


/**
 * 1.实现一个有序数组的二分查找
 * 2.查找第一个等于目标值的数
 * 3.查找最后一个等于目标值的数
 * 4.查找第一个大于等于目标值的数
 * 5.查找最后一个小于等于目标值的数
 */
public class main {

    //5.
    public int binSearch_5(int [] array,int target){
        if(array.length == 0 || array == null)
            return - 1;

        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int mid = low + ((high - low) >> 1);
            if(array[mid] <= target){
                if(mid == array.length - 1 || array[mid + 1] > target)
                    return mid;
                else{
                    low = mid + 1;
                }
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    //4.
    public int binSearch_4(int [] array,int target){
        if(array.length == 0 || array == null)
            return - 1;

        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int mid = low + ((high - low) >> 1);
            if(array[mid] >= target){
                if(mid == 0 || array[mid - 1] < target)
                    return mid;
                else
                    high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    //3.
    public int binSearch_3(int [] array,int target){
        if(array.length == 0 || array == null)
            return - 1;

        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int mid = low + ((high - low) >> 1);
            if(array[mid] > target){
                high = mid - 1;
            }
            else if(array[mid] < target){
                low = mid + 1;
            }
            else{
                if(mid == array.length - 1 || array[mid + 1] != target) return mid;
                else low = mid + 1;
            }
        }
        return -1;
    }

    //2.
    public int binSearch_2(int [] array,int target){
        if(array.length == 0 || array == null)
            return - 1;

        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int mid = low + ((high - low) >> 1);
            if(array[mid] > target){
                high = mid - 1;
            }
            else if(array[mid] < target){
                low = mid + 1;
            }
            else{
                if(mid == 0 || array[mid - 1] != target) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    // 1.
    public int binSearch_1(int [] array,int target){
        if(array.length == 0 || array == null)
            return - 1;

        int low = 0;
        int high = array.length - 1;
        while(low <= high){
            int mid = low + ((high - low) >> 1);
            if(array[mid] > target){
                high = mid - 1;
            }
            else if(array[mid] < target){
                low = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        main demo = new main();
        int [] array = {1,3,4,5,6,6,6,7,8,9};
        System.out.println(demo.binSearch_5(array,5));


//        int [] array = {1,3,5,7,9};
//        System.out.println(demo.binSearch_1(array,4));
    }
}
