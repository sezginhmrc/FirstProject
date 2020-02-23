package day64;

import java.util.LinkedList;
import java.util.Queue;

public class QuequeInterfaceDemo {

    public static void main(String[] args) {

        // This is a first in first out queue
        // whichever items comes in first, it will get removed first
        // when we use remove method from the queue interface

        // idea is you add and remove the item Queque collection

        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("Review the class");
        taskQueue.add("do your home work");
        taskQueue.add("attend the class");
        taskQueue.add("Say bye to java");
        taskQueue.add("Say bye to java");

        System.out.println(taskQueue);

        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());
        System.out.println("taskQueue.remove() = " + taskQueue.remove());

    }
}
