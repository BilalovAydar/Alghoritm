package lesson6;

public class Node {
    public Number person;
    public Node leftChild;
    public Node rightChild;

    public void display(){
        System.out.print(person.id + " " + person.num + " ");
    }
}
