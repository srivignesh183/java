import java.util.Scanner;
//java program to print the age
/*Author is sri vignesh
*Date=09.07.2025
*/
public class Main
{
	public static void main(String[] args)
	{
	    Scanner obj= new Scanner(System.in); 
		System.out.println("Enter the num");
		int num=obj.nextInt();
		System.out.println("num="+num);
		if(num%2==0)
		System.out.println("number is even");
		else
		System.out.println("number is not even");
	}
}
