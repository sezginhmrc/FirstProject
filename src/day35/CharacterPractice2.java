package day35;

public class CharacterPractice2 {

    public static void main(String[] args) {

        String str = "A123S123C5412F" ;
        //Add all the numbers inside the String : above String should generate 17

        char [] allChars = str.toCharArray();
        int sum = 0 ;
        for(char each : allChars){
            if(Character.isDigit(each)){
                System.out.println("each = " +each);
                int eachNum = Integer.parseInt(each+"");
                sum+= eachNum ;
            }
        }
        System.out.println("sum = " + sum);
    }
}
