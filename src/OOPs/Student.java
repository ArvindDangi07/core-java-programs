package OOPs;

public class Student {
    String name;
    int age;

    // Master constructor — does the actual assignment
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // No-arg constructor — chains to the master constructor
    Student() {
        this("Unknown", 0);   // MUST be the first statement
    }

    // One-arg constructor — chains to the master constructor, defaults age
    Student(String name) {
        this(name, 18);        // MUST be the first statement
    }

    public void display() {
        System.out.println("Student name is " + name + " and age is " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Arvind Dangi", 21);
        s1.display();

        Student s2 = new Student();
        s2.display();

        Student s3 = new Student("Sachin Kumar");
        s3.display();
    }
}