package day21;

public class Task2 {
    public static void main(String[] args) {
        
        // get out of loop when b found !
        String name = "sezgin naber";
        int charCount = name.length();
        int lastChartIndex = charCount-1 ;


        for (int i = 0; i <lastChartIndex ; i++) {
            String currentChar = name.substring(i,i+1);

            if(currentChar.equalsIgnoreCase("n")){
                break;
            }
            System.out.println( currentChar);
        }

        }

    }
