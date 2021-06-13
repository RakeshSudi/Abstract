public class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("Run slow");
    }

    @Override
    public void eat() {
        System.out.println("meo meo");
    }
}
