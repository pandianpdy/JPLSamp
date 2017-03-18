import java.io.*;
class Transaction {
    int slno;
    String date;
    double dr;
    double cr;

    public void setSlNo(int slno){
        this.slno = slno;
    }
    public int getSlNo(){
        return slno;
    }

    public void setDate(int date){
        this.date = date;
    }
    public int getDate(){
        return date;
    }
        public void setDr(int dr){
        this.dr = dr;
    }
    public int getDr(){
        return dr;
    }
    public void setCr(int cr){
        this.cr = cr;
    }
    public int getCr(){
        return cr;
    }


}