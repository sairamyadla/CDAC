class Student {
    private String name;
    private int rollNumber;
    private double grade;
    public Student(String name, int rollNumber, double grade) {
    this.name = name;
    this.rollNumber = rollNumber;
    this.grade = grade;
    }
    public void displayDetails() {
    System.out.println("Student Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
    Student student = new Student("SAI", 11, 9.5);
    student.displayDetails();
    }
   }
   