package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {

        int[] scores = new int[4];
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100 ;

      // this the the way array now we gonna use the for array !
      //  System.out.println(scores[0]);
      //  System.out.println(scores[1]);
      //  System.out.println(scores[2]);
      //  System.out.println(scores[3]);

        int itemCount = scores.length; // this size of array new int [4]  // this is property not a method !
        
        //how do we get the size of any array object
        // array object has a property called length
        
        for (int i = 0; i <itemCount ; i++) {
            System.out.println(scores[i]);

            //how do we get the size of any array object
            // array object has a property called length

            // how do we get the car count of a String
         //  String name = "Jon Snow" ;
         //  int charCount = name.length() ;


        }
        // this reversingArrayLooping

        int lastChartIndex = itemCount-1 ;
        for (int i = lastChartIndex ; i >=0 ; i--) {
            System.out.println(scores[i]);
            
        }
        
        
        
    }
}
