package com.javaintern;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        //taking user input for number of grades they want to be entered
        System.out.print("Enter the number of grades to calculate:-");
        int noofGrades=sc.nextInt();

        //creating an array to store the grades
        //integer type array
        int[] grades = new int[noofGrades];

        //taking each input
        for (int i = 0; i < noofGrades; i++) {
            System.out.print("Enter the Grade " + (i + 1) + ":   ");
            grades[i] = sc.nextInt();
        }

        //USING ENHANCED LOOP FOR FETECHING THE ARRAY ELEMENTS
        // intializing sum as 0
        double sum=0;
        for(int grade:grades){
            sum+=grade;
        }
        //calculating average
        double average=sum/noofGrades;

        //printing the average
        System.out.println("Average grade is: " + average);

        sc.close();
    }

}
