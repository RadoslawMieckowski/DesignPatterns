package Patterns.behavioral.observer.YT;

import java.util.ArrayList;

public class YTChannel implements Publisher{
    private String name;
    public YTChannel(String name){
        this.name=name;
    }
    ArrayList<Observer>subscribers =new ArrayList<>();

    public void publishNewVideo(){
        System.out.println(name+" published new video!");
        notifyObservers();
    }

    @Override
    public void register(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:subscribers){
            o.update();
        }
    }
}
