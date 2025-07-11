import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
	    int row,col;
	    Scanner x=new Scanner(System.in);
	    row=x.nextInt();
	    col=x.nextInt();
	    int[][] arr=new int[row][col];
	    for(int i=0;i<row;i++)
	    {
	       for(int j=0;j<col;j++)
	       {
	       int num;
	       num=x.nextInt();
	       arr[i][j]=num;
	       }
	    }
	    for(int i=0;i<row;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	        System.out.print(arr[i][j]+" ");
	        }
	        System.out.print("\n"); 
	    }

	}
}
