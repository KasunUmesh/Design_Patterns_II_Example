package lk.ijse.behavioral.observer_Pattern;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);

        System.out.println("Value is 1");
        subject.setState(1);
        System.out.println("Value is 10");
        subject.setState(10);
    }
}
