
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        dog.sleep();

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.variablePractice();

        staticTest();
        System.out.println(m_s);
    }

    public void variablePractice() {
        System.out.println("variablePractice");
    }

    public static void staticTest() {
        System.out.println("staticTest");
    }

    public static int m_s = 666;
}