package pl.sdacademy.test1;

import java.util.LinkedList;

public class lifo {

    private LinkedList<Integer> list = new LinkedList<Integer>();

    public void push(Integer item) {
        list.addFirst(item);
        System.out.println("Dodano: " + item);
    }

    public Integer pop() {
        System.out.println("Usunięto: " + list.getFirst());
        return (Integer) list.removeFirst();
    }

    public Integer peek() {
        return list.getFirst();
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String args[]) {
        lifo stack = new lifo();
        System.out.println("Stos Push:");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        System.out.println("\nStos Pop:");
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
}

