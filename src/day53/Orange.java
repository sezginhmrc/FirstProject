package day53;

public class Orange extends Fruit {

    int cLevel ;

    public Orange(String taste, String color, int cLevel) {
        super(taste, color);
        this.cLevel = cLevel;

    }


    public void getDigested() {
        System.out.println( "Orange with Vitamin C Level  " + cLevel + " has color "+color);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "cLevel=" + cLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
