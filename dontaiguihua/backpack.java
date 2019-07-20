package ReadAgain.dataAndAlgo.dontaiguihua;

public class backpack {

    // 二维数组标记状态
    public void knapsack(int [] weight, int n, int w){
        boolean [][] states = new boolean[n][w + 1];
        states[0][0] = true;
        if(weight[0] < w) states[0][weight[0]] = true;

        for(int i = 1; i < n; i++){
            for(int j = 0; j <= w; j++){
                if(states[i - 1][j] == true){
                    states[i][j] = true;
                }
            }

            for(int j = 0; j <= w - weight[i]; j++){
                if(states[i - 1][j] == true){
                    states[i][j + weight[i]] = true;
                }
            }
        }

        for(int i = w; i >= 0; i--){
            if(states[n - 1][i] == true){
                System.out.print(i + " ");
            }
        }
    }

    // 一维数组标记状态
    public void knapsack2(int [] weight, int n, int w){
        boolean [] states = new boolean[w + 1];
        states[0] = true;
        if(weight[0] < w){
            states[weight[0]] = true;
        }

        for(int i = 1; i < n; i++){
            for(int j = w - weight[i]; j >= 0; j--){
                if(states[j] == true){
                    states[j + weight[i]] = true;
                }
            }
        }

        for(int i = w;i >= 0; i--){
            if(states[i] == true )
                System.out.print(i + " ");
        }
    }

    // 背包升级版
    public void knapsack3(int [] weight, int [] values,int n, int w){
        int [][] states = new int[n][w + 1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < w + 1; j++){
                states[i][j] = -1;
            }
        }

        states[0][0] = 0;
        if(weight[0] < w){
            states[0][weight[0]] = values[0];
        }

        for(int i = 1; i < n; i++){
            for(int j = 0; j <= w; j++){
                if(states[i - 1][j] >= 0){
                    states[i][j] = states[i - 1][j];
                }
            }

            for(int j = 0; j <= w - weight[i]; j++){
                if(states[i - 1][j] > 0){
                    int v = states[i - 1][j] + values[i];
                    if(v > states[i][j + weight[i]]){
                        states[i][j + weight[i]] = v;
                    }
                }
            }
        }

        int maxValue = -1;
        for(int j = w; j >= 0; j--){
            if(states[n - 1][j] > maxValue){
                maxValue = states[n - 1][j];
            }
        }
        System.out.println(maxValue);

    }


    public static void main(String[] args){
        int [] weight = {2,2,4,6,3};
        int [] values = {1,2,3,4,5};
        backpack demo = new backpack();
        demo.knapsack3(weight,values,5,9);
    }
}
