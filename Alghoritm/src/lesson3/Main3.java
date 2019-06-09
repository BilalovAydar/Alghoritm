package lesson3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack<Character> stack = new MyStack<>();

        //MyStack<Character> stack = new MyStack<>(10);
        System.out.println(stack.toString());
        System.out.println("Введите строку, которую хотите перевернуть");
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        System.out.println(stack.toString());
        System.out.println("Переворачиваем строку");
        int l = stack.size();
        for(int i=0;i < l;i++){
            System.out.print(stack.pop());
        }
        System.out.println();

        System.out.println(stack.toString());

        MyQueue<Integer> queue = new MyQueue<>();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        System.out.println(queue.toString());
        queue.remove();
        System.out.println(queue.toString());

        Deque<Integer> deque = new Deque<>();
        deque.insertRight(10);
        System.out.println(deque.toString());
        deque.insertLeft(20);
        System.out.println(deque.toString());
        deque.insertLeft(30);
        System.out.println(deque.toString());
        deque.insertLeft(40);
        System.out.println(deque.toString());
        deque.insertLeft(50);
        System.out.println(deque.toString());
        deque.removeLeft();
        System.out.println(deque.toString());
        deque.removeRight();
        System.out.println(deque.toString());

    }
}
