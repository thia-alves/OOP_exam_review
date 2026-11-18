package ie.atu.oop.week2;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {


        System.out.println("name and capacity");
        Scanner scan = new Scanner(System.in);
        String WorkshopName = scan.nextLine();
        int capacity = Integer.parseInt(scan.nextLine());
        Workshop setWorkshop = new Workshop(WorkshopName, capacity);
        System.out.println("the capacity is " + capacity + ", the name is " + WorkshopName +"\n");
        System.out.println("how many registrations do you want to attempt");
        int registrations = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < registrations; i++){
            System.out.println("enter student ID");
            String studentsID = scan.nextLine();
            String res = setWorkshop.registerStudent(studentsID);
            System.out.println("student ID is " + studentsID + " > " + res);
         }
        setWorkshop.display(registrations);
        scan.close();


    }
}


// slide 17