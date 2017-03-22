import java.io.*;
import java.util.ArrayList;
class Customer {
    String name;
    String address;
    ArrayList<Bank> albank;

    public Customer(){
        albank = new ArrayList<Bank>();
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
    public void setBank(Bank bank){
        this.albank.add(bank);
    }
    public int NofBank(){
        return albank.size();
    }		
    public Bank getBank(int idx){
        return albank.get(idx);
    }
}