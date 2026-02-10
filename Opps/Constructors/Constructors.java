package Opps.Constructors;

public class Constructors {
    public static void main(String args[]) {
        Animal a1 = new Animal();
        Animal a2 = new Animal("Brown");
        System.out.println(a2.color);
    }

}

class Animal {
    String name;
    String color;

    // non-parameterized constructors
    Animal() {
        System.out.println("These are animals");
    }

    // parameterized Constructors
    Animal(String color) {
        this.color = color;
    }

}
