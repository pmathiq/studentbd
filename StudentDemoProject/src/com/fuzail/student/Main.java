package com.fuzail.student;

import com.fuzail.student.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter student");
        int numOfStudents=scan.nextInt();
        scan.nextLine();

        for(int i=0;i<numOfStudents;i++){

            System.out.print("enter name:");
            String name=scan.nextLine();

            System.out.print("enter dept:");
            String dept=scan.nextLine();


            System.out.println("enter section:");
            String section =scan.nextLine();

            System.out.print("enter regno:");
            int regno =scan.nextInt();

            scan.nextLine();


            Student studentDemo=new Student(regno, name, section, dept);

            students.add(studentDemo);
        }

        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("%20s%15s%15s%15s", "NAME", "DEPT", "REGNO", "SECTION");
        System.out.println();
        System.out.println("--------------------------------------------------");
        for(Student student:students){

            System.out.printf("%20s%15s%15s%15s", student.getName(), student.getSection(), student.getDept(), student.getRegNumber());
            System.out.println();
            System.out.println("--------------------------------------------------");
        }

        scan.close();
    }
}