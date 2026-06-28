public class Student {

    String name;
    int rollNumber;
    String department;
    double marks;

    public Student(String name, int rollNumber, String department, double marks) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.marks = marks;

    }

    public void displayStudent(){

        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Department : " + department);
        System.out.println("Marks : " + marks);

        System.out.println("-------------------");

    }

}