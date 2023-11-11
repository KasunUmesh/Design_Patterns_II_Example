package lk.ijse.creational.singleton_Pattern;

public class SignletonDemo {
    public static void main(String[] args) {
        SignletonObject signletonObject = SignletonObject.getInstance();
        signletonObject.showMessage();
    }
}
