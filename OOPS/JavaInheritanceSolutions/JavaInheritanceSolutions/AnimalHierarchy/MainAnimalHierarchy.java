import java.util.Scanner;

public class MainAnimalHierarchy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", 3);
        animals[1] = new Cat("Whiskers", 2);
        animals[2] = new Bird("Tweety", 1);

        for (Animal animal : animals) {
            System.out.print(animal.name + " says: ");
            animal.makeSound();
        }

    }
}
