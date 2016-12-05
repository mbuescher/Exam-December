// A short program to test the User class

import java.util.Scanner;

public class UserTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    // Get username and password to create a new user
    System.out.print("New username: ");
    String un = keyboard.nextLine();
    System.out.print("New password: ");
    String pw = keyboard.nextLine();
    User testUser = new User(un, pw);
    System.out.println ("\nNew user created.  Ready to log in!");
    
    // Test the newly created user by trying to log in.
    System.out.print ("Username: ");
    String uname = keyboard.nextLine();
    System.out.print ("Password: ");
    String pword = keyboard.nextLine();
    
    if (testUser.login(uname, pword))
      System.out.println("User " + testUser.getUsername() + " successfully logged in.");
    else
      System.out.println("Login unsuccessful.");
    
    // Log the user out and close the program
    testUser.logout();
    System.out.println("User " + testUser.getUsername() + " successfully logged out.");
    
    keyboard.close();
  }
}