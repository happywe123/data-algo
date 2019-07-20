package ReadAgain.dataAndAlgo.stack;

import java.util.Stack;

public class broswerInOut{

    Stack X = new Stack();
    Stack Y = new Stack();

    // 入栈
    public void insert(char s){
        X.push(s);
    }

    // 前进
    public void forward(){
        if(Y.isEmpty()){
            System.out.println("当前已经是最前面的页面了");
        }
        else{
            char temp = (char) Y.pop();
            System.out.println("前进到:" + temp);
            X.push(temp);
        }
    }

    // 后退
    public void back(){
        if(X.isEmpty()){
            System.out.println("当前页面已经是最后的页面了！");
        }
        else{
            char temp = (char) X.pop();
            System.out.println("已经后退到页面" +  X.peek());
            Y.push(temp);
        }
    }

    public static void main(String[] args){
        broswerInOut demo = new broswerInOut();
        demo.X.push('a');
        demo.X.push('b');
        demo.X.push('c');

        demo.forward();
        demo.back();
        demo.forward();
        demo.back();
        demo.back();
        demo.forward();
        demo.forward();
    }
}
