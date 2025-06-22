public class MyClass {
    public static void main(String args[]) {
        Animal blobfish = new Animal(4, "Bob", true, 3, 'A');
        blobfish.ded();
    }
}

class Animal {
    int fins;
    String name;
    boolean isLiving;
    double age;
    char bloodType;

    public Animal(int fins, String name, boolean isLiving, double age, char bloodType) {
        this.fins = fins;
        this.name = name;
        this.isLiving = isLiving;
        this.age = age;
        this.bloodType = bloodType;
    }

    void ded() {
        isLiving = false;
        System.out.println(this.name + " is ded");
        System.out.println(name + " died at " + age);
        System.out.println(this.name + " was a menace");
    }
}

class Pigeon extends Animal {
    public Pigeon(String name, double age) {
        super(2, name, true, age, 'B');
    }

    void killBob() {
        System.out.println(this.name + " killed Bob");
    }
}

class Bird extends Animal {
    int legs;

    public Bird(int legs, String name, boolean isLiving, double age, char bloodType) {
        super(0, name, isLiving, age, bloodType);
        this.legs = legs;
    }

    void killBob() {
        System.out.println(this.name + " killed Bob");
    }
}
