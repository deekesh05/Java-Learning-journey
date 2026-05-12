public class Course {
    String courseName ;
    int enrolledStudents;
    static int maxCapacity ;

    Course(String courseName)
    {
        this.courseName = courseName;
    }
    public void enrollStudent(String studentName)
    {
        System.out.println(studentName + " is Enrolled in "+ courseName);
        enrolledStudents++;
    }
    public void unEnrollStudent(String studentName)
    {
        System.out.println(studentName + " is Unenrolled from " + courseName);
        enrolledStudents--;
    }
    static void setMaxCapacity(int capacity)
    {
        maxCapacity = capacity;
        System.out.println("Max Capacity of Course is "+ maxCapacity);
    }

    public static void main(String[] args) {
        Course c1 = new Course("MCA");
        setMaxCapacity(20);
        c1.enrollStudent("Deekesh");
        c1.enrollStudent("Devendra");
        Course c2 = new Course("B Tech");
        c2.enrollStudent("Devendra");
        c2.enrollStudent("Pushpendra");
        c2.unEnrollStudent("Pushpendra");






    }
}
