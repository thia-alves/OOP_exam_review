package ie.atu.oop.week2;

import java.util.HashSet;

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


    public void display(int at){
        System.out.println("WorkshopName" + WorkshopName);
        System.out.println("Reg Students");
        for (String studentID : studentsID) {
            System.out.println(studentID);
        }
        System.out.println("accepted" + studentsID.size());
        System.out.println("rejected" + (at - studentsID.size()));
        System.out.println("remmaining" + (capacity - studentsID.size()));
    }
}
