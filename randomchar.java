import java.util.Scanner;
public class randomchar
{
	public static void main(String[] args) 
	{
	 	Scanner input=new Scanner(System.in);
	 	String charset=input.next();
	 	char character=charset.charAt(0);
	 	int ascii_num=character;
	 	System.out.println(ascii_num);
	 }
}	 	