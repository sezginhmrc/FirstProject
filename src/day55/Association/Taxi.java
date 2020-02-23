package day55.Association;

//Building relationship using the instance fields
// Taxi - Engine - Driver - Passengers


public class Taxi {

// ASSOCIATION -> Some objects are related to some other  objects by some way -> association
// Taxi must have engine to work.
// Taxi must have driver
// But taxi still can be driven witout driver
// HAS-A relationship -> Association

    // Encapsulate all the fields for Homework

   private int plateNumber ;
   private Engine eng ; // Association !
     private Driver d ;
    // just like String, we have class Engine
    // so I can use it as data type
    // when you create a class it can be a data type
    // We use Engine class as a instance variable
    // This is not inheritance relationship
    // This is Association
    // Engine has to be inside Taxi..
    // Engine type association with taxi that taxi can work..
    // This is something we have done before (HAS-A Relationship)

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }

    public Driver getD() {
        return d;
    }

    public void setD(Driver d) {
        this.d = d;
    }
    // Our own custom type is part of Taxi class


    public Taxi(int plateNumber, Engine eng, Driver d) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.d = d ;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", Engine=" + eng +
                ", Driver=" + d +
                '}';
    }
}
class Engine {

    String type ;
    int horsePower ;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
class Driver {

    String name ;
    int driverId ;

    public Driver(String name, int driverId) {
        this.name = name;
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverId=" + driverId +
                '}';
    }
}