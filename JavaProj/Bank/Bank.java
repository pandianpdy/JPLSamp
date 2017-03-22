import java.io.*;
import java.util.ArrayList;

class Bank {
    String name;
    String address;
    String ifcno;
    ArrayList<Account> account;
    
    public Bank(){
        account = new ArrayList<Account>();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setIFCNo(String ifcno){
        this.ifcno = ifcno;
    }
    public String getIFCNo(){
        return ifcno;
    }

    public void setAccount(Account account){
        this.account.add(account);
    }
    public Account getAccount(int idx){
        return this.account.get(idx);
    }
    public int NofAc(){
        return account.size();
    }	

    public Transaction getTransaction(int objidx, int idx){
        return this.account.get(objidx).getTransaction(idx);
    }	
	public int NofTransaction(int objidx){
        return this.account.get(objidx).NofTransaction();
    }		
}