package lesson8;

public class Link {
    public int hash;
    public int data;
    public Link next;
    public Link(int data){
        this.data = data;
    }
    public void display(){
        System.out.println("data: " + this.data + " hash: " + this.hash);
    }
    public int getKey(){
        return this.data;
    }
    public void setHash(int hash){
        this.hash = hash;
    }
}
