package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";
        //Task :
        // hero code is superman and identity is clar kent
        // the initial of the Hero is CK

        //Logic 1 : split this String by dash - to get 2 pieces of string array
        // to get 2 pieces of String into a String array

        String [] heroSplitted = hero1.split("-");
        System.out.println("heroSplitted = " + Arrays.toString(heroSplitted));

        System.out.println("Hero code is = " + heroSplitted[0] + " And indentity is = " + heroSplitted[1]);


        System.out.println();
        String fullName ="Clark Kent";
        // the initial of the Hero is CK
        // i can just use fullName variable to finish this task

        //LOGIC 1 : get the first letter of full name
        // then get first letter after the space
        // concatenate them
        // downside is what if we have middle name
        // solution, instead of looking for the letter after first space
        // look for last index of space then next character

        //LOGIC 2 :
        // We already have full name stored in fullName variable
        // split by space and we will get firstName(middle name) lastName
        // get the first letter of full nae
        // then get the last name using last item index
        // get the first character then concatenate
        // Clark Kent -->> [Clark Kent] Clarck ->C Kent->K ---->CK

        String[] fullNameSplitted = fullName.split(" ");
        System.out.println("fullNameSplitted = " + Arrays.toString(fullNameSplitted));

        // last name will be always the last element of splitted full full name
        // no mater the name has middle name or not
        String lastName= fullNameSplitted[fullNameSplitted.length-1] ;
        System.out.println("lastName = " + lastName);

        System.out.println("Initial of the hero is = " + fullName.charAt(0) + lastName.charAt(0));
    }
}
