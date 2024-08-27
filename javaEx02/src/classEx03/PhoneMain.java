package classEx03;

public class PhoneMain {
    public static void main(String[] args) {
        SamsungPhone samsung = new SamsungPhone();
        IPhone iphone = new IPhone();
        samsung.receiveCall();
        iphone.receiveCall();

        ISmartPhone isp = new SamsungPhone();
        isp.sendCall();

        ISmartPhone isp2 = new IPhone();
        isp2.sendCall();
    }
}
