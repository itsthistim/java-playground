public abstract class Animal {

    private final String name;
    private final int age;

    public abstract void makeSound();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        IO.println("Name: " + name);
        IO.println(String.format("Age: %d", age));
    }
}
