package day52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookActions {

    public static void main(String[]args) {

        // We can refer paper book objest using ---
        // --- its own type ; PaperBook;
        // --- it's super type ; Book , Readable, KnowledgeBank, Object;
        Book b1 = new PaperBook("Java","Akbar",3);
        b1.displayBookInfo();


        // THIS IS POWER OF POLY !
        // it takes action according the object type (paperbook)
        // latebinding ( displayBookInfo) decide to run which object
        // only reference type decide what is accesible !!!
        // COMPILE TIME , RUN TIME
        // Compile time is making correct decision according the actual object
        // b1 print out papaerbook object


        // knowledgeBank is bigger cup than book
        // book implement knowledgeBank
        // i can do below casting !
        KnowledgeBank kb = b1 ;
        kb.takeNote();
        kb.showTableOfContent();


        System.out.println("-------");
        // REFERENCE TYPE IS BOOK !!!
        // ACUTAL OBJECT TYPE IS PAPERBOOK !!
        Book b3 = new AudiBook("Agile","Guljannat",1.8);
        Book b2 = new PaperBook("Selenium","Vasly",2);

        


        // Counting how many paper book we have

        int pCount = 0 ;

        List<Book> aList = Arrays.asList(b1,b2,b3);
        for(Book each : aList){
           // each.displayBookInfo();
          //  System.out.println(each.getClass().getSimpleName()); ( this is the way how we get the classes )
            if(each.getClass().getSimpleName().equalsIgnoreCase("paperbook")){
                pCount ++ ;
            }
        }
        System.out.println("Paperbook count is = " + pCount);

        // We want to get the class type name using the object


        List<Book> list = new ArrayList<>();
        list.add(new PaperBook("Tutanamayanlar","Oguz atay",5));
        list.add(new AudiBook("Yas 35","Cahit Sitki",1.5));
        list.add(new PaperBook("Uvercinka","Cemal Sureyya",4));
        list.add(new AudiBook("O ve ben","Necip Fazil",2.0));
        list.add(new PaperBook("siir","unknown",2));
        list.add(new AudiBook("unknown","unknown",1.3));





    }
}
