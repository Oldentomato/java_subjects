package workshop.account.entity;

public class Account {
	private String custId;
	private String acctId;
	private int balance;
	
	public void setCustId(String custId) {
		this.custId = custId;
		
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
		
	}
//	public void setBalance(int balance) {
//		this.balance = balance;
//		
//	}
	
	public String getCustId() {
		return this.custId;
	}
	
	public String getacctId() {
		return this.acctId;
	}
	public int getBalance() {
		return this.balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) {
		if(amount > this.balance) {
			System.out.println("ภÜพืบฮมท");
		}
		else {
			this.balance -= amount;
		}
	}
	
}
