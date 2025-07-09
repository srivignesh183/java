import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner obj= new Scanner(System.in); 
		String name,branch;
		
		name=obj.nextLine();
		branch=obj.nextLine();
			int rollnumber;
		rollnumber=obj.nextInt();
		
		System.out.println("Name = "+name+"\n"+"rollnumber = "+rollnumber+"\n"+"branch = "+branch+"\n");
	}
}
