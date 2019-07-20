package ReadAgain.dataAndAlgo.stack;

public class arrStack {
    public int [] data;
    public int n;
    public int top;

    public arrStack(int capacity){
        this.data = new int [capacity];
        this.n = capacity;
        this.top = 0;
    }

    //进栈
    public void IntoSatck(int val){
        if(top == n){
            System.out.println("栈空间已满！");
            return;
        }
        data[top] = val;
        top++;

    }

    //出栈
    public void OutStack(){
        if(top == 0){
            System.out.println("栈为空！");
            return;
        }
        top--;
        System.out.println(data[top]);
    }

    //打印栈数据
    public void printAllStack(){
        int flag = top;
        while(flag > 0){
            System.out.print(data[--flag] + " ");
        }
    }
}
