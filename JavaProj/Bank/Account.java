import java.io.*;
import java.util.*;

class Account {
    String accountno;
	double balance;
	ArrayList<Transaction> transaction;
	
	public Account (){
		transaction = new ArrayList<Transaction>();
		accountno = "";
		balance = 0;
	}
    public void setAccountNo(String accountno){
        this.accountno = accountno;
    }
    public String getAccountNo(){
        return accountno;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }	

	public void setTransaction(Transaction transaction){
		double d = transaction.getDeposit();
		double w = transaction.getWithdraw();
		this.transaction.add(transaction);
		if(d > 0){
			balance += d;
		}
		else {
			balance -= w;
		}
	}	
	public int NofTransaction(){
		return this.transaction.size();
	}	
	public Transaction getTransaction(int idx){
		return this.transaction.get(idx);
	}
}