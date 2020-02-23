package day32;

public class StringActions {

        public static void printStringWithDashInBetween(String name){


            //// printStringWithDashInBetween
            //    // it has one String parameter called name
            //    // it will do following in method body
            //    // print each and every character of a String with dash in between
            //    // excluding the last one Akbar -->> A-k-b-a-r
            //    // logic : keep concatenating - after each character
            //    // when it comes to last character don't add it

            for (int i = 0; i <name.length() ; i++) {
                System.out.print(name.charAt(i));
                if(i!=name.length()-1){
                    System.out.print("-");
                }

            }
            System.out.println();
        }

        public static void printZtoA(){

            for (char iChar ='Z'; iChar>='A'; iChar--){
                System.out.print(iChar+" ");
            }
            System.out.println();
        }

        //printAtoZ
        //create a method has no parameter
        //and print Z-A in one line if(i!=name.length()-1){

        public static void printAtoZ(){

            for (char iChar = 'A'; iChar <='Z' ; iChar++) {
                System.out.print(iChar+" ");

            }
            System.out.println();
        }

    public static void main(String[] args) {

          printStringWithDashInBetween("Sezgin");
          printStringWithDashInBetween("Ikra");
          printStringWithDashInBetween("Rana");

          printAtoZ();
          printZtoA();

    }

}
