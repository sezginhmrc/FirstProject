package Repl_And_Practice;

import java.util.Scanner;

public class MethodPractice {
//// write a code to count from 1 to 10
//    // give a name count1to10
//    //no need for object when being called
//    //it should be accesible anywhere in your project
//    // it does not return any value
//    // does not need any external data when being called

    public static void count1to10(){

        for (int i = 1; i <=10; i++) {
            System.out.print(i+" ");
        }
        System.out.println("--------");
    }

    // Create a method called countDownFrom20tillOne
    // Create a method to print odd numbers from 1-100 : printOddNumbers1to100()
    // Create a method to spell your name :  Seda -->> S-e-d-a

    public static void countDownFrom20tillOne(){

        for (int i = 20; i >0 ; i--) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println("--------");
    }

    public static void nameSpell (){

        String name = "Seda";
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i));
            if(i != name.length()-1){
                System.out.print("-");
            }
        }
        System.out.println();
        }





    public static void main(String[] args) {

        count1to10();
        countDownFrom20tillOne();
        nameSpell();
        voting(23);
        voting(11);
        reversePrintMyOwnName();
        reversePrintAnyName("sezgiN");
        printLastCharOfName("sezgin");
        printStringWithDashInBeetween("sezgin");
        printAtoZ();

    }

    ////printAtoZ
    //        //create a method has no parameter
    //        //and print Z-A in one line if(i!=name.length()-1){

    public static void printAtoZ(){
        for (char iChar = 'Z'; iChar>='A'; iChar--){
            System.out.print(iChar+" ");
            if(iChar!='A'){
                System.out.print("-");
            }
        }
    }

    //// printStringWithDashInBetween
    //    // it has one String parameter called name
    //    // it will do following in method body
    //    // print each and every character of a String with dash in between
    //    // excluding the last one Akbar -->> A-k-b-a-r
    //    // logic : keep concatenating - after each character
    //    // when it comes to last character don't add it

    public static  void  printStringWithDashInBeetween (String name){

        for (int i = 0; i <name.length(); i++) {
            System.out.print(name.charAt(i));
            if(i != name.length()-1){
                System.out.print("-");

            }
        }
        System.out.println("--------");

    }
    //printLastCharacterOfName
    //* create a method that has 1 String parameter called name
    //	and print last character of that name

    public static void printLastCharOfName(String name){
        System.out.println(name.charAt(name.length()-1));
        System.out.println("--------");

    }

    ////reversePrintAnyName
    //    //* create a method that has 1 String parameter called name
    //    //	and print that name in reversed order

    public static void reversePrintAnyName(String name){

        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i)+" ");

        }
        System.out.println();
    }

    ////reversePrintMyOwnName
    //        //* create a method that has no parameter
    //        //	and print your name in reversed order

    public static void reversePrintMyOwnName(){
        String name = "Sezgin";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i)+" ");


        }
        System.out.println();
    }


    public static void voting(int age ){


        if(age>18){
            System.out.println("you are eligile for voting ");
        } else{
            System.out.println("sorry, we are not able to process your transaction");
        }
        System.out.println();
    }


}
