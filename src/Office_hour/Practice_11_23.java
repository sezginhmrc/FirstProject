package Office_hour;

public class Practice_11_23 {
    public static void main(String[] args) {
        //you have 4 switches in your home to turn on
        // bd
        // lr
        // kt
        // ha

        String targetOption = "lr" ;

        switch (targetOption)  {
            case "bd" :
                System.out.println(" you have turned on bedroom light");
                break ;
            case "lr" :
                System.out.println("you have turned on living room light");
                break ;
            case "kt" :
                System.out.println("You have turned on kitchen room light");
                break ;
            case "ha" :
                System.out.println("You have turned on hallrom light");
                break ;
            default:
                System.out.println("there is no valid operation !");

        }






    }
}
