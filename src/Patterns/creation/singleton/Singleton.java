package Patterns.creation.singleton;

public class Singleton {
    private static Singleton instance=new Singleton();
    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
    public void message(){
        System.out.println("I'm the only instanance of the Singleton class. Deal with it!");
    }
}
