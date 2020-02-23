package day49;


public class Square extends Shape {

     int length ;

     @Override
    public void  calculateArea() {
         System.out.println("Area is " +area + (length*length));
     }
    public void draw (){
        System.out.println("Draw 4 eqal line with 90 degree, lenghth " +length + " with color " + COLOR);
    }
    public Square(String name,int length){
         super(name);
         this.length = length;
    }
    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {
        Square s1 = new Square("Box",20);
        s1.calculateArea();
        s1.draw();
        System.out.println(s1);
    }
}
