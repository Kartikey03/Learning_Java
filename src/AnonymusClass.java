interface DemoAno{
    void meth1();
    void meth2();
}

//here, i made a different class, this class is not anonymus
class Haha implements DemoAno{
    @Override
    public void meth1(){
        System.out.println("this is the first method ");
    }

    @Override
    public void meth2() {
        System.out.println("This is the second method");
    }
}
public class AnonymusClass {
    public static void main(String[] args) {
        //here, it is running from the anonymus class, i just created below
        DemoAno inteface = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("this is an anonymus method 1");
            }

            @Override
            public void meth2() {
                System.out.println("this is an anonymus method 1");
            }
        }; // the semicolon indicates that the class is closed

        inteface.meth1();
        inteface.meth2();


        Haha notAnonymus = new Haha();
        notAnonymus.meth1();
        notAnonymus.meth2();
    }
}
