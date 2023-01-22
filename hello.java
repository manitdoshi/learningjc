import java.util.Scanner;
public class hello{
public static void main(String[] args)
 {
  System.out.println("Hello World");
  Scanner sc= new Scanner (System.in);
  System.out.println("What is your name?");
  String str=sc.nextLine();

   System.out.println("Hello "+str+ "\n"); 
}
}