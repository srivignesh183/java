import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner obj= new Scanner(System.in); 
	int m1,m2,m3,m4,m5,avg;
		
		m1=obj.nextInt();
		m2=obj.nextInt();
		m3=obj.nextInt();
		m4=obj.nextInt();
		m5=obj.nextInt();
		avg=m1+m2+m3+m4+m5/5;
		System.out.println("mark1 = "+m1+"\n"+"mark2 = "+m2+"\n"+"mark3 = "+m3+"\n"+"mark4 = "+m4+"\n"+"mark5 = "+m5+"\n"+"average = "+avg+"\n");
	}
}
