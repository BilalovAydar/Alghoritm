package lesson7;

public class Stack {
    private int maxSize;
    private int[] arr;
    private int top;

    public Stack(int size){
        this.maxSize = size;
        this.arr = new int[size];
        this.top = -1;
    }
    public void push(int i){
        arr[++top] = i;
    }
    public int pop(){
        return arr[top--];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public int peek(){
        return arr[top];
    }
    public int display(){
        for (int i = 0; i <= top; i++) {
            System.out.print((char)(arr[i] + 65) + " ");
        }
        return maxSize;
    }
}
