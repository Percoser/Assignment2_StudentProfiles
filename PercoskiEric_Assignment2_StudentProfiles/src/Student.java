import javax.swing.*;
import java.util.Scanner;
import java.util.regex.*;

public class Student {
    public String First_Name;
    public String Last_Name;
    public String ID_Number;
    public String Class_Standing;
    public String E_Mail;
    public String Address;
    Boolean tryAgain;
    String input;

    public String getInfo(){
//        Scanner inp = new Scanner(System.in);

        First_Name =  JOptionPane.showInputDialog("Enter the First Name: ");
        while(!validateName(First_Name)){
            First_Name = JOptionPane.showInputDialog("You must enter a valid first name, using only letters: ", "Eric");
        }


        Last_Name =  JOptionPane.showInputDialog("Enter the Last Name: ");
        while(!validateName(Last_Name)){
            Last_Name = JOptionPane.showInputDialog("You must enter a valid last name, using only letters: ", "Percoski");
        }

        ID_Number =  JOptionPane.showInputDialog("Enter the Student's Cougar ID Number: ");
        while(!validateID(ID_Number)){
            ID_Number = JOptionPane.showInputDialog("You must enter a valid Cougar ID, \n " +
                    "using a max of 7 Digits: ", "1234567");
        }

        Menu classMenu = new Menu();
        Class_Standing = classMenu.showMenu();

        E_Mail= JOptionPane.showInputDialog("Please Enter the Student's Email Address: ");
        while(!validateEmail(E_Mail)){
            E_Mail = JOptionPane.showInputDialog("You must enter a valid e-mail address, \n " +
                    "example@email.com: ", "epercosk111@uh.edu");
        }


        String number=JOptionPane.showInputDialog("For the student's Address, begin by entering the Street Number: ");
        while(!validateNum(number)){
            number = JOptionPane.showInputDialog("You must enter a valid Street Number, using only Digits: ", "4800");
        }
        String street= JOptionPane.showInputDialog("Now Enter the Street Name: ");
        while(!validateName(street)){
            street = JOptionPane.showInputDialog("You must enter a valid street name, using only letters: ", "Calhoun");
        }

        Menu streetTypeMenu = new Menu();
        String streetType = streetTypeMenu.streetTypeMenu();

        String city= JOptionPane.showInputDialog("and Now Enter the City: ");
        while(!validateName(city)){
            city = JOptionPane.showInputDialog("You must enter a valid city, using only letters: ", "Houston");
        }
        Menu stateMenu = new Menu();
        String state = stateMenu.stateMenu();

        String zip= JOptionPane.showInputDialog("and Finally the Zip Code: ");
        while(!validateNum(zip)){
            zip = JOptionPane.showInputDialog("You must enter a valid Zip Code, using only Digits: ", "77004");
        }
        Address = AddressClass.getAddress(number, street, streetType, city, state, zip);

        String Student_Line = (First_Name + " " + Last_Name + "; Student ID: " + ID_Number + "; " + Class_Standing + "; e-Mail: " + E_Mail + " \n" + Address );
        return Student_Line;
    }
    public void displayInfo(String studLine) {
        System.out.println(studLine);
    }

    private static boolean validateName(String input){
        boolean flag = true;
        for (int i = 0; i < input.length() ; i++) {
            char ch = input.charAt(i);
            if(!Character.isLetter(ch)){
                flag = false;
            }
        }
        return flag;
    }
    private static boolean validateID(String input){
        boolean flag = true;
        if(input.length()<=7){
            for (int i = 0; i < input.length() ; i++) {
                char ch = input.charAt(i);
                if(!Character.isDigit(ch)){
                    flag = false;
                }
            }
        }else {
            flag=false;
        }
        return flag;
    }
    private static boolean validateEmail(String input){
        boolean flag = true;
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        if(!input.matches(regex)){
            flag = false;
        }
        return flag;
    }
    private static boolean validateNum(String input){
        boolean flag = true;
        if(input.length()<=9){
            for (int i = 0; i < input.length() ; i++) {
                char ch = input.charAt(i);
                if(!Character.isDigit(ch)){
                    flag = false;
                }
            }
        }else {
            flag=false;
        }
        return flag;
    }

}
