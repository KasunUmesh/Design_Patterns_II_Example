package lk.ijse.behavioral.observer_Pattern;

public class OctalObserver extends Observer{
    public OctalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal Value: " +Integer.toOctalString(subject.getState()));
    }
}
