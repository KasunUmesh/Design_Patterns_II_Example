package lk.ijse.behavioral.strategy_Pattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.println("Add operation : "+ context.executeOperation(1,2));

        Context context1 = new Context(new SubstractOperation());
        System.out.println("Subtract operation : "+ context1.executeOperation(1,2));

        Context context2 = new Context(new MultiplyOperation());
        System.out.println("Multiple operation : "+ context2.executeOperation(1,2));
    }
}
