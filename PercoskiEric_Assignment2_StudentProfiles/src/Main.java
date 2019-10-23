import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;

        System.out.println("Welcome. Please enter the number of students you will be registering: ");
        counter = input.nextInt();
        String[] studentsArray = new String[counter];
        System.out.println("Please check for the pop-up window");

        Student stud = new Student();

        for (int i = 0; i < studentsArray.length; i++) {
            studentsArray[i] = stud.getInfo();
        }
        System.out.println("Student Details, Department of ILT");
        for (int i = 0; i < studentsArray.length ; i++) {
            stud.displayInfo(studentsArray[i].toString());
        }
        System.out.println("Number of Students: " + counter);
    }
}
