import java.util.*;
class BankEx
{
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	int i,ch,bal=60000,amount;
	char ans;
	do
	{
		System.out.println("Enter choice:\n 1:Deposit \n 2:Withdraw");
		ch=s.nextInt();
		System.out.println("Enter amount");
		amount=s.nextInt();
		switch(ch)
		{
			case 1:
			bal=bal+amount;
			break;
			case 2:
			bal=bal-amount;
			break;
		}
		System.out.println("do you want to do the process again");
		ans=s.next().charAt(0);
	}
	while(ans=='y'||ans=='Y');
	System.out.println("final balance:"+bal);
}
}
