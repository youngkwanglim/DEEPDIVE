package classEx02;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.show();
        a.sound();

        Cat c = new Cat();
        c.show();
        c.sound();

        Dog d = new Dog();
        d.show();
        d.sound();

        Animal ap = null;
        ap = new Cat();
        ap.show();
        ap.sound();

        ap = new Dog();
        ap.show();
        ap.sound();
    }
}
