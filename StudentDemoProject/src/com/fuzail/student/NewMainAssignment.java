package com.fuzail.student;

import java.util.Scanner;

public class NewMainAssignment {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("**************STUDENT DETAILS SYSTEM ************");
        int option = -1;
        do{
            System.out.println("\n1. VIEW ALL STUDENT DETAILS");
            System.out.println("2. VIEW STUDENT BY REG NO.");
            System.out.println("3. CREATE STUDENT RECORD.");
            System.out.println("4. UPDATE STUDENT RECORD.");
            System.out.println("5. EXIT");
            System.out.println("\nENTER YOUR OPTION:");
            option = scan.nextInt();

            switch(option){
                case 1:
                    System.out.println("Viewing all student details");
                    //TODO : Write your logic to show all your student -- Future you can use database
                    break;

                case 2:
                    System.out.println("Enter REG. NO of STUDENT :");
                    //TODO : Write logic to get reg no. from user and search in hashmap ..
                    break;
                case 3:
                    System.out.println("Please provide following details:");
                    //TODO : Write logic to get detail of one student and store it in Hashmap..
                    break;

                case 4:
                    System.out.println("Enter REG NO of Student to update : ");
                    //TODO : If user given reg number is present in hashmap; then display details
                    // and give option to update other details except Reg. No - since reg.no is unique
                    break;

                case 5:
                default:
                    System.out.println("Exiting the student details management system.");
                    break;

            }

        }while (option<=4 && option>0);

    }
}
