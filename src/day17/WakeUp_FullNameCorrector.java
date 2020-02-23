package day17;

public class WakeUp_FullNameCorrector {

    public static void main(String[] args) {

        // in order to make first letter Upper case and rest to lowercase
                        //01234567890
        String fullName= "arYa sTarK ";
        String firstName= fullName.substring(0,4);    // arya
        String lastName = fullName.substring(5) ;     // stark
        //

        String firstNameFixed = firstName.toUpperCase().substring(0,1) + firstName.toLowerCase().substring(1);
        System.out.println(firstNameFixed);


        String lastNameFixed = lastName.toUpperCase().substring(0,1)+
                lastName.toLowerCase().substring(1);
        System.out.println(lastNameFixed);

        fullName = firstNameFixed+ " "+lastNameFixed;
        System.out.println(fullName);



    }
}
