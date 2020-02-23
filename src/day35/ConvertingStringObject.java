package day35;

public class ConvertingStringObject {
    public static void main(String[] args) {

       /* float f6 = Float.parseFloat("3.14f");
        System.out.println("f6 = " + f6);*/
       
       float f = Float.parseFloat("3.14f");
        System.out.println("f = " + f); // it converted a string from float wrapper class to the primitive type ;
        
        
        
        String sentence = "I bought 3 tomato and the price was 3.14 each";
        String [] split = sentence.split(" ");
       // int count = Integer.parseInt(split[2]);
        int count = Integer.parseInt(split[2]); // returns a int (primitive)
        System.out.println("count = " + count);

        
        float price = Float.parseFloat(split[split.length-2]);
        System.out.println("price = " + price);
        
        //   float totalPrice = count * price ;
        System.out.println("totalPrice = " + count*price);
        
        
        int count1 = Integer.parseInt("2");
        System.out.println("count1 = " + count1);
        // Integer.parseInt ("NumberHere")
        // it returns an int value converted from String

        //Integer.valueOf("numberHere")
        // it return an Integer object by wrapping up the number

        // both of them converted from String



        


            }



        }


