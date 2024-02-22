package AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory1.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory1.getShape("SQUARE");
        shape2.draw();

        Shape shape3 = shapeFactory1.getShape("CIRCLE");
        shape3.draw();

        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);

        Shape shape4 = shapeFactory2.getShape("RECTANGLE");
        shape4.draw();

        Shape shape5 = shapeFactory2.getShape("SQUARE");
        shape5.draw();

        Shape shape6 = shapeFactory2.getShape("CIRCLE");
        shape6.draw();
    }
}