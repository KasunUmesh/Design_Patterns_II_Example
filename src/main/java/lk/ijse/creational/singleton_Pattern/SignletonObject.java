package lk.ijse.creational.singleton_Pattern;

public class SignletonObject {

    private static final SignletonObject instonce = new SignletonObject();

    private SignletonObject() {

    }

    public static SignletonObject getInstance() {
        return instonce;
    }

    public void showMessage() {
        System.out.println("working");
    }


}
