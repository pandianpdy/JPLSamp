import java.io.*;
import java.util.*;
import java.text.*;  
class Transaction {
    int slno;
    Date date;
    double depositamt;
    double withdrawamt;

/*
	public static void main(String args[]){

		Transaction trans = new Transaction();
		//Date dt = new Date();
		//dt = SimpleDateFormat()
		trans.setSlNo(1);
		trans.setDate("03/02/2017");
		trans.Deposit(1500);
		System.out.println(trans.getDate());
		 
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		// dt = formatter.parse("31/03/2015");  
		//Date dt = formatter.parse("31/03/2015");  
		//String strDate= formatter.format(dt);  
		//System.out.println(dt);  
		

	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
				Date date = formatter.parse("31/03/2015");
				System.out.println("Date is: "+ formatter.format(date));
			} catch (ParseException e) {e.printStackTrace();}
			
	}
*/
	
	public Transaction(){
		date = new Date();
	}
    public void setSlNo(int slno){
        this.slno = slno;
    }
    public int getSlNo(){
        return slno;
    }
    public void setDate(String sdate){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");	
		//Date udate;
		try {
				this.date = formatter.parse(sdate);		// "31/03/2015"
			} catch (ParseException e) {e.printStackTrace();}		
        //this.date = udate;
    }
    public String getDate(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");	
		String sdate =  formatter.format(this.date);
        return sdate;
    }
    public void setWithdraw(double withdrawamt){
        this.withdrawamt = withdrawamt;
    }
    public double getWithdraw(){
        return withdrawamt;
    }
    public void setDeposit(double depositamt){
        this.depositamt = depositamt;
    }
    public double getDeposit(){
        return depositamt;
    }
}