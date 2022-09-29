package scannerClass;
import java.util.Scanner;  // Import the Scanner class

class ScannerClass0 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}//we will use the nextLine() method, which is used to read Strings: