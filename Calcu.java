import java.util.Scanner; 
public class Calcu
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=input.nextInt();
		System.out.println("Enter your operand");
		String operation=input.next();
		System.out.println("Enter Second Number");
		int b=input.nextInt();
		char opertion2=operation.charAt(0);
		if (opertion2=='+')
		{
                   int sum=a+b;
                  System.out.println(sum);   
		}
		else if(opertion2=='-')
		{
                   int difference=a-b;
                     System.out.println(difference);   
		}
		else if(opertion2=='*')
		{
                   int product=a*b;
                    System.out.println(product);   
		}
		else if(opertion2=='/')
		{
                   double divide=a/(double)b;
                    System.out.println(divide);   
		}
		else 
		{
                   System.out.println("Invalid Operation");   
		}
}
}