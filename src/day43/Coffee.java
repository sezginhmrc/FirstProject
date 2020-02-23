package day43;
// this is my custom class and his methods ????


// A blueprint for coffee object
// with 3 constructor
// price should never be less than 0
// no coffee object with minus price should be created
// no one should change the price
// to minus for any existing coffee object

public class Coffee {

    // in this task We have encapsulation(getter and setter),
    // Constructor (Settting the inital value your object)

    //Wake up Task
    // this part is template
    // we did private the instance field by private
    private String type ;       // instance variables
    private int caffeineLevel ;
    private double price ;


    public String getType(){
            return type;
        }
  /*  public void setType(String type){
        this.type = type;
    }*/

    public int getCaffeineLevel() {
        return caffeineLevel;
    }

   /* public void setCaffeineLevel(int caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }*/

    public double getPrice() {
        return price;
    }

    // here we added the protection code in setter
    // and called this setter from constructor
    // line 64

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        } else {
            this.price = 1 ;
        }
    }

// only if you dont have any other constructor in the class
    // since we have other constructor we created one to creat an object without initilazing
    public Coffee(){ // when you go to court if you dont have lawyer court gives a one :)
       System.out.println(" No arg constructor being called yet");

    }

    // 2 args constructor to set type and caffine level
   public Coffee(String type, int caffeineLevel){
        this.type = type;
       this.caffeineLevel = caffeineLevel ;
    }

    // WAKE UP TASK TO CREATE 3 ARGS CONSTRUCTOR
    // DO NOT LET THE PRICE GO BELOW 0
    // IF IT's less than 0 make it 1$
    public Coffee (String type, int caffeineLevel, double price){
       this.type = type ;
       this.caffeineLevel= caffeineLevel;
        setPrice(price); // we called the method here
        // logic is no one can set the price minus :))
        // We can call a method inside consturctor !
        // we have a code to do below logic in setter
        // so we can call the method dircetly to out construstor
       /* if(price>0){
            this.price = price;
        } else {
            this.price = 1 ;
        }*/
    }

    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLevel=" + caffeineLevel +
                ", price=" + price +
                '}';
    }
}
