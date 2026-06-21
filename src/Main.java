public class Main {
    public static void main(String[] args) {

        String fullName = "John Doe";
        String indexNumber = "123456";
        int age = 20;
        char gender = 'M';
        String department = "Computer Science";
        int level = 100;
        double gpa = 3.2;

        String adultStatus = (age >= 18) ? "YES" : "NO";

        String academicClass;
        if (gpa >= 3.5) {
            academicClass = "First Class";
        } else if (gpa >= 3.0) {
            academicClass = "Second Class Upper";
        } else if (gpa >= 2.5) {
            academicClass = "Second Class Lower";
        } else {
            academicClass = "Pass";
        }

        System.out.println("Name: " + fullName);
        System.out.println("Index: " + indexNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Department: " + department);
        System.out.println("Level: " + level);
        System.out.println("GPA: " + gpa);
        System.out.println("Adult Status: " + adultStatus);
        System.out.println("Academic Class: " + academicClass);
    }
}