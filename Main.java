import java.util.Scanner;
public class Main {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        manager.loadFromFile();
        while(true){

            System.out.println("\n===== Student Management System =====");

            System.out.println("1. Add Student");

            System.out.println("2. View Students");

            System.out.println("3. Search Student");

            System.out.println("4. Delete Student");

            System.out.println("5. Exit");

            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch(choice){



                case 1:


                    sc.nextLine();


                    System.out.print("Enter Name: ");

                    String name = sc.nextLine();



                    System.out.print("Enter Roll Number: ");

                    int roll = sc.nextInt();



                    sc.nextLine();



                    System.out.print("Enter Department: ");

                    String dept = sc.nextLine();



                    System.out.print("Enter Marks: ");

                    double marks = sc.nextDouble();



                    Student student =
                    new Student(
                    name,
                    roll,
                    dept,
                    marks
                    );



                    manager.addStudent(student);



                    break;





                case 2:


                    manager.viewStudents();


                    break;





                case 3:


                    System.out.print("Enter Roll Number: ");

                    int searchRoll = sc.nextInt();



                    manager.searchStudent(searchRoll);


                    break;





                case 4:


                    System.out.print("Enter Roll Number: ");

                    int deleteRoll = sc.nextInt();


                    manager.deleteStudent(deleteRoll);


                    break;





                case 5:


                    System.out.println("Thank You");

                    System.exit(0);




                default:

                    System.out.println("Invalid Choice");


            }



        }



    }


}