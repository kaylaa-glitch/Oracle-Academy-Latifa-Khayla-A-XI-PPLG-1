public class Student {
    String fName = "Lisa";
    String lName = "Palombo";
    String stuId = "123456789";
    String stuStatus = "Active";

    public void displayInfo() {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
}