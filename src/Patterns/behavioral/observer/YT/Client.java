package Patterns.behavioral.observer.YT;

public class Client {
    public static void main(String[] args) {
        YTChannel  ytChannel =new YTChannel("Ask Japanese");

        YTUser ytUser1=new YTUser("Radek");
        ytChannel.register(ytUser1);
        ytChannel.publishNewVideo();
        System.out.println("-------------------------");

        YTUser ytUser2=new YTUser("Matt");
        ytChannel.register(ytUser2);
        ytChannel.publishNewVideo();
        System.out.println("-------------------------");

        ytChannel.unregister(ytUser1);
        ytChannel.publishNewVideo();


    }
}
