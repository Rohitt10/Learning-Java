import java.util.Scanner;
class Account
{
	private int id;
	private double balance,annualInterestRate;
	public Account()
	{
		this.id=0;
		this.balance=0;
		this.annualInterestRate=0;
	}
	public Account(int id,double balance)
	{
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=0;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public void setannualInterestRate(double a)
	{
		this.annualInterestRate=a;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public int getID()
	{
		return id;
	}
	public double getannualInterestRate()
	{
		return annualInterestRate;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
	}
	public double getMonthlyIntjaerest()
	{
		double mi=balance*(this.getMonthlyInterestRate()/100);
		return mi;
	}
	public void withdraw(double value)
	{
		this.balance=balance-value;
	}
	public void deposit(double value)
	{
		this.balance=balance+value;
	}
	public void display()
	{
		System.out.println("Account ID: "+this.id);
		System.out.println("Balance: $"+this.balance);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int id;
		double balance,ir,wa,da;
		System.out.print("enter id");
		id=sc.nextInt();
		System.out.print("enter balance");
		balance=sc.nextInt();
		System.out.print("interest rate");
		ir=sc.nextInt();
		System.out.print("withdraw amount");
		wa=sc.nextInt();
		System.out.print("deposit amount");
		da=sc.nextInt();
		Account obj=new Account(id,balance);
		obj.setannualInterestRate(ir);
		obj.withdraw(wa);
		obj.deposit(da);
		System.out.println("Account Statement");
		obj.display();
		System.out.print("Monthly interest: $"+obj.getMonthlyInterest());
	}
}