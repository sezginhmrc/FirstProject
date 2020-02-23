package day49;

public class Tesla extends Vehicle implements Autonomous, Chargable  {

    int horsePower ;
    String model ;
    public  Tesla(int year, int horsePower,String model){
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }
    public void start(){
        System.out.println(model + " is turning on");
    }
    public void selfDrive(){
        System.out.println(model + " is self drive car");
    }
    public void goForward(){
        System.out.println(model + " going forward");
    }
    public void charging(){
        System.out.println(model + " is chargable car");
    }
    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
    public static void main(String[] args) {

        Tesla t1 = new Tesla(2020,5,"CyberTruck");
        t1.start();
        t1.goForward();
        t1.selfDrive();
        t1.charging();
        System.out.println(t1);
    }
}
