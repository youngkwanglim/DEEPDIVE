package classEx03;

public class SmartMain {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTV();
        rc.turnOn();
        rc.setVolume(50);
        rc.turnOff();

        Searchable sch = new SmartTV();
        sch.search("www.naver.com");

        SmartTV tv = new SmartTV();
        tv.turnOn();
        tv.setVolume(5);
        tv.turnOff();
        tv.search("www.naver.com");
    }
}
