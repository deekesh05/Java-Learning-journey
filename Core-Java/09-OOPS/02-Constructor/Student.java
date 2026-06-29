class Student {

    String name;
    int age;

    // Default Constructor
    // Automatically call when object is created
    Student() {

        System.out.println("Default Constructor Called");
    }
    // Parameterized Constructor
    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }
    // Method
    void display() {

        System.out.println("Student Name : " + name);
        System.out.println("Student Age  : " + age);
    }
    public static void main(String[] args) {

        // Default Constructor Call
        Student s1 = new Student();

        // Values assign  manually
        s1.name = "Rahul";
        s1.age = 21;

        s1.display();

        System.out.println();

        // Parameterized Constructor Call
        Student s2 = new Student("Deekesh", 22);

        s2.display();
    }
}