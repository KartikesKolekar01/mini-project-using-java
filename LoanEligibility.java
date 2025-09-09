  import java.util.Scanner;class LoanEligibility
  {
    public static void main(String [] args)
  {
  	Scanner sc=new Scanner(System.in);
  	System.out.print(" Take input as  Available Balance :"); 
  	int balance = sc.nextInt();
  	sc.nextLine();
  	System.out.print(" Take input as  person Salary :");
 	int salary = sc.nextInt();
   	if(balance<=20000 && salary>30000)
   		{
   			System.out.println(" person is eligibile for loan ");
 		}
  	 else
  		{
   			System.out.println("person is not eligible for loan");
   		}
  }
}
   