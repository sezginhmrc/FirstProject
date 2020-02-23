package day52;

public class AudiBook extends  Book {

    double duration ;

    public AudiBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    public void displayBookInfo(){
        System.out.println("Displaying the Audibook");
    }


    public void listen (){
        System.out.println("Listening the audibook");
    }

    @Override
    public String toString() {
        return "AudiBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
