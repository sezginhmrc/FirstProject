package day44;

public class HouseBiulder extends CyberHouse {

    String color ;

    public HouseBiulder (String design, int houseNum, String color){
            super(design,houseNum);
            this.color = color ;
    }

    @Override
    public String toString() {
        return "HouseBiulder{" +
                "color='" + color + '\'' +
                ", design='" + design + '\'' +
                ", houseNum=" + houseNum +
                '}';
    }

    public static void main(String[] args) {

        CyberHouse.neighbourName = "Park Street";
        CyberHouse.showNeighbourName();

        HouseBiulder h1 = new HouseBiulder("Aparment",292,"Blue");
        System.out.println("h1 = " + h1);

        HouseBiulder h2 = new HouseBiulder("Single",125,"White");
        h2.showAllInfo();


        CyberHouse.setNeighbourName("Kimberley ave"); // updated the neighbourName
        HouseBiulder h3 = new HouseBiulder("Pizza Shop", 1405,"red");
        h3.showAllInfo();


        CyberHouse.showNeighbourName();
        CyberHouse.neighbourName = "Robart st";
        CyberHouse.showNeighbourName();

    }

}
