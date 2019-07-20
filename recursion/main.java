package ReadAgain.dataAndAlgo.recursion;

/**
 * 1.编程实现斐波那契求值 f(n) = f(n - 1) + f(n - 2)
 * 2.编程实现一个求阶乘
 * 3.编程实现一个数据集合的全排列
 */
public class main {

     // 3.
     // 调用方式：
    // int[] a={1, 2, 3, 4}; printPermutations(a, 4, 4);
    // k 表示要处理的子数组的数据个数
    public void printPermutations(int[] data, int n, int k) {
        if (k == 1) {
            for (int i = 0; i < n; ++i) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < k; ++i) {
            int tmp = data[i];
            data[i] = data[k-1];
            data[k-1] = tmp;

            printPermutations(data, n, k - 1);

            tmp = data[i];
            data[i] = data[k-1];
            data[k-1] = tmp;
        }
    }

    //1.
    public int feibonaqie(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return feibonaqie(n - 1) + feibonaqie(n - 2);
    }
    //2.
    public int jiecheng(int n){
        if(n == 1) return 1;
        return n * jiecheng(n - 1);
    }


    public static void main(String[] args){
        main demo = new main();
        int [] data =  {1,2,3};
        demo.printPermutations(data,3,3);

//        System.out.println(demo.jiecheng(5));
       // System.out.println(demo.feibonaqie(3));
    }
}
