import java.util.Scanner;
class AtmPinValidation

{

public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);

int atmpin = 3355;

for (int i=1;i<=4;i++)
{
   if(i<=3)
   {
	 System.out.print("Enter The ATM PIN: ");
	 int pin=sc.nextInt();
	 
	 if(pin==atmpin)
		{
		System.out.println(" Access to the banking menu");
		break;
		}
	else
	{
		System.out.println("Pin is incorrect try again");
	}
   }
	else
	{
		System.out.println(" Your pin is incorrect after 3 attempts, block the card and display a warning ");
		
	}
	}
}
}

		
	 


