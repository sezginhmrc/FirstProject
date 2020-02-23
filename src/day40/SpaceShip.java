package day40;

public class SpaceShip {
    //Create a class called SpaceShip
    //it has 4 attributes :
    //	name as String
    //	currentDirection as String  | up , down , right, left
    //	xCoordinate as int
    //	yCoordinate as int
    // few behaviours :

// 	 setInitialPosition
// 	 	accept 2 int parameters
// 	 	to provide initial position of spaceship
// 	 setDirection  void method
// 	 	accept 1 String parameter to set the direction
// 	 move1Block    void method
// 	 	accept no parameter
// 	 	and change the position according to the direction
// 	 toString method
// 	 	return String representation of Spaceship Object

    String name, currentDirection ; // up,down,right,left
    int x,y ;

    public void setInitialPosition (int newX, int newY ){
        x = newX;
        y = newY;
    }

    // accept 1 String parameter to set the direction to either up,down,right,left
    public void setDirection(String newDirection){

        // direction can only be up , down , right , left
        if (newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("left")) {

            currentDirection = newDirection;
        } else {
            System.out.println("Invalid Direction");
            currentDirection = "";
            // We set the directions empty value if user pass wrong direction
        }
    }
    /**
     * move the spaceship to 1 block according to the currect direction
     */
    public void move1Block (){
        switch (currentDirection) {
            case "right":
                x += 1;  // increasing x coordinate by 1 if spaceship move right
                break;
            case "left":
                x -= 1; // decreasing x coordinate by 1 if spaceship move left
                break;
            case "up":
                y += 1;  // increasing y coordinate by 1 if spaceship move up
                break;
            case "down":
                y -= 1;  // decreasing y coordinate by 1 if spaceship move down
                break;
            default:
                break;
        }

    }
    // add a functionality to move1Block with direction provided in one shot
    public void move1Block(String newDirection){
        // we are reusing the functionality we already have to set the direction
        setDirection(newDirection);
        move1Block();
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
// as a homework
// create a method
// let your spaceship move one more than a block