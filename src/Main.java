void main() {

    IO.println("Welcome to the Animal Kingdom!");

    ArrayList<Animal> animals = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    int choice;
    boolean valid;
    String name = "";
    int age = 0;

    do {
        // clear console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        IO.println("Please choose an animal to interact with:");
        IO.println("1. Dog");
        IO.println("2. Bird");
        IO.println("3. Fish");
        IO.println("0. Exit");

        choice = scanner.nextInt();
        valid = choice >= 1 && choice <= 3;

        if (valid) {
            IO.print("Name: ");
            name = IO.readln();

            IO.print("Age: ");
            age = scanner.nextInt();
        }

        switch (choice) {
            case 1: // dog
                IO.print("Breed: ");
                String breed = IO.readln();
                animals.add(new Dog(name, age, breed));
                break;
            case 2: // bird
                IO.print("Wing span: ");
                double wingSpan = scanner.nextDouble();
                animals.add(new Bird(name, age, wingSpan));
                break;
            case 3: // fish
                IO.print("Water type: ");
                String waterType = IO.readln();
                animals.add(new Fish(name, age, waterType));
                break;
            case 0:
                for (Animal animal : animals) {
                    animal.printInfo();
                    IO.println(animal.toString());
                    animal.makeSound();

                    if (animal instanceof Dog) {
                        ((Dog) animal).fetch();
                    } else if (animal instanceof Bird) {
                        ((Bird) animal).fly();
                    } else if (animal instanceof Fish) {
                        ((Fish) animal).swim();
                    }
                }
                break;
            default:
                IO.println("Invalid choice. Please choose 1, 2, or 3.");
        }
    } while (choice != 0);
}
