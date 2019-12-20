import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pin = 0;
        int count=0;
        System.out.println("Enter your pin number");
        do{
//            pin = input.nextInt();
            if(count<3){
                System.out.println("Count = "+count);
                System.out.println("Enter your pin number again");
                pin = input.nextInt();
                count++;

            }else {
                System.out.println("Blocked");
                break;
            }

        }while(pin != 2345);
        if(pin==2345){
            System.out.println("Welcome to Nabil Bank");
            System.out.println("Account of Mr.Sushant Basnet");
            System.out.println("Press /n1::Deposit /n2::Withdraw /n3::Balance");
            int choice=input.nextInt();
            int d_amount,W_amount,amount=25000;
            switch(choice){
        case 1:
               
               System.out.println("Please enter the deposit amount");
               d_amount=input.nextInt();
               System.out.println("Your balance is " +(amount=amount+d_amount));
               break;
        case 2:
               System.out.println("Please enter the withdraw amount");
               W_amount=input.nextInt();
               if(W_amount>amount)
               {
                System.out.println("Insufficent balance");
                System.out.println("Your balance is " +amount);
               }
               else
               {
                System.out.println("Your balance is " +(amount-W_amount));
               }
               break;
        case 3:
               System.out.println("Your balance is " +amount);
               break;
        default:
        System.out.println("Please enter valid number");            

        }
        }
               
    }
}
