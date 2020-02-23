package day52;

public class PaperBook extends Book implements Readable {

    int weight ;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    public void displayBookInfo(){
        System.out.println("PaperBook's name is "
                + name + ", an the author is " + author+" " +
                "and it weigh is " + weight + " pound");
    }

    public void read(){
        System.out.println("Rading the " +name+" written by "+author);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
