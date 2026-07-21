public class ShallowCopy {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "john";
        s1.age = 21;
        s1.marks[0] = 90;
        s1.marks[1] = 95;
        s1.marks[2] = 98;

        Student s2 = new Student(s1);

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.marks[0]);
        System.out.println();

        s2.name = "Bob";
        s2.age = 20;
        s2.marks[2] = 100;
        System.out.println("After Change");
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.marks[2]);

    }
}

class Student {
    String name;
    int age;
    int marks[];

    // Default Constructor
    Student() {
        System.out.println("Before Change");
        marks = new int[3];
    }

    // Shallow Copy
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.marks = s.marks;

    }
}
