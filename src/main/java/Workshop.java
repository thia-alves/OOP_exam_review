package ie.atu.oop.week2;

import java.util.HashSet;
import java.util.Scanner;

public class Workshop {
    private String WorkshopName;
    private int capacity;
    HashSet<String> studentsID;
    public Workshop(String WorkshopName, int capacity) {
        this.WorkshopName = WorkshopName;
        this.capacity = capacity;
        this.studentsID = new HashSet<>();

    }
    public String getWorkshopName() {return WorkshopName;}
    public int getCapacity() {return capacity;}
    public HashSet<String> getStudentsID() {return studentsID;}

    public String registerStudent(String studentID) {
        if (studentID.trim().isEmpty()) {
            return "rejected - blank ID";
        }

        if (studentsID.contains(studentID)) {
            return "rejcted - already registered student";
        }
        if (studentsID.size() == capacity) {
            return "rejected - capacity exceeded";
        }
        studentsID.add(studentID);
        return "acccepted";
    }


    public void setStudentsID(HashSet<String> studentsID) {
        Scanner scan = new Scanner(System.in);
        int registrations = Integer.parseInt(scan.nextLine());
        for(int i = 0; i < registrations; i++){

        }
    }
}
