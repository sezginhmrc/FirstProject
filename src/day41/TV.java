package day41;
// today is topic is private the class


public class TV {           // this recipe we dont want to coook here cook in the kitchen
                            // TV is blueprint (recipe)
//TV
//   attributes :
//	brand , isOn , currentChannel
//	Stirng , boolean , int   (range from 1-50)

//   behaviours :
//   	turnOn
//   	turnOff
//   	getcurrentChannel
//   	setcurrentChannel (newChannelNumber)
//   	moveForward
//	moveBackward

    String name ;
    boolean isOn ;
    int currentChannel ;

    // we creating templed for tv
    // this is intance field

    // if it is off i wanna turn it on
    public void turnOn (){
        if(isOn==false){ // checking for equality
            System.out.println("Turning on TV");
            isOn = true ; // assingnin the value of isOn to true
        }
    }
    //if it is on i wanna turn it off
    public void turnOff(){
        if(isOn==true){
            System.out.println("Turning off Tv");
        }
    }
    // the value of current channel for the Tv
    // This is setter and getter
    // intellij generate it for you
    public int getCurrentChannel (){
        return currentChannel ;
}
    public void setCurrentChannel( int newChannel ){
        if(newChannel<0 || newChannel>50){
            System.out.println("INVALID CHANNEL");
            return;
            // early exit from the method
            // dipnot yo can use the return to exit early from method
        }
        if(isOn==true){
            currentChannel = newChannel;
        } else {
            System.out.println("TURN ON THE TV FIRST");
        }
    }

    public void moveForward (int newChannel){
        currentChannel = newChannel ;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
