package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(5, 5));

        context.setStrategy(new OperationSubstract());
        System.out.println(context.executeStrategy(5, 5));

        context.setStrategy(new OperationMultiply());
        System.out.println(context.executeStrategy(5, 5));
    }
}
