package ReadAgain.dataAndAlgo.dontaiguihua;

public class minSum {

    public int minDistDP(int [][] matrix,int n){
        int[][] states = new int[n][n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += matrix[0][i];
            states[0][i] = sum;
        }
        sum = 0;
        for(int i = 0; i < n; i++){
            sum += matrix[i][0];
            states[i][0] = sum;
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                states[i][j] = matrix[i][j] +
                        Math.min(states[i][j - 1],states[i - 1][j]);
            }
        }
        return states[n - 1][n - 1];
    }

    public static void main(String[] args){
        minSum demo = new minSum();
        int [][] matrix = {{1,3,5,9},
                           {2,1,3,4},
                           {5,2,6,7},
                           {6,8,4,3}};
        System.out.println(demo.minDistDP(matrix,4));
    }
}
