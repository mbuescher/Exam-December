/*************************************************
  * Practice questions for APCS: Convert Decimal byte to Hexadecimal
  * Bonus:  You should also be able to understand and modify the code.
  * 
  * @author Michael Buescher
  * @version December 1, 2016
  */

import java.util.Scanner;
import java.lang.Math;
  
public class QuestionType_Dec2Hex
{
  // the decimal value to convert
  private int decimal;
  
  /** Constructor sets the question using a separate method;
    * That way this can be re-used for similar types of questions.
    * setQuestion() later fills it in with spcefic information.
    */
  public void QuestionType_Bin2Dec ()
  {
    decimal = setQuestion();
  }
  
  /*****************************************
    * Returns the decimal representation of a number.
    * @return an integer between 0 and 255.
    */
  public int getDecimal ()
  {
    return decimal;
  }
  
  /* ------------------------------------------------------------------
    * Gets a random decimal number within the range [0, 255] (one byte).  
    * @return a random decimal
    */
  public int setQuestion ()
  {
    decimal = (int)(Math.random() * 256);
    return decimal;
  }
  
  /** ------------------------------------------------------------
    * Gives the hexadecimal representation of the decimal number stored in the question.
    * @return a hexadecimal equivalent of the decimal number.
    */
  public String convertDec2Hex ()
  {
    int digit1 = decimal / 16;
    int digit2 = decimal % 16;
    String ans = digit2Hex(digit1) + digit2Hex(digit2);
    return ans;
  }
  
  /*  Converts an integer in [0 .. 15] to a hexadecimal digit  */
  private String digit2Hex (int n)
  {
    String ans = "";
    if (n < 10)
      ans += (char)(n + 48);    // 48 is the character '0', 49 is '1' , etc.
    else if (n < 16)
      ans += (char)(n + 55);    // (char)65 is 'A' so if n = 10, returns "A"
    return ans;
  }
  
  /**
   * Short program to test the class.
   * */
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner (System.in);
    String user = " ";
    QuestionType_Dec2Hex question = new QuestionType_Dec2Hex();
        
    while (user.toLowerCase().charAt(0) != 'q')
    {
      question.setQuestion();
      System.out.println ("Convert to hexadecimal: " + question.getDecimal());
      
      System.out.print ("<ENTER> for Answer and next question, \'q\' to quit. : ");
      user = keyboard.nextLine();
      
      System.out.println ("Decimal equivalent: " + question.convertDec2Hex());
    }
    
    System.out.println ("Thank you and come again.");
    keyboard.close();
  }
}