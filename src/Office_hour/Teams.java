package Office_hour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teams {

    public static void main(String[] args) {

        // Create an object
        // This object created by parent class
        BOATeams.companyName = "Microsoft";
        BOATeams team1 = new BOATeams();
        team1.teamName = "BugBusters";
        team1.teamSize = 9 ;
        team1.teamTypes = "UAT";

        BOATeams team2 = new BOATeams() ;
        team2.teamName = "Patriots";
        team2.teamSize = 15 ;
        team2.teamTypes = "Scrum Team";


        // This object created by child class
        ScrumTeam team3 = new ScrumTeam() ;
        team3.standUp(); // From Child class
        team3.teamSize = 10 ; // From Parent Class



    }
}
