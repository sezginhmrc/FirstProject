package day35;

public class CharacterPractice {

    public static void main(String[] args) {

        //Character class has lots of static methods
        // to perform actions on char value
        Character.isDigit('2'); // checks if it is a digit number returns boolean

        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isUpperCase('A'));

        Character.toLowerCase('A'); // returning to Lower case

        System.out.println(Character.toLowerCase('A'));

        // TASK
        // get the number out of this string
        // and store it into Integer variable num

        // logical thinking is first of all im going to check each every character if it is a digit i gonna save it
        String str = "A123S123C5412F";
        String numsInStr = "" ;
        int sum = 0 ;
        for (int i = 0; i <str.length() ; i++) {
          //  System.out.println("str.charAt("+i+") "  + str.charAt(i));
                if(Character.isDigit(str.charAt(i))){ // only digit nums
                    System.out.println("str.charAt("+i+") "  + str.charAt(i));
                    numsInStr+= str.charAt(i);


                }
        }
        System.out.println(numsInStr);
        Integer num = Integer.valueOf(numsInStr);
        System.out.println("Nums in String = " + num);



        // get the sum of the numbers insdie a stirng
        // make it a method


        int mark = 90 ;
        String result = mark > 99 ? "Pass" : "Fail";
        System.out.println("result = " + result);



    }
}
