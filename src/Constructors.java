
class Hello {
    String name;
    void print(){
        System.out.println(this.name);
    }
    Hello(String name){
        this.name = name;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Hello hi = new Hello("kartikey sharma");
        hi.print();
    }
}
