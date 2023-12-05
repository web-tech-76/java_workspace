package basics.inner;

public class InnerClassexample1Client {


    public static void main(String[] args) {
        InnerClassExample innerClassExample = new InnerClassExample();
        InnerClassExample.A a = innerClassExample.new A();

        System.out.println(a.methodA());
        System.out.println("InnerClassexample1Client.main" + InnerClassExample.B.methodB());
    }
}
