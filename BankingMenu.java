import java.util.Scanner;
class BankingMenu
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
int choice;
int balance=0;

while(true)
{
System.out.println(
    "1. Check Balance\n" +
    "2. Deposit Money\n" +
    "3. Withdraw Money\n" +
    "4. Exit\n"
);

System.out.println("Enter the choice ");
choice =sc.nextInt();

switch(choice)
{
	case 1:{
		System.out.println("Available balance is :"+balance);
		   }
	break;
	case 2:
	{
		System.out.println("Enter Amount :");
		int deposit= sc.nextInt();
		balance=balance+deposit;
		System.out.println("Your have deposited "+deposit);
	}
	break;
	 case 3:
	 {
		 System.out.print("Enter the Withdraw amount :");
		 int withdral =sc.nextInt();
		 if(withdral<=balance)
		 {
		 
		 System.out.println(" You withdral "+  withdral+" Successfully");
		 
		 balance = balance- withdral;
		 }
		 else
		 {
			 System.out.println("balance is not sufficient:");
		 }
	 }
	 break;
	 case 4:
	 {
		 System.out.println("Exit");
	 }
	 default:
	 {
		 System.out.println("choice is not valid");
	 }
	 }
}
}
}
		 
	
