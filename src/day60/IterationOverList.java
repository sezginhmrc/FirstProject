package day60;

import java.util.*;

public class IterationOverList {

    public static void main(String[] args) {


        Set <Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        System.out.println(numbers);

        numbers.forEach(each -> System.out.println(each));
        // for each loop is iterable method . and can be used over any collection


        Iterator<Integer> it1 = numbers.iterator();



        System.out.println("it1.hasNext() = " + it1.hasNext());
        // returns true if iteration has more elements
        System.out.println("it1.next() = " + it1.next()); // 1
        // returns  next element in the iteration
        it1.remove();
        System.out.println("it1.next() = " + it1.next()); // 2
        it1.remove();
        System.out.println("it1.next() = " + it1.next());// 3
        it1.remove(); // 3 removed
        //
        System.out.println("it1.next() = " + it1.next()); // 4
        it1.remove();
        System.out.println("it1.next() = " + it1.next()); // 5
        it1.remove();
        System.out.println("it1.hasNext() = " + it1.hasNext()); // false


        System.out.println(numbers);
        // since we removed element 3 using  the iterator
        // it will print 1 2 4 5







       /* List<Integer > numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.forEach(each1 -> System.out.print(each1+""));*/




    }
}
