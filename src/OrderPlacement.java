import java.io.*;
import java.util.Scanner;
public class OrderPlacement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String confirmation;
        System.out.println("Would you like to place an order? (Y/N)");
        confirmation = input.nextLine();
        if (confirmation.equals("Y")){
            placeOrder();
        }

    }

    public static void placeOrder(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your address: ");
        String address = input.nextLine();
        System.out.println("Please enter your gas type: ");
        String gasType = input.nextLine();
        Job order = new Job(address, gasType);
        String filePath = "C:\\Users\\Austin\\IdeaProjects\\SADProject\\src\\Orders.txt";
        try{
            FileWriter fw = new FileWriter(filePath,true); //the true will append the new data
            fw.write(order.toString() + "\n");//appends the string to the file
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
