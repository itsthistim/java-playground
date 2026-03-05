public class Fish extends Animal implements Swimmable {

    private final String waterType;

    public Fish(String name, int age, String waterType) {
        super(name, age);
        this.waterType = waterType;
    }

    @Override
    public void makeSound() {
        IO.println("Blub blub!");
    }

    @Override
    public void swim() {
        IO.println("*" + this.getName() + " swims around 🐟*");
    }

    @Override
    public String toString() {
        return "Fish{" + "waterType='" + waterType + '\'' + '}';
    }
}
