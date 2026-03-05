public class Dog extends Animal {

    private final String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void fetch() {
        IO.println("*brings stick*");
    }

    @Override
    public void makeSound() {
        IO.println("Woof woof!");
    }

    @Override
    public String toString() {
        return "Dog{" + "breed='" + breed + '\'' + '}';
    }
}
