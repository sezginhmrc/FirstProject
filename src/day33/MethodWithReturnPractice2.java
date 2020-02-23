package day33;

public class MethodWithReturnPractice2 {

    // task is converting daycode into word !
    // if the number is not beetween 1-7 return FUNDAY!
    public static String getDaysOfTheWeekFromNumber (int dayCode){
        String day = "";
        switch (dayCode){
            case 1 :
                return "Monday";
            case 2 :
                return "Tuesday";
            case 3 :
                return "Wednesday";        //without break and day and print !!
            case 4 :
                return "Thursday";
            case 5 :
                return "Friday";
            case 6 :
                return "Saturday";
            case 7 :
                return "Sunday";
            default:
                System.out.println("FUNDAY");
        }

        return day ;
    }
    //another Solution same task (Array)

    public static String getDaysOfTheWeekFromNumbers (int dayCode){
    String [] days = new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    String day = "";
            if(dayCode>=1 && dayCode<=7){
                day = days[dayCode-1]; // logic behind -1 is index of elements !!
            } else {
                day = "Funday";
            }
            return day ;
    }

    //LastTAskOfDay
    //Create a class called ReturnKeywordPractice with main
    //calculateAndReturnAge
    //Write a method accept a birth year and return the age :
    //the birth year should be within the range of 1900-2020
    //if not return 0

        public static void main(String[] args) {

        System.out.println(getDaysOfTheWeekFromNumber(2));
        System.out.println(getDaysOfTheWeekFromNumber(5));

        System.out.println(getDaysOfTheWeekFromNumbers(3));
            
        // Another solution
            int [] allCodes = {5,3,11,4,23};
            String day = getDaysOfTheWeekFromNumber(allCodes[3]);
            System.out.println("Day = "+ day);
            
         // another solution
            // with Array numbers
            // testing  every numbers in Array ! with  method of getDaysOfTheWeekFromNumber
         for (int eachCode : allCodes){
             System.out.println(getDaysOfTheWeekFromNumber(eachCode));
        }
        
                    


    }


}
