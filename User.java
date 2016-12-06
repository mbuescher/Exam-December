/**
 * A User for a system.  Contains username and password fields,
 * along with various methods for accessing them and for logging
 * in and out.
 */

import java.util.Scanner;

public class User
{
  String username, password;
  boolean loggedIn;
  
  /**
   * Constructor takes a username and password and creates a new user.
   * Default is that the user is not logged in.
   * @param uname the new username
   * @param passwd the new password
   */
  public User (String uname, String passwd)
  {
      username = uname;
      password = passwd;
      loggedIn = false;
  }
  
// -----------------------------------------  
// Accessor Methods
// -----------------------------------------
  
  public String getUsername()
  {
    return username;
  }
  
  public boolean getLogin()
  {
    return loggedIn;
  }
  
  // No accessor for password!
  
  // ---------------------------------------------
  // login and logout methods
  // ---------------------------------------------
  
  /**
   * Checks the username and password.  Successful login if they match.
   * @param un the username
   * @param pw the password
   * @return whether the login was successful  */
  public boolean login (String un, String pw)
  {
    if (username.equals(un) && password.equals(pw))
      loggedIn = true;
    else
      loggedIn = false;
    return loggedIn;
  }
  
  /**
   * Logs the user out.  No check or validation.
   * @return false always, because the user is no longer logged in.
   */
  public boolean logout ()
  {
    loggedIn = false;
    return loggedIn;
  }
  
}
      
  
  