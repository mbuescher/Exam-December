public class DiceFun
{
  
  public static void rollThemB (int n)
  {
    int roll, threes = 0;
    for (int i = 1; i <= n; i++)
    {
      roll = (int)(Math.random() *6) + 1;
      System.out.print (roll + ", ");
      if (roll == 3)
        threes++;
    }
    System.out.println ("\nThere were " + threes + " threes!");
  }
  
  public static void rollThemC (int n)
  {
    int roll, doubles = 0, prev = 0;
    for (int i = 1; i <= n; i++)
    {
      roll = (int)(Math.random() *6) + 1;
      System.out.print (roll + ", ");
      if (prev == roll)
        doubles++;
      prev = roll;
    }
    System.out.println ("\nThere were " + doubles + " repeats!");
  }
  
  public static void rollThemD (int n)
  {
    int roll, longRun = 0, currentRun = 1, prev = 0;
    for (int i = 1; i <= n; i++)
    {
      roll = (int)(Math.random() *6) + 1;
      System.out.print (roll + ", ");
      
      // if there's a match, add to the current run.
      // if not a match, reset the current run.
      if (prev == roll)
        currentRun++;
      else
        currentRun = 1;
      
      // if the current run is the longest, update that.
      if (currentRun > longRun)
        longRun = currentRun;
      
      // previous roll is now the current roll, ready for the next roll.
      prev = roll;
      
    }
    System.out.println ("\nLongest run: " + longRun + " in a row!");
  }
  
  
  public static void main (String[] args)
  {
    rollThemD(30);
  }
}