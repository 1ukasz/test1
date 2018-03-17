package pl.sdacademy.test1;

import java.util.*;

public class lifo2 {

    static void push(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("Stos: " + st);
    }

    static void pop(Stack st) {
        System.out.print("pop -> ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stos: " + st);
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        System.out.println("Stos: " + st);
        push(st, 1);
        push(st, 2);
        push(st, 3);
        pop(st);
        pop(st);
        pop(st);
        try {
            pop(st);
        } catch (EmptyStackException e) {
            System.out.println("Pusty stos");
        }
    }
}