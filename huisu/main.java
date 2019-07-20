package ReadAgain.dataAndAlgo.huisu;

/**
 * 1.利用 回溯算法 求解 八皇后 问题
 * 2.利用 回溯算法 求解 0-1 背包问题
 */

public class main {
    //1.

    int [] result = new int[8];

    public void cal8queues(int row){
        if(row == 8){
            printqueens(result);
            return;
        }

        for(int column = 0; column < 8; column++){
            if(isOK(row,column)){
                result[row] = column;
                cal8queues(row + 1);
            }
        }
    }

    public boolean isOK(int row, int column){
        int leftup = column - 1;
        int rightup = column + 1;

        for(int i = row - 1; i >=0; i--){
            if(result[i] == column) return false;
            if(leftup >= 0){
                if(result[i] == leftup) return false;
            }
            if(rightup < 8){
                if(result[i] == rightup) return false;
            }
            leftup--;
            rightup++;
        }
        return true;
    }

    public void printqueens(int [] result) {
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (result[row] == column) System.out.print("Q" + " ");
                else System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 2.
    public int maxW = Integer.MIN_VALUE;

    public void f(int i, int cw, int[] items, int n, int w){
        if (cw == w || i == n) {
            if (cw > maxW) maxW = cw;
            return;
        }
        f(i+1, cw, items, n, w);
        if (cw + items[i] <= w) {
            f(i+1,cw + items[i], items, n, w);
        }
    }

    public static void main(String[] args){
        main demo = new main();
//        int [] items = {2,3,4,5,6};
//        demo.f(0,0,items,5,9);
//        System.out.println(demo.maxW);

       demo.cal8queues(0);
    }
}
