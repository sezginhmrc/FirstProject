package day18;


public class EvenNumber_ForLoop {
    public static void main(String[] args) {
        // skip counting by 2
        for (int e = 0; e <= 100; e += 2) {
            System.out.print(e + " ");
        }

        System.out.println();
        // skip counting by 3

        for (int o = 0; o < 100; o += 3) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("EVEN NUMBER");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
              }

            }
        System.out.println();
        // the shortcut fori and enter or tab !!
        for (int z = 0; z < 100 ; z++) {
            if(z%5==0 && z%3==0){
                System.out.println( z + "IS FIZ BUZZ NUMBER");
            }

        }
        }


    }


