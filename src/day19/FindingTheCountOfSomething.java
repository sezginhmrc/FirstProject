package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {

        // from 1-100 count how many numbers can be divided by 15  ??
            int counter = 0 ;


            for ( int i = 1 ; i<=100 ; i ++) {
                if(i % 15 ==0 ) {
                    System.out.println(i);

                   // counter = counter + 1 ;
                    // counter += 1 ;
                    ++ counter ;
                }

        }
        System.out.println("counter = " + counter );

        String name = "Kahren Mkrtchya Said Argaphlu Hasan Ankar Rana Aral";
        //System.out.println(  name.charAt(0) =='a'     );

        int countOfA = 0;

        for (int x = 0; x < name.length(); x++) {

            System.out.println(   name.charAt( x )     );
            char curretChar = name.charAt(x);

            if (curretChar == 'a') {
                System.out.println("BINGO FOUND IT !! ");
                ++countOfA;
            }

        }

        System.out.println("countOfA = " + countOfA);
        }


    }
