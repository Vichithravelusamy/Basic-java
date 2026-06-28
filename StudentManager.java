import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class StudentManager {


    ArrayList<Student> students = new ArrayList<>();

    String fileName = "students.txt";



    // Add Student

    public void addStudent(Student student){

        students.add(student);

        saveToFile();

        System.out.println("Student Added Successfully");

    }




    // View Students

    public void viewStudents(){


        if(students.isEmpty()){

            System.out.println("No students found");

        }

        else{


            for(Student s : students){

                s.displayStudent();

            }

        }

    }





    // Search Student

    public void searchStudent(int rollNumber){


        for(Student s : students){


            if(s.rollNumber == rollNumber){


                System.out.println("Student Found");

                s.displayStudent();

                return;

            }

        }


        System.out.println("Student not found");


    }






    // Delete Student

    public void deleteStudent(int rollNumber){



        for(Student s : students){


            if(s.rollNumber == rollNumber){


                students.remove(s);


                saveToFile();


                System.out.println("Student Deleted");


                return;

            }

        }


        System.out.println("Student not found");


    }






    // Save Data

    public void saveToFile(){


        try{


            FileWriter writer = new FileWriter(fileName);



            for(Student s : students){


                writer.write(

                    s.name + "," +
                    s.rollNumber + "," +
                    s.department + "," +
                    s.marks + "\n"

                );


            }


            writer.close();


        }

        catch(Exception e){

            System.out.println(e);

        }


    }







    // Load Data

    public void loadFromFile(){



        try{


            File file = new File(fileName);



            if(!file.exists()){

                return;

            }



            Scanner scanner = new Scanner(file);




            while(scanner.hasNextLine()){



                String data = scanner.nextLine();



                String arr[] = data.split(",");




                Student student = new Student(

                    arr[0],
                    Integer.parseInt(arr[1]),
                    arr[2],
                    Double.parseDouble(arr[3])

                );



                students.add(student);



            }



            scanner.close();



        }

        catch(Exception e){


            System.out.println(e);


        }



    }



}