package day33;

public class ReturnKeywordPractice {

    //LastTAskOfDay
    //    //Create a class called ReturnKeywordPractice with main
    //    //calculateAndReturnAge
    //    //Write a method accept a birth year and return the age :
    //    //the birth year should be within the range of 1900-2020
    //    //if not return 0

    public static int gettingAgeFromBirthYear (int birthYear){ // we start with return 0 value to get all inputs !
        if (birthYear<=1900 || birthYear>=2020){
            return 0 ;
        } else {
            int age = 0;
            return age =  2019 - birthYear ;
        }

                

    }

    public static void main(String[] args) {
        System.out.println(gettingAgeFromBirthYear(1994));
        System.out.println("-------");
        // here testing the given Array birth years and looping each years and printing inside method of gettingAgeFromBirthYear
        // whatever inside method of gettingAgeFromBirthYear it is printing the results !!
        int [] allBirthYears = {1991,1970,1993,1945,1890};
        for (int eachYears : allBirthYears){
            System.out.println(gettingAgeFromBirthYear(eachYears));
        }


    }

}
