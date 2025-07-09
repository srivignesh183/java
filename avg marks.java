import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner obj= new Scanner(System.in); 
	int m1,m2,m3,m4,m5,avg,sum;
			System.out.println("enter mark 1");
		m1=obj.nextInt();
		System.out.println("enter mark 2");
		m2=obj.nextInt();
			System.out.println("enter mark 3");
		m3=obj.nextInt();
			System.out.println("enter mark 4");
		m4=obj.nextInt();
			System.out.println("enter mark 5");
		m5=obj.nextInt();
		sum=m1+m2+m3+m4+m5;
		avg=m1+m2+m3+m4+m5/5;
		System.out.println("average = "+avg+"\n"+"sum = "+sum);
	}
}
