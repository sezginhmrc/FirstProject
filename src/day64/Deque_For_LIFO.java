package day64;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_For_LIFO {

    public static void main(String[] args) {
        // How do implement a LifoQueqe if not using old class called Stack
        // We can use DEQUE interface implementation

        // THIS IS LAST-IN FIRST-OUT...

        Deque<String> lifoQue = new LinkedList<>();
        // LinkedList is Deque
        // LinkedList is also Queqe
        lifoQue.add("Review the class");
        lifoQue.add("do your home work");
        lifoQue.add("attend the class");
        lifoQue.add("Say bye to java");
        lifoQue.add("Say bye to java");
        lifoQue.add("Say bye to java today");

        System.out.println(lifoQue.removeLast());
        System.out.println("lifoQue.removeFirst() = " + lifoQue.removeFirst());


    }
}
