package day15;

public class SubStringPractice {
    public static void main(String[] args) {

        //getting the part of the String out of another String
                      //0123456789012345
        String movie = "Lord Of The Ring";
        // Sub String will return part of another string
        // starting from beginning index until right before ending index



        // I want to get the String 'of' from this movie

        String wordOf = movie.substring(5,7);
        System.out.println("wordof = " + wordOf);

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);



        // get from the second word till last word

        // String movie = "Lord Of the Ring" ;
     //   int startingPoint = movie.indexOf(" ") + 1;  // logical !
       // int endingPoint = movie.length();

      //  System.out.println("second word till last : "
       // + movie.substring((startingPoint,endingPoint));
            String secondWordTillLast = movie.substring(5,16);

            System.out.println ("second Word TillLast = " + secondWordTillLast);

            // if you want to start from somewhere and just get the rest of the String
            // above method will work, however there is even better method
            // if you provide only one parameter to substring method

            // it wil just start from that location and get till the ned
            String secondToLast = movie.substring(5);
            System.out.println("secon to last = " + secondToLast);
             System.out.println(movie.substring(5));


            //with this in mind : TASK
            // you know the index already

            //String movie = "Lord Of The Ring" ;
            // reverse Lord Of The Ring -->> Ring Of The Lord
            String wordRing = movie.substring(12);
            String wordOfThe = movie.substring(4,12);
            String wordLord = movie.substring(0,4) ;

            System.out.println(wordRing + wordOfThe + wordLord);

        // TURN-->> Lord Of The Ring -->> Ring Of The Java Lord
        System.out.println(wordRing + wordOfThe + "Java " + wordLord);

    }
}
