package classEx03;

public class IPhone implements ISmartPhone {
    private String name;

    public IPhone() {
        name = "아이폰";
    }

    @Override
    public void sendCall() {
        System.out.println(name + "으로 전화를 겁니다.");
    }

    @Override
    public void receiveCall() {
        System.out.println(name + "으로 전화를 받습니다.");
    }

    @Override
    public void sendSMS() {

    }

    @Override
    public void receiveSMS() {

    }
}
