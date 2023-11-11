package lk.ijse.structural.decorator_Pattern;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redShapeCircle = new RedShapeDecorator(new Circle());
        Shape redShapeRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Without decorator");
        circle.draw();
        System.out.println("\nWith red shape decorator");
        redShapeCircle.draw();
        System.out.println("\nWith red shape decorator");
        redShapeRectangle.draw();
    }
}
