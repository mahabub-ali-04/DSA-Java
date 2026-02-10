package Opps.Encapsulation;

public class DataHiding {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setAge(21);
        System.out.println(s1.getAge());
    }

}

class Student {
    String name;
    private int age;

    // setter method
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // getter method
    public int getAge() {
        return age;
    }
}