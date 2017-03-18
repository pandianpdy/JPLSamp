import java.io.*;

class Bank {
    String bankname;
    String address;
    String ifcno;
    String acno;
        public void setBankName(int bankname){
        this.bankname = bankname;
    }
    public int getBankName(){
        return bankname;
    }
    public void setAddress(int address){
        this.address = address;
    }
    public int getAddress(){
        return address;
    }
    public void setIFCNo(int ifcno){
        this.ifcno = ifcno;
    }
    public int getIFCNo(){
        return ifcno;
    }
    public void setAcNo(int acno){
        this.acno = acno;
    }
    public int getAcNo(){
        return acno;
    }


}