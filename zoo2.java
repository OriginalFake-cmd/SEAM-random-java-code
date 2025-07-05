import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Animal fish = new Animal(4, "Bob", true, 3, 'A');
        fish.ded();
        fish.eat();
        fish.sleep();
        Lion lion = new Lion(4, "Leo", true, 23.0, 'B');
        System.out.println("Lion's name: " + lion.name);
        lion.eat();
        lion.sleep();
        Monkey monkey = new Monkey(4, "David", true, 2.0, 'B');
        System.out.println("Monkey's name: " + monkey.name);
        System.out.println("The " + monkey.species + " makes noises.");
        monkey.eat();
    }
}

class Animal {
    int limbs;
    String name;
    boolean isLiving;
    double age;
    char bloodType;
    protected String species; 
    boolean isEating;
    boolean isSleeping;

    public Animal(int limbs, String name, boolean isLiving, double age, char bloodType) {
        this.limbs = limbs;
        this.name = name;
        this.isLiving = isLiving;
        this.age = age;
        this.bloodType = bloodType;
        this.species = "blobfish";
        this.isEating = false;
        this.isSleeping = false;
    }

    public void ded() {
        isLiving = false;
        System.out.println(this.name + " is ded.");
        System.out.println(name + " died at " + age + ".");
        System.out.println(name + " was a " + species + ".");
    }

    public void eat() {
        isEating = true;
        System.out.println(this.name + " is eating.");
    }

    public void sleep() {
        isSleeping = true;
        System.out.println(this.name + " is sleeping.");
    }
}

class Lion extends Animal {
    public Lion(int limbs, String name, boolean isLiving, double age, char bloodType) {
        super(4, "Leo", true, 23.0, 'B');
        this.species = "Lion"; 
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal(4, "Lion", true, 23.0, 'B');
    }
}

class Monkey extends Animal {
    public Monkey(int limbs, String name, boolean isLiving, double age, char bloodType) {
        super(4, "David", true, 2.0, 'B');
        this.species = "Monkey"; 
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal(4, "Monkey", true, 2.0, 'B');
    }
}


