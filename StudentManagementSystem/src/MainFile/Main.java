package MainFile;


import programmingInterface.StudentDao;
import programmingInterface.StudentDaoInterface;
import programmingMethod.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        StudentDaoInterface dao=new StudentDao();
        System.out.println("**** Welcome to Student Management System ****");
        while(true){
            System.out.println("\n1.Add Student" +
                    "\n2.Show All Students" +
                    "\n3.Get student based on roll number" +
                    "\n4.Delete Student"+
                    "\n5.Update Student" +
                    "\n6.Exit");
            System.out.println("Enter choice");
            int ch=sc.nextInt();
            int rollnum;
			int rollnum1;
			switch (ch){
                case 1:
                    System.out.println("Add Student");
                    /*System.out.println("Enter student Roll Number");
                    int rollnum1=sc.nextInt();*/
                    System.out.println("Enter student name");
                    String name=sc.next();
                    /*System.out.println("Enter student Gender");
                    String gender=sc.next();
                    
                    System.out.println("Enter student age");
                    int age=sc.nextInt();
                    */
                    System.out.println("Enter student clg name");
                    String clgName=sc.next();
                    System.out.println("Enter city");
                    String city=sc.next();
                    System.out.println("Enter Percentage");
                    double percentage=sc.nextDouble();
                    Student st=new Student(name,/*gender,age*/clgName,city,percentage);
                    boolean ans=dao.insertStudent(st);
                    if(ans)
                        System.out.println("Record inserted Successfully!!!");
                    else
                        System.out.println("something went wrong, please try again");

                    break;
                case 2:
                    System.out.println("Show all students ");
                    dao.showAllStudent();

                    break;
                case 3:
                    System.out.println("Get student based on rollnumber");
                    System.out.println("enter roll number");
                    int roll=sc.nextInt();
                  boolean f=  dao.showStudentById(roll);
                  if(!f)
                      System.out.println("Student with this id is not available in our system");

                    break;
                case 4:
                    System.out.println("Delete Student");
                    System.out.println("enter roll number to delete");
                    rollnum1=sc.nextInt();
                    boolean ff=dao.delete(rollnum1);
                    if(ff)
                        System.out.println("Record deleted successfully...");
                    else
                        System.out.println("Something went wrong");
                    break;
                case 5:
                    System.out.println("Update the student");
                    System.out.println("\n1.Update name\n2.Update City");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1){
                        System.out.println("enter roll number");
                        int rnum=sc.nextInt();
                        System.out.println("Enter new name");
                        String sname=sc.next();
                        Student std=new Student();
                        std.setName(sname);
                      boolean flag=  dao.update(rnum,sname,choice,std);
                      if(flag)
                          System.out.println("Name updated successfully");
                      else
                          System.out.println("Something went wrong...");
                      /*System.out.println("enter your choice");
                      int n=sc.nextInt();
                      if(n==2){
                          System.out.println("enter roll number");
                          int rnum1=sc.nextInt();
                          System.out.println("Enter new city");
                          String sname1=sc.next();
                          Student std1=new Student();
                          std.setName(sname);
                        boolean flag1=  dao.update(rnum,sname,choice,std);
                        if(flag)
                            System.out.println("City updated successfully");
                        else
                            System.out.println("Something went wrong...");*/
 }
                    break;
                case 6:
                    System.out.println("Thank You for using Student management application!!!");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice..");
		    }
        }


    }
}

    


