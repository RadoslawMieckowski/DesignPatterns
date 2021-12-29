package Patterns.behavioral.observer.YT;

public class YTUser implements Observer{
    private String name;
    private int videosToWatch;

    public YTUser(String name){
        this.name=name;
        videosToWatch=0;
    }
    @Override
    public void update() {
        videosToWatch++;
        System.out.println("Hi "+name+"! You have "+videosToWatch+" videos to watch!  ;)");
    }
}
