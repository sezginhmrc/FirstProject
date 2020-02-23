package day52;

public interface KnowledgeBank {

   public abstract void takeNote ();

    default void showTableOfContent(){
        System.out.println("Chaper");
    }
}
