package lesson4;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        linkedList.insert("Petr",20);
        linkedList.insert("Ivan", 23);
        linkedList.display();
        System.out.println("delete");
        linkedList.delete();
        linkedList.display();
        System.out.println();
        System.out.println("delete");
        linkedList.delete();
        linkedList.display();
        System.out.println();
        doubleLinkedList.insert("Petr", 30);  //DoubleLinkedList
        doubleLinkedList.display();
        System.out.println();
        doubleLinkedList.insert("Ivan", 33);
        doubleLinkedList.display();
        System.out.println();
        doubleLinkedList.insert("Vlad", 34);
        doubleLinkedList.display();
        System.out.println();
        doubleLinkedList.insert("Vasya", 35);
        doubleLinkedList.display();
        System.out.println("Volod");
        doubleLinkedList.insertLast("Volodya", 40);
        doubleLinkedList.display();
        doubleLinkedList.delete(); // delete
        System.out.println();
        doubleLinkedList.display();
        doubleLinkedList.delete();
        System.out.println();
        doubleLinkedList.display();
        System.out.println("StackList");
        StackList stackList = new StackList();
        stackList.push("Ivan",20);
        stackList.push("Petr",22);
        stackList.push("Vasya",23);
        stackList.display();
        System.out.println();
        while (!stackList.isEmpty()){
            stackList.display();
            stackList.pop();
            System.out.println();
        }
        Queue queue = new Queue();
        queue.insert("Vasya",20);
        queue.insert("Petya",25);
        queue.insert("Vova",27);
        queue.display();
        System.out.println();
        while (!queue.isEmpty()){
            queue.display();
            queue.delete();
            System.out.println();
        }
        System.out.println("Cписок для итератора");
//        linkedList.display();   // Exception in thread "main" java.lang.NullPointerException
//        System.out.println();
//        Iterator iterator = new Iterator(linkedList);
//        while (!iterator.atEnd()){
//            iterator.getCurrent().display();
//        }
        Iterator iterator = new Iterator(linkedList);
        iterator.insertBefore("Ivan",20);
        iterator.insertBefore("Vasya",24);
        iterator.insertAfter("Vlad",28);
        iterator.insertBefore("Petr",23);
        iterator.reset();
        while (!iterator.atEnd()){
              iterator.getCurrent().display();
              iterator.nextLink();
        }
        System.out.println();

        LinkedList linkedList1 = new LinkedList();
        Iterator iterator1 = new Iterator(linkedList1);
        iterator1.insertBefore("Ivan",20);
        iterator1.insertBefore("Vasya",24);
        iterator1.insertAfter("Vlad",28);
        iterator1.insertBefore("Petr",23);
        iterator1.reset();
        while (!iterator1.atEnd()){
            iterator1.getCurrent().display();
            iterator1.deleteCurrent();
        }
        System.out.println();
        linkedList1.display();
    }
}
