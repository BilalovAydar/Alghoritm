package lesson3;

public class MyStack<Item> {
    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    //private boolean reverse;

    public MyStack(int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException("bad capacity " + capacity);
        }
        list = (Item[]) new Object[capacity];
    }
    public MyStack(){
        list =(Item[]) new Object[DEFAULT_CAPACITY];
    }
    public boolean isFull(){
        return (this.size == this.list.length);
    }
    public boolean isEmpty(){
        return (this.size == 0);
    }
    private void resize(int newSize){
        Item[] arrTemp = (Item[]) new Object[newSize];
        System.arraycopy(list, 0, arrTemp, 0, list.length);
        list = arrTemp;
    }
    public void push(Item item){
        if(isFull()){
            throw new StackOverflowError("stack full");
        }
        list[size] = item;
        size++;
    }
    public Item pop(){
        Item temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    public Item peek(){
        if (isEmpty()){
            throw new StackOverflowError("stack empty ");
        }
        return list[size - 1];
    }

    public int size(){
        return size;
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < list.length ; i++) {
            s+= list[i] +" ";
        }
        return s;
    }

}

