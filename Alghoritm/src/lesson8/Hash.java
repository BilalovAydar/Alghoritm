package lesson8;

public class Hash {
    private LinkedList hashArr;
    private int arrSize;
    //private Item nonItem;

    public Hash(){
        //this.arrSize = size;
        //hashArr = new Item[arrSize];
        //nonItem = new Item(-1);
        hashArr = new LinkedList();
    }
    public void display(){
        Iterator iterator = new Iterator(hashArr);
        while (!iterator.atEnd()){
            iterator.nextLink();
                System.out.println(iterator.getCurrent().getKey());
        //System.out.println("***");
        }

    }
    public int hashFunc(int key){
        return key % (hashArr.getSize() + 1);
    }
    public void insert(Link item){
        int key = item.getKey();
        int hashVal = hashFunc(key);
        item.setHash(hashVal);
        hashArr.insert(item);
    }
    public Link delete(int key){
        int hashVal = hashFunc(key);

            if (hashArr.find(hashVal).getKey() == key){
               return hashArr.delete(hashVal);
            }

        return null;
    }

    public Link find(int key){
        int hashVal = hashFunc(key);
        System.out.println(hashVal);
        return hashArr.find(hashVal);
    }
    public Link findData(int key){

        return hashArr.findData(key);
    }
}
