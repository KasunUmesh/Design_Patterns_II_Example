package lk.ijse.structural.decorator_Pattern;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedShape(decoratorShape);
    }

    private void setRedShape(Shape redShape) {
        System.out.println("Set Red Shape");
    }
}
