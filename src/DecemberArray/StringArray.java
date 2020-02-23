package DecemberArray;

public class StringArray {

    public static void main(String[] args) {

        String [] names = {"Sezgin", "Ozlem", "Eddie", "Emine","Nurdan","Rana"};
        int namesArraySize = names.length;
        System.out.println("Array size is  " +namesArraySize);

        for (int i = 0; i <names.length ; i++) {
            String currentName = names[i];
            System.out.println(currentName + " has a character of " + currentName.length());
            System.out.println("Last item is " + names[names.length -1]);
            System.out.println("Middle item is " + names.length/2);

        }


    }
}
