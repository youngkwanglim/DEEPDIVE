package classEx02;

public class Child extends Parent {
    private int c;

    public void setChild(){
        c = 20;
    }

    public void showChild(){
        super.showParent();
        System.out.println("자식클래스 c = " + c);
    }
}
