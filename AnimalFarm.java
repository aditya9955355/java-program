import java.util.Scanner;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal Name: " + name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    public String toString() {
        return "Dog: " + name;
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    public String toString() {
        return "Cat: " + name;
    }
}

class Cow extends Animal {
    Cow(String name) {
        super(name);
    }

    public String toString() {
        return "Cow: " + name;
    }
}

public class AnimalFarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal[] animals = new Animal[10];
        int anmlIdx = 0;

        while (true) {
            System.out.println(
                    "Press 1 to view the animals" +
                    "\nPress 2 to add animals" +
                    "\nAny other key to exit");

            String userAction = scanner.nextLine();

            if (userAction.equals("1")) {

                for (int i = 0; i < anmlIdx; i++) {
                    System.out.println(animals[i]);
                }

            } else if (userAction.equals("2")) {

                if (anmlIdx == 10) {
                    System.out.println("10 animals added already. Cannot add more animals!");
                    continue;
                }

                System.out.println(
                        "Which animal do you want to create?" +
                        "\nPress 1 for Dog" +
                        "\nPress 2 for Cat" +
                        "\nPress 3 for Cow");

                String animalChoice = scanner.nextLine();

                if (animalChoice.equals("1")) {
                    System.out.println("Enter the name of the Dog:");
                    String dogName = scanner.nextLine();
                    animals[anmlIdx++] = new Dog(dogName);

                } else if (animalChoice.equals("2")) {
                    System.out.println("Enter the name of the Cat:");
                    String catName = scanner.nextLine();
                    animals[anmlIdx++] = new Cat(catName);

                } else if (animalChoice.equals("3")) {
                    System.out.println("Enter the name of the Cow:");
                    String cowName = scanner.nextLine();
                    animals[anmlIdx++] = new Cow(cowName);

                } else {
                    System.out.println("Invalid Choice!");
                }

            } else {
                System.out.println("Exiting...");
                break;
            }
        }

        scanner.close();
    }
}