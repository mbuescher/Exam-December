/*************************************************
  * Practice questions for APCS: Convert Binary byte to Decimal
  * Bonus:  You should also be able to understand and modify the code.
  * 
  * @author Michael Buescher
  * @version December 1, 2016
  */

import java.util.Scanner;
import java.lang.Math;
  
public class QuestionType_Arith1
{
  // stored as a string to handle leading zeros
  private String questionString, answerString;
  
  /** Constructor sets the question using a separate method;
    * That way this can be re-used for similar types of questions.
    * setQuestion() later fills it in with spcefic information.
    */
  public void QuestionType_Arith1 ()
  {
    setQuestion ();
  }
  
  // --------------------------------------------------------------
  // Accessor Methods
  // --------------------------------------------------------------
  /** Returns the question as a String.
    * @return the question as a String.
    */
  public String getQuestion ()
  {
    return questionString;
  }
  /** Returns the answer to the question.
    * @return the answer to the question.
    */
  public String getAnswer ()
  {
    return answerString;
  }
  
  /* ------------------------------------------------------------------
    * Sets the question string and answer string based on a random choice
    * of one of several question types.  Private methods set the details. 
    */
  public void setQuestion ()
  {
    final int NUM_TYPES = 7;
    int qType = (int)(Math.random() * NUM_TYPES);
    switch (qType) {
      case 0:
        setIntAdd(); break;
      case 1:
        setIntDiv(); break;
      case 2:
        setIntMod(); break;
      case 3:
        setAddIntReal(); break;
      case 4:
        setOrdOp1(); break;
      case 5:
        setOrdOp2(); break;
      case 6:
        setOrdOp3(); break;
    }
  }
  
  // ------------------------------------------------------------
  // Different question types
  // ------------------------------------------------------------
  // Integer Addition
  private void setIntAdd ()
  {
    int a = (int)(Math.random() * 50) - 25;
    int b = (int)(Math.random() * 50) - 25;
    
    questionString = a + " + " + b + " =  ??? ";
    answerString = "" + (a + b);
  }
  
  // Integer Division: divide
  private void setIntDiv ()
  {
    int a = (int)(Math.random() * 120) - 50;
    int b = (int)(Math.random() * 10) + 1;
    
    questionString = a + " / " + b + " =  ??? ";
    answerString = "" + (a / b);
  }
 
  // Integer division: Mod
  private void setIntMod ()
  {
    int a = (int)(Math.random() * 100);
    int b = (int)(Math.random() * 10) + 1;
    
    questionString = a + " % " + b + " =  ??? ";
    answerString = "" + (a % b);
  }
  
  // Add integer and double
  private void setAddIntReal ()
  {
    int a = (int)(Math.random() * 50) - 15;
    double b = (int)(Math.random() * 101)/10.0 + 1;
    
    questionString = a + " + " + b + " =  ??? ";
    answerString = "" + (a + b);
  }

  // Order of Operations - first of many
  private void setOrdOp1 ()
  {
    int a = (int)(Math.random() * 10) + 1;
    int b = (int)(Math.random() * 10) + 1;
    int c = (int)(Math.random() * 10) + 1;
    
    questionString = a + " + " + b + " * " + c + " =  ??? ";
    answerString = "" + (a + b * c);
  }
  
  // Order of Operations - version 2
  private void setOrdOp2 ()
  {
    int a = (int)(Math.random() * 80) + 1;
    int b = (int)(Math.random() * 10) + 1;
    int c = (int)(Math.random() * 10) + 1;
    
    questionString = a + " / " + b + " * " + c + " =  ??? ";
    answerString = "" + (a / b * c);
  }
  
  // Order of Operations - version 3
  private void setOrdOp3 ()
  {
    int a = (int)(Math.random() * 20) + 1;
    int b = (int)(Math.random() * 80) + 1;
    int c = (int)(Math.random() * 10) + 1;
    
    questionString = a + " + " + b + " % " + c + " =  ??? ";
    answerString = "" + (a + b % c);
  }
  // ---------------------------------------------------------------
  // ---------------------------------------------------------------
  /**
   * Short program to test the class.
   * */
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner (System.in);
    String user = " ";
    QuestionType_Arith1 question = new QuestionType_Arith1();
        
    while (user.toLowerCase().charAt(0) != 'q')
    {
      question.setQuestion();
      System.out.println (question.getQuestion());
      
      System.out.print ("Any character for Answer and next question, \'q\' to quit. : ");
      user = keyboard.nextLine() + " ";
      
      System.out.println (question.getAnswer());
    }
    
    System.out.println ("Thank you and come again.");
    keyboard.close();
  }
}