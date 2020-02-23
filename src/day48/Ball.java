package day48;

public class Ball implements Bouncible {

    String shape ;
    String color ;

    public void bounce(){
        System.out.println("This " + shape + " and " + color + " ball is bouncing if gravitis is " + gravity);
    } // i can acces anything in instanc method ( gravity static )


    public Ball(String shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
