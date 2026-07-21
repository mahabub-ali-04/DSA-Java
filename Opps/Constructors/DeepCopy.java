public class DeepCopy {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "john";
        s1.age = 21;
        s1.marks[0] = 90;
        s1.marks[1] = 95;
        s1.marks[2] = 100;

        Student s2 = new Student(s1);

        System.out.println(s1.marks[0]);
        System.out.println(s1.marks[1]);
        System.out.println(s1.marks[2]);
        System.out.println();

        s2.marks[2] = 88;

        System.out.println("After Change");
        System.out.println(s2.marks[0]);
        System.out.println(s2.marks[1]);
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

    // Deep Copy
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.marks = new int[s.marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }
}
