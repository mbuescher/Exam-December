/*************************************************
  * Practice questions for APCS: Convert Binary byte to Decimal
  * Bonus:  You should also be able to understand and modify the code.
  * 
  * @author Michael Buescher
  * @version December 1, 2016
  */

import java.util.Scanner;
import java.lang.Math;
  
public class QuestionType_Bin2Dec
{
  // stored as a string to handle leading zeros
  private String binary;
  
  /** Constructor sets the question using a separate method;
    * That way this can be re-used for similar types of questions.
    * setQuestion() later fills it in with spcefic information.
    */
  public void QuestionType_Bin2Dec ()
  {
    binary = setQuestion();
  }
  
  /*****************************************
    * Returns the binary representation of a number.
    * @return an integer made up of ones and zeros.
    */
  public String getBinary ()
  {
    return binary;
  }
  
  /* ------------------------------------------------------------------
    * Gets a random binary number with 8 bits (one byte).  
    * It is stored internaly as a String to show leading zeros.
    * @return a String of 8 characters, '0' or '1', representing a binary number
    */
  public String setQuestion ()
  {
    String ans = "";
    for (int i = 0; i < 8; i++)
    { 
      if (Math.random() > 0.5)
        ans = ans + "1";         
      else
        ans = ans + "0";
    }
    binary = ans;
    return ans;
  }
  
  /** ------------------------------------------------------------
    * Gives the decimal representation of the Binary number stored in the question.
    * @return a decimal equivalent.
    */
  public int convertBin2Dec ()
  {
    int placeVal = 128;             // leftmost digit in a byte is 128's place
    int ans = 0;
    for (int i = 0; i < 8; i++)
    {
      if (binary.charAt(i) == '1')
        ans += placeVal;            // add the place value if it's a 1
      placeVal = placeVal / 2;     
    }
    return ans;
  }
  
  /**
   * Short program to test the class.
   * */
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner (System.in);
    String user = " ";
    QuestionType_Bin2Dec question = new QuestionType_Bin2Dec();
        
    while (user.toLowerCase().charAt(0) != 'q')
    {
      question.setQuestion();
      System.out.println ("Convert to decimal: " + question.getBinary());
      
      System.out.print ("<ENTER> for Answer and next question, \'q\' to quit. : ");
      user = keyboard.nextLine();
      
      System.out.println ("Decimal equivalent: " + question.convertBin2Dec());
    }
    
    System.out.println ("Thank you and come again.");
    keyboard.close();
  }
}