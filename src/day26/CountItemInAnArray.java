package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHeros = {"Batman", "Iron Man", "Captain America",
                "Spiderman", "Hulk", "Black panter",
                "Hulk", "Black panter",
                "Batman", "Iron Man"};

        System.out.println("Marvel heros = " + Arrays.toString(marvelHeros));

        int sizeOfArray = marvelHeros.length;
        System.out.println("sizeOfArray = " + sizeOfArray);

        String itemToSearch = "Captain America";
        int countOfItem = 0;

        for (String eacHero : marvelHeros) {
            if (eacHero.equals(itemToSearch)) {
                countOfItem++;
            }
        }
        System.out.println("countOfItem = " + countOfItem);
        int countOfBlack = 0 ;

        for (String eachHeros : marvelHeros){
            if(eachHeros.toLowerCase().contains("black")){ // chaining method or you can just eachHeros.contains("Black")
            countOfBlack ++ ;
            }

        }
        System.out.println(" name contains black partner is  = " + countOfBlack);

        String longest = marvelHeros[0] ;
        for ( String each : marvelHeros){
            if(each.length()> longest.length()){
                longest = each ;

            }

        }
        System.out.println("longest word is = " +longest );
    }
}
