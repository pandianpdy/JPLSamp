import java.io.*;
import java.util.Scanner;

class MyBank {
        int menuidx = 0;
        Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MyBank mBank = new MyBank();
        do {
            
            if(mBank.menuidx>0 || mBank.menuidx<6){
                mBank.RunMenu();
                mBank.ExecMenu();
            }
            else
            {
                mBank.menuidx = 6;
            }

        } while(mBank.menuidx<6);
        System.out.println("\n\n----------------------------------");
        System.out.println("              The End");
        System.out.println("----------------------------------");
    }

    public void RunMenu(){
        System.out.println("\n\n----------------------------------");
        System.out.println("              Menu");
        System.out.println("----------------------------------\n");
        System.out.println("              1. Bank");
        System.out.println("              2. Customer");
        System.out.println("              3. Transaction");
        System.out.println("              4. Balance");
        System.out.println("              5. Detail Balance");
        System.out.println("              6. Exit");
        System.out.println("----------------------------------\n");
        System.out.print("              Select Menu : ");
        menuidx = sc.nextInt();
    }
    public void ExecMenu(){
        switch (menuidx) {
            case 1:
                getBank();
                break;
            case 2:
                getCustomer();
                break;
            case 3:
                doTransaction();
                break;                
            case 4:
                listBalance();
                break;                
            case 5:
                listTransaction();
                break;                                
            default:
                break;
        }
    }

    public void getBank(){
        System.out.println("\n\n----------------------------------");
        System.out.println("              Bank Master");
        System.out.println("----------------------------------\n");
        String dbnkname = sc.nextLine();
        System.out.print("              Bank Name : ");
        String bnkname = sc.nextLine();
        System.out.print("              Address   : ");
        String bnkaddr = sc.nextLine();
        System.out.print("              IFC Code  : ");
        String bnkifc = sc.next();
        System.out.println("\n----------------------------------\n");        
        System.out.println(bnkname);
        System.out.println(bnkaddr);
        System.out.println(bnkifc);
        
    }
    public void getCustomer(){
        System.out.println("\n\n----------------------------------");
        System.out.println("              Customer Master");
        System.out.println("----------------------------------\n");
        sc.nextLine();
        System.out.print("              Customer Name : ");
        String custname = sc.nextLine();
        System.out.print("              Address   : ");
        String custaddress = sc.nextLine();
        System.out.println("              Bank Name   ");
        System.out.println("              1. ICICI Bank");
        System.out.println("              2. Canara Bank");        
        System.out.println("              3. SBI");        
        System.out.print  ("                 Bank Code : ");        
        int bnkname = sc.nextInt();
        System.out.print("              Account No.  : ");
        String accountno = sc.next();
        System.out.println("\n----------------------------------\n");        
    }
    public void doTransaction(){
        System.out.println("\n\n----------------------------------");
        System.out.println("              Transaction Master");
        System.out.println("----------------------------------\n");
        System.out.println("               Bank Name   ");
        System.out.println("                 1. ICICI Bank");
        System.out.println("                 2. Canara Bank");        
        System.out.println("                 3. SBI");                
        System.out.print  ("                    Bank Code : ");
        int bnkcode = sc.nextInt();
        System.out.println("               ICICI Bank A/C No.   ");
        System.out.println("                 1. 873837409");
        System.out.println("                 2. 99837464");        
        System.out.print  ("                    Account Code.   : ");
        int accode = sc.nextInt();
        System.out.print("              Date (dd/mm/yyyy) : ");
        String date = sc.next();
        System.out.print("              Deposit/Withdrawal (d/w) : ");
        char isdeposit = sc.next(".").charAt(0);
        System.out.print("              Amount  : ");
        double amount = sc.nextDouble();        
        System.out.println("----------------------------------\n");        
    }
    public void listBalance(){
        System.out.println("\n\n----------------------------------");
        System.out.println("              Balance Details");
        System.out.println("----------------------------------\n");
        System.out.print("              Bank Name : ");
        String bnkname = sc.next();
        System.out.print("\n              Address   : ");
        String bnkaddress = sc.next();
        System.out.print("\n              IFC Code  : ");
        String bnkifc = sc.next();
        System.out.println("----------------------------------\n");        
    }
    public void listTransaction(){
        System.out.println("\n\n----------------------------------");
        System.out.println("              Transaction Details");
        System.out.println("----------------------------------\n");
        System.out.print("              Bank Name : ");
        String bnkname = sc.next();
        System.out.print("\n              Address   : ");
        String bnkaddress = sc.next();
        System.out.print("\n              IFC Code  : ");
        String bnkifc = sc.next();
        System.out.println("----------------------------------\n");        
    }

}