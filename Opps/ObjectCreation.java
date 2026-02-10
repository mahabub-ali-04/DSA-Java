package Opps;

public class ObjectCreation {
    public static void main(String args[]){
        Student s1 = new Student();
            s1.study();
            s1.name = "Arbaj";
            s1.roll = 52;
            System.out.println(s1.name);
            System.out.println(s1.roll);
        
    }

}

class Student {
    String name;
    int roll;

    void study() {
        System.out.println("bachelors of Technology");
    }
}
