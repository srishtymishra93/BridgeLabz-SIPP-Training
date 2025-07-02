import java.util.Scanner;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Chirp! Chirp!");
    }
}

public class AnimalHierarchy {
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

        // Do not close Scanner as per instructions
    }
}
