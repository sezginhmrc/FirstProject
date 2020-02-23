package day22;

public class StringArray {
    public static void main(String[] args) {

        String[] houseHolders = new String[4];
        houseHolders[0] = "Rana";
        houseHolders[1] = "Sezgin";
        houseHolders[2] = "Yetkin";
        houseHolders[3] = "Nurdankuruca";
        //for (int i = 0; i < 4; i++) {
          //  System.out.println(houseHolders[i]);

            // immutable means you can not change the internal structure of the object
            // if you have String abc = "Hello"
            // if you do abc.toUppercase -->> it will create new String object "HELLO"
            // and it does not change original hello at all !!
            // not resizable --> specifically for array
            // we can not change the size of array once we create them with certain size
            // However , we can change the elements inside this array
            // and it means : IT IS NOT IMMUTABLE
            int itemCount = houseHolders[3].length();
            int lastCharIndexOf3 = itemCount - 1;

            for (int j = 0; j < lastCharIndexOf3 - 3; j++) {
                String current3charsOf3 = houseHolders[3].substring(j, j + 3);
                System.out.println(current3charsOf3);

            }


        }


    }


