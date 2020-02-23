package day53;

public class FruitShopUtility {
    // i can create a class that would be blueprint for fruitShop


    public static void main(String[] args) {

        Fruit f1 = new Apple("crispy","hot red","Gala");
        Fruit f2 = new Orange ("sour","orange",12);

        displayFruit(f1);
        displayFruit(f2);
        displayFruit(new Apple("tasteless", "red","Golden"));
        System.out.println("----");
        digestBetter(f2);
        digestBetter(new Orange("Sweet","Yellowish",2));

        System.out.println("getMyFavoriteFruit() = " + getMyFavoriteFruit());
        Fruit x = getMyFavoriteFruit();
        x.getDigested();
        System.out.println("Favorite fruit is " + x);
        System.out.println(getFavoriteByType(4));
        displayFruit(x);
    }
    public static Fruit getFavoriteByType(int x ) {
        if (x == 1) {
            return new Apple("Sweet", "red", "Sari elma");
        } else if (x == 2) {
            return new Orange("Sour", "green", 2);
        } else {
            return null; // we can return for any method that refturn reference ttype
        }
    }
    public static void displayFruit(Fruit anyFruit ){
        System.out.println("Displaying fruit \n" +anyFruit);

    }

    public static void digestBetter(Fruit f){
        for (int i = 0; i <4 ; i++) {
            f.getDigested();
        }
        System.out.println(f);
    }

    public static Fruit getMyFavoriteFruit( ){
      // Fruit f = new Orange("Crispy","Green",100);
       return  new Orange("Sweet","Green",10) ;
    }






}
