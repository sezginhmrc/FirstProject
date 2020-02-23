package day37;

import java.util.*;

public class AkbarTAsk {


    public static void main(String[] args) {

        //Given a ArrayList of 6 Integer 1,3,7,2,12,7
        //insert 100 in between each numbers
        //For example :
        //1,100,3 ,100, 7, 100, 2, 100, 12, 100, 7
        //
        //Optionally make it a method
        //write a static void method that accept a ArrayList of integer object and insert 100 in between items.

       /* List<Integer> ad100 = Arrays.asList(1,3,7,2,12,7);
        int size = ad100.size();*/

      /*  for (int i = 0; i <size ; i++) {
            if(i%2==1){
                ad100.add(i,100);
            } else if (i%2==0){
                ad100.add(i,100);
            }

        }
        System.out.println(ad100);
*/

        Integer[] numbers={1,3,7,2,12,7};
        ArrayList<Integer> numberlst= new ArrayList<Integer>(Arrays.asList(numbers));
        for (int i = 0; i <numberlst.size() ; i++) {
            if(i%2==1){
                numberlst.add(i,100);
            }
        }
        System.out.println(numberlst);


        }






    }

