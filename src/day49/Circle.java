package day49;

public class Circle extends Shape {

    int radius;

    public void calculateArea() {
       this.area = Math.PI * radius ;
    }

    public void draw() {
        System.out.println("Drawing a circle ");
    }

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {
        Circle c1 = new Circle("Round table", 10);
        c1.calculateArea();
        c1.draw();
        System.out.println(c1);

    }
}
