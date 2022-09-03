package basania;
import java.util.Scanner; 

public class Main { 
 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
   
          Scanner in = new Scanner(System.in); 
          System.out.print("Enter Perpendicular: "); 
          double p = in.nextDouble(); 
          System.out.print("Enter Base: "); 
          double b = in.nextDouble(); 
           
          double h = Math.sqrt(Math.pow(p, 2) + Math.pow(b, 2)); 
           
          System.out.println("Hypotenuse = " + h); 
      } 
 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
 }
	 
                