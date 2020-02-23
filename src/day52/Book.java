package day52;


public abstract class Book implements KnowledgeBank {

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public void takeNote(){
        System.out.println("Taking notes from the book");
    }


    public abstract void displayBookInfo();



}
