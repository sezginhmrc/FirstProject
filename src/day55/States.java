package day55;

public abstract class States {

    String stateName ;

  public  void tax(){
      System.out.println("Tax rate is 5 %");
  }
  public final void method1(){
      System.out.println("Method 1 from state class");
  }

}

class Kentucky extends States {
    String stateName = "KY";
    @Override
   public void tax(){
        System.out.println("Tax Rate in KY is 6%");
    }
    public void KFC (){
        System.out.println("KY has Kfc");
    }
    public final void method(int a ){
        System.out.println("Method 1 from kentucky class");
    }
}

class California extends  States{
    String stateName = "CA";

    @Override
    public void tax() {
        System.out.println("Tax rate in CA is 9%");
    }

    public void hollywood (){
        System.out.println("There is Hollywood in CA");
    }
}
