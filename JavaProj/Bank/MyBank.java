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
        System.out.print("              Bank Name : ");
        String bnkname = sc.next();
        System.out.print("\n              Address   : ");
        String bnkaddress = sc.next();
        System.out.print("\n              IFC Code  : ");
        String bnkifc = sc.next();
        System.out.println("----------------------------------\n");        
    }
    public void getCustomer(){
        System.out.println("\n\n----------------------------------");
        System.out.println("              Customer Master");
        System.out.println("----------------------------------\n");
        System.out.print("              Customer Name : ");
        String custname = sc.next();
        System.out.print("\n              Address   : ");
        String custaddress = sc.next();
        System.out.print("\n              Bank Name  : ");
        String bnkname = sc.next();
        System.out.print("\n              Account No.  : ");
        String accountno = sc.next();
        System.out.println("----------------------------------\n");        
    }
    public void doTransaction(){
        System.out.println("\n\n----------------------------------");
        System.out.println("              Transaction Master");
        System.out.println("----------------------------------\n");
        System.out.print("              Bank Code : ");
        String bnkname = sc.next();
        System.out.print("\n              Account No.   : ");
        String accountno = sc.next();
        System.out.print("\n              Date (dd/mm/yyyy) : ");
        String date = sc.next();
        System.out.print("\n              Deposit/Withdrawal  : ");
        char isdeposit = sc.next(".").charAt(0);
        System.out.print("\n              Amount  : ");
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