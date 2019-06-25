package lesson8;

public class LinkedList {
    private Link first;
    private int size;
    public LinkedList() {
        first = null;
        size = 0;
    }
    public boolean isEmpty(){
        return (first == null);
    }
    public void insert(Link newLink){
        // = new Link(data);
        newLink.next = first;
        first = newLink;
        size++;
    }
    public Link delete(){
        Link temp = first;
        first = first.next;
        size--;
        return temp;
    }
    public void display(){
        Link current = first;
        while(current != null){
            current.display();
            current = current.next;
        }
    }
    public Link find(int hash){
        Link current = first;
        while (current.hash != hash){
            System.out.println(current.hash);
            if (current.next == null){
                return null;
            }else{
                current = current.next;
            }
        }
        return current;
    }
    public Link findData(int data){
        Link current = first;
        while (current.data != data){
            System.out.println(current.hash);
            if (current.next == null){
                return null;
            }else{
                current = current.next;
            }
        }
        return current;
    }
    public Link delete(int hash){
        Link current = first;
        Link previous = first;
        while (current.hash != hash) {
            if (current.next == null)
                return null;
            else {
                previous = current;
                current = current.next;
            }
        }
            if(current == first)
                first = first.next;
            else
                previous.next = current.next;
            size--;
            return current;

    }
    public int getSize(){
        return this.size;
    }
    public Link getFirst() {
        return this.first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public Iterator getIterator(LinkedList list){
        return new Iterator(this);
    }

}
