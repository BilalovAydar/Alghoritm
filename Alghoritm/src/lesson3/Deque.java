package lesson3;

public class Deque<Item> {
    private Item[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private  int begin = 0;
    private  int end = 0;

    public Deque(int capacity) {
        if(capacity <=0 ){
            throw new IllegalArgumentException("bad capacity "+ capacity);
        }
        list = (Item[]) new Object[capacity];
    }

    public Deque() {
        list = (Item[]) new Object[DEFAULT_CAPACITY];
    }
    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == list.length;
    }
    private void resize(int newSize){
        Item[] tempArr = (Item[]) new Object[newSize];
        System.arraycopy(list,0,tempArr,0,list.length);
        list = tempArr;
    }

    private int nextIndex(int index){
        return (index + 1) % list.length;
    }

    public Item removeLeft(){
        Item value = peekLeft();
        size--;
        list[begin]=null;
        begin = nextIndex(begin);
        return value;
    }
    public Item peekLeft(){
        if (isEmpty()){
            throw new StackOverflowError("stack empty ");
        }
        return list[begin];
    }
    public Item removeRight(){
        Item value = peekRight();
        System.out.println(value);
        size--;
        end--;
        list[end]=null;
        end++;
        System.out.println(end);
        return value;
    }
    public Item peekRight(){
        if (isEmpty()){
            throw new StackOverflowError("stack empty ");
        }
        return list[end];
    }
    public void insertRight(Item item){
        if (isFull()){
            throw new StackOverflowError();
        }
        size++;
        list[end]=item;
        end = nextIndex(end);
        System.out.println(end);
    }
    public void insertLeft(Item item){
        if (isFull()){
            throw new StackOverflowError();
        }
        size++;
        begin = 0;

        Item temp = item;
        Item temp1 = item;
        for (int i = 0; i < size; i++) {
            if (i % 2 != 0){
                temp = list[i];
            list[i] = temp1;}
            if (i % 2 == 0){
                temp1 = list[i];
                list[i] = temp;}
        }
        end = nextIndex(end);
        System.out.println(end);
        //list[begin]=item;
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
