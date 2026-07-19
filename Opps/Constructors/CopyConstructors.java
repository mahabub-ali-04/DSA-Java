public class CopyConstructors {

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Ali";
        s1.age = 20;
        // original Copy
        System.out.println(s1.name);
        System.out.println(s1.age);
        // Copy Constructor
        Student s2 = new Student(s1);
        System.out.println(s2.name);
        System.out.println(s2.age);

        System.out.println();
        s2.name = "john";
        s2.age = 21;
        System.out.println("After modifying the copied object");
        System.out.println("Original :" + s1.name + " " + s1.age);
        System.out.println("copied :" + s2.name + " " + s2.age);
    }
}

class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        System.out.println("Original Copy");
    }

    // Copy Constructor
    Student(Student s) {
        System.out.println("Copy Constructor is called..");
        this.name = s.name;
        this.age = s.age;
    }
}