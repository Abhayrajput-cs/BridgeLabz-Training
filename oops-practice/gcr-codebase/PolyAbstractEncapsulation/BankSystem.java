//interface Loanable{
//	void applyForLoan();
//	void calculateLoanEligibility();
//}
//abstract class Account{
//	private Long accountNumber;
//	private String holderName;
//	double balance;
//	public Long getAccNo() {
//		return accountNumber;
//	}
//	public void setAccNo(Long accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//	public String getName() {
//		return holderName;
//	}
//	public void setName(String holderName) {
//		this.holderName = holderName;
//	}
//	
//
//   public Account(String name,Long AccNumber,double bal)
//   {
//	   this.accountNumber=AccNumber;
//	   this.balance=bal;
//	   this.holderName=name;
//   }
//    public double deposit(double amount)
//   {
//	  this.balance=balance+amount;
//	  return balance; 
//   }
//    public double withdraw(double amount)
//    {
//    	if(this.balance>=amount)this.balance=balance-amount;
//    	else System.out.println("Not enough balanace");
//    	return balance;
//    }
//  public abstract double calculateInterest();
//  void display() {
//	  System.out.println("Account number :"+getAccNo());
//	  System.out.println("Account Holder name :"+getName());
//	  System.out.println("Account balance :"+balance);
//  }
//  
//}
//class SavingsAccount extends Account{
//
//	public SavingsAccount(String name, Long AccNumber, double bal) {
//		super(name, AccNumber, bal);
//		// TODO Auto-generated constructor stub
//		
//	}
//
//	@Override
//	public double calculateInterest() {
//		// TODO Auto-generated method stub
//		return balance+(balance*0.22);
//	}
//	void display() {
//		  System.out.println("balance after Interest :"+calculateInterest());
//	}
//	void applyForLoan()
//	{
//		
//	}
//	void calculateLoanEligibility()
//	{
//		
//	}
//	
//}
//class CurrentAccount extends Account{
//
//	public CurrentAccount(String name, Long AccNumber, double bal) {
//		super(name, AccNumber, bal);
//		// TODO Auto-generated constructor stub
//	}
//	
//
//	@Override
//	public double calculateInterest() {
//		return balance+(balance*0.11);
//	}
//	void display() {
//		  System.out.println("Balance after Interest on Current : "+calculateInterest());
//	}
//	void applyForLoan() {
//		
//	}
//	void calculateLoanEligibility()
//	{
//		
//	}
//	
//}
//
//
//
//public class BankSystem {
//
//	public static void main(String[] args) {
//		
//		Account acc=new SavingsAccount("Abhay",2215000018L, 2298.34);
//		Account acc2=new SavingsAccount("Abhi",2215885596L, 502.58);
//		Account acc3 = new CurrentAccount("Aashi", 221548965L, 8596);
//		
//	}
//
//}




interface Loanable {
    void applyForLoan();
    void calculateLoanEligibility();
}

abstract class Account {
    private Long accountNumber;
    private String holderName;
    protected double balance;

    public Account(String name, Long accNumber, double bal) {
        this.holderName = name;
        this.accountNumber = accNumber;
        this.balance = bal;
    }

    public Long getAccNo() {
        return accountNumber;
    }

    public String getName() {
        return holderName;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Not enough balance");
        return balance;
    }

    public abstract double calculateInterest();

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account implements Loanable {

    public SavingsAccount(String name, Long accNumber, double bal) {
        super(name, accNumber, bal);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.22;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Savings Account Loan Applied");
    }

    @Override
    public void calculateLoanEligibility() {
        System.out.println("Eligible based on savings balance");
    }
}

class CurrentAccount extends Account implements Loanable {

    public CurrentAccount(String name, Long accNumber, double bal) {
        super(name, accNumber, bal);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.11;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Current Account Loan Applied");
    }

    @Override
    public void calculateLoanEligibility() {
        System.out.println("Eligibility based on business turnover");
    }
}

public class BankSystem {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount("Abhay", 2215000018L, 2298.34);
        Account acc2 = new CurrentAccount("Aashi", 221548965L, 8596);

        acc1.display();
        System.out.printf("Interest: %.2f\n" , acc1.calculateInterest());

        acc2.display();
        System.out.printf("Interest: %.2f", acc2.calculateInterest());
    }
}
