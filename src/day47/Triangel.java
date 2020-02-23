package day47;

public class Triangel extends Shape{

    int height ;
    int base ;

    public Triangel (  int height, int base){

        super("Triangel");
        this.height = height;
        this.base = base;

    }
    @Override
    public void calculateArea(){
      area=(height*base)/2;
    }

    @Override
    public String toString() {
        return "Triangel{" +
                "height=" + height +
                ", base=" + base +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
