package day26;

import java.util.Arrays;

public class StringSpilitPractice {

    public static void main(String[] args) {

        String  students = "Sezgin, Abbos, Hasan, Muge, Osman, Ali, Mehmet" ;

        students = students.replace(" ","");
        System.out.println("students = " + students); // first i removed the spaced and it split by comma

        // first get all the name into String array called namesArray

        // Spell the name of each person in this format
        // name = name ....
        // S-e-z-g-i-n ....
        // optionally count a from each name and print

        String [] namesArrays = students.split(",");

        System.out.println(Arrays.toString(namesArrays));
        System.out.println("length of namesArray1 is " + namesArrays.length);
        int studentCount = namesArrays.length;

        for (int x = 0; x <studentCount ; x++) {
            String name = namesArrays[x];
            System.out.println("name = " + name);
            for (int i = 0; i <name.length() ; i++) {
                System.out.print(name.charAt(i) + "-" );

        }
            System.out.println();
    //    String name = namesArrays[0] ; // sezgin // s-e-z-g-i-n
      //  int countOfName = 0 ;
        
    //    for (int i = 0; i <name.length() ; i++) {
      //      System.out.print(name.charAt(i) + "-" );
       //     if(name.equals("Sezgin")){
         //       countOfName++ ;
     //       }

       // }
    //    System.out.println("countOfName = " + countOfName);

   //     String name1 = namesArrays[1]

     //   for (int i = 0; i < name1.length() ; i++) {
//            System.out.print(name1.charAt(i) + "-" );

        }



    }
}
