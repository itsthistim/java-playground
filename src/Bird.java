public class Bird extends Animal implements Flyable {

    private final double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeSound() {
        IO.println("Chirp chirp!");
    }

    @Override
    public void fly() {
        IO.println("*" + this.getName() + " flies away*");
    }

    @Override
    public String toString() {
        return "Bird{" + "wingSpan=" + wingSpan + '}';
    }
}
