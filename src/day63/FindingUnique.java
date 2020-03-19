package day63;

import java.util.*;

public class FindingUnique {

    public static void main(String[] args) {

        String str = "The new Link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signing page, once you signin with okta" +
                " Then you will be able to joing right away. Please do not try to register , the link is already in the email" +
                " Click to join";

        // How many unique character show up in above sentence ?

        // One way to do it
        // first find a data structure that automatically remove duplicate
        // Create a HashSet object wiouytre`    QAWSERTYU890-=\ th type Chracter
        // iterate over each chracter in above string
        // then add it to the object(HashSet) so it can remoive the duplicate for us..

        Set <Character> charSet = new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            charSet.add(str.charAt(i));
        }
        System.out.println(charSet); // Result is all chracters printed without duplicate.
        System.out.println(str.length());
        System.out.println(charSet.size());

        charSet.forEach(each-> System.out.print(each+" "));



        /*Set<String> aList = new HashSet<>(Arrays.asList(str.split(" ")));

        Iterator<String> sIter = aList.iterator();

        while (sIter.hasNext()){
            String s = sIter.next();
            System.out.println(s);
        }*/

      //  aList.forEach(each->System.out.println(each));









    }
}
