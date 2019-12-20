import java.util.Scanner;
public class Even
{
   public static void main(String[] args) {
   	System.out.println("Enter any number");
   	Scanner sc=new Scanner(System.in);
   	int i=sc.nextInt();
   	if (i%2==0)
		{	
			System.out.println(i+" is Even number");
		}
		  else
		  {
           System.out.println(i+" is Odd number");   
		  }
   }
	}