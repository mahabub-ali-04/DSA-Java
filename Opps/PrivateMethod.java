package Opps;

public class PrivateMethod {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Mahabub ali";
        s1.age = 20;
        s1.roll = 52;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.roll);
        s1.setPwd(96950703);
        System.out.println(s1.getPwd());
    }

}

class Student {
    String name;
    int age;
    int roll;
    private int pwd;

    // Setter Method
    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    // Getter Method
    public int getPwd() {
        return pwd;
    }
}