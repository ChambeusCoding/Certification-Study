public class Student {
    private String name;
    private int age; 
    private String studentId;
    private double gpa;
    
    public Student(String name, int age, String studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName() {
        this.name = name;
    }

    public void setAge() {
        this.age = age;
    }

    public void setStudentId() {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return String.format("Student ID: %s | Name: %s | Age: %d | GPA: %.2f", 
                studentId, name, age, gpa);
    }

}
