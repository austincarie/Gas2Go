import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class User {

    public static String UserName;

    public static void main(String[] args) {

        String UserType = null;
        boolean access = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter what type of user: Customer, Manager, Driver");
        UserType = scanner.nextLine();
        System.out.println("checking.....");
        if(UserType.equals("Customer")){
            String filePath = "C:\\Users\\Austin\\IdeaProjects\\SADProject\\src\\Customers.txt";
            System.out.println("Enter your username: ");
            UserName = scanner.nextLine();
            System.out.println("Checking to see if username exists...");
            BufferedReader bufferedReader;
            try {
                bufferedReader = new BufferedReader(new FileReader(filePath));
                String line;
                boolean usernameExists = false;
                while((line = bufferedReader.readLine()) != null) {
                    if (line.equals(UserName)) {
                        usernameExists = true;
                        break;
                    }
                }
                if (usernameExists) {
                    System.out.println("Customer Access Granted!");
                    access = true;
                } else {
                    System.out.println("Username not accepted");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(UserType.equals("Manager")){
            String filePath = "C:\\Users\\Austin\\IdeaProjects\\SADProject\\src\\Manager.txt";
            System.out.println("Enter your username: ");
            UserName = scanner.nextLine();
            System.out.println("Checking to see if username exists...");
            BufferedReader bufferedReader;
            try {
                bufferedReader = new BufferedReader(new FileReader(filePath));
                String line;
                boolean usernameExists = false;
                while((line = bufferedReader.readLine()) != null) {
                    if (line.equals(UserName)) {
                        usernameExists = true;
                        break;
                    }
                }
                if (usernameExists) {
                    System.out.println("Manager Access Granted!");
                    access = true;
                } else {
                    System.out.println("Username not accepted");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(UserType.equals("Driver")){
            String filePath = "C:\\Users\\Austin\\IdeaProjects\\SADProject\\src\\Driver.txt";
            System.out.println("Enter your username: ");
            UserName = scanner.nextLine();
            System.out.println("Checking to see if username exists...");
            BufferedReader bufferedReader;
            try {
                bufferedReader = new BufferedReader(new FileReader(filePath));
                String line;
                boolean usernameExists = false;
                while((line = bufferedReader.readLine()) != null) {
                    if (line.equals(UserName)) {
                        usernameExists = true;
                        break;
                    }
                }
                if (usernameExists) {
                    System.out.println("Driver Access Granted!");
                    access = true;
                } else {
                    System.out.println("Username not accepted");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Not a valid response!");
        }


    }
    public static String getUsername(){
        return UserName;
    }

}