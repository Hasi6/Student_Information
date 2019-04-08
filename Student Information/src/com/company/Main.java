package com.company;

import java.util.Scanner;

public class Main {

    public static String[] names;
    public static int[] grades;
    public static int[] phoneNumber;

    Scanner scanner1 = new Scanner(System.in);
    public static void main(String[] args) {
	Scanner scanner2 = new Scanner(System.in);
        System.out.println("How Many Students You Want to add");
        int addStudents = scanner2.nextInt();
        Main student = new Main();
        student.studentDetails(addStudents);

        for (int i=0;i<addStudents;i++) {
            System.out.println("Student " + (i+1) + " name is " +names[i]+" and Grade is "+grades[i]+" phone number is "+phoneNumber[i]);
        }

    }


    //Method to get Student informations
    public void studentDetails(int number){
        names= new String[number];
        grades = new int[number];
        phoneNumber = new int[number];

        for(int i=0;i<names.length;i++) {
            System.out.println("Enter " + (i + 1) + " Student Name \r");
            names[i] = scanner1.next();
            System.out.println("Enter " + (i + 1) + " Student Grade \r");
            grades[i] = scanner1.nextInt();
            System.out.println("Enter " + (i + 1) + " Phone Number \r");
            phoneNumber[i] = scanner1.nextInt();

            if(i==number-1){
                return;
            }
            else {
                System.out.println("Got the Details of Student " + (i + 1) + "\n Enter the Details of " + (i + 2) + " Student");
            }
        }

    }

    }

