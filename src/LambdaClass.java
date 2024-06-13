@FunctionalInterface // functional interfaces are those which only have one method in their interface
interface test{
    void faaltu();
}
public class LambdaClass {
    public static void main(String[] args) {
        test obj = () -> {
            System.out.println("hello world");
        };
        obj.faaltu();
    }
}
