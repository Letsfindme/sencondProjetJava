package newpackage;
import java.util.Scanner;


public class yourpass {
	
	public static String password;
	
	
    public static void askpass() {
	  Scanner user_input = new Scanner(System.in);      
      System.out.print("Input your password: ");
      password = user_input.next();

      System.out.println("Your password was: " + password);
      
    }
		
		
		    public static void main(String args[]) {
		      
		    	askpass();
		

	}

}
