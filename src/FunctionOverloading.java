public class FunctionOverloading {
    public static void main(String[] args) {
        fun(10);
        fun("kartikey sharma");
    }

    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
