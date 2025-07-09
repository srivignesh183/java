import java.util.Scanner;
//java program to print the age
/*Author is Arun
*Date=09.07.2025
*/
public class Main
{
	public static void main(String[] args)
	{
	    Scanner obj= new Scanner(System.in); 
		System.out.println("Enter the age");
		int age=obj.nextInt();
		System.out.println("Age="+age);
		if(age>=18)
		System.out.println("Eligible to vote");
		else
		System.out.println("Not Eligible");
	}
}
