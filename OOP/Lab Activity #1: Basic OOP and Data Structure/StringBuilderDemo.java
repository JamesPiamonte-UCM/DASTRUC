import java.util.ArrayList;

// Student class
class Student {

    private String studentID;
    private String name;
    private String course;
    private int yearLevel;

    // Constructor
    public Student(String studentID, String name, String course, int yearLevel) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
        this.yearLevel = yearLevel;
    }

    // Display student information
    public void displayInfo() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + yearLevel);
        System.out.println();
    }
}

// StudentManager class
class StudentManager {

    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
        }
    }
}

// Main class
class studenManager {
    public static void main(String[] args) {

        StudentManager studentRecord = new StudentManager();

        // Add exactly 2 students
        studentRecord.addStudent(new Student("24947285", "James C. Piamonte", "BSIT-2", 2));
        studentRecord.addStudent(new Student("12345678", "Jerald B. Carrillo", "BSME-2", 2));

        // Display students
        studentRecord.displayAllStudents();
    }
}
