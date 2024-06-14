@FunctionalInterface // functional interfaces are those which only have one method in their interface
interface test{
    void faaltu(int a);
}
public class LambdaClass {
    public static void main(String[] args) {
        test obj = (a) -> {
            System.out.println("hello world "+a+ " times");
        };
        obj.faaltu(5);
    }
}
