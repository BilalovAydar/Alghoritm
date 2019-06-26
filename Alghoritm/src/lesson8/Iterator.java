package lesson8;

public class Iterator {
    private Link current;
    private Link previous;
    private LinkedList list;
    private int size;

    public Iterator(LinkedList list){
        this.list = list;
        this.reset();
        this.size = list.getSize();
    }

    public int getSize(){
        return this.size;
    }

    public void reset(){
        current = list.getFirst();
        previous = null;
    }

    public boolean atEnd(){
        return (current.next == null);
    }

    public void nextLink(){
        previous = current;
        current = current.next;
    }

    public Link getCurrent(){
        return current;
    }

    public void insertAfter(Link newLink){
        if (list.isEmpty()){
            list.setFirst(newLink);
            current = newLink;
            size = list.getSize();
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
            size = list.getSize();
        }
    }

    public void insertBefore(Link newLink){
        if(previous == null){
            newLink.next = list.getFirst();
            list.setFirst(newLink);
            reset();
            size = list.getSize();
        }
        else{
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
            size = list.getSize();
        }
    }

    public int deleteCurrent(){
        int name = current.data;
        if (previous == null){
            list.setFirst(current.next);
            reset();
            size = list.getSize();
        } else {
            previous.next = current.next;
            if (atEnd()){
                reset();
                size = list.getSize();
            } else {
                current = current.next;
                size = list.getSize();
            }
        }

        return name;
    }


}
