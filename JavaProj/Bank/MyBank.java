import java.io.*;
import java.util.*;

class MyBank {
        int menuidx = 0;
        Scanner sc;
        Customer customer;
        public MyBank(){
            sc = new Scanner(System.in);
            customer = new Customer();
			Init();
        }
    public static void main(String[] args) {
        MyBank mBank = new MyBank();
        do {
            
            if(mBank.menuidx>0 || mBank.menuidx<6){
                mBank.RunMenu();
                mBank.ExecMenu();
            }
            else
            {
                mBank.menuidx = 7;
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
        System.out.println("              1. Customer");
        System.out.println("              2. Bank");
        System.out.println("              3. Transaction");
        System.out.println("              4. Bank Details");
        System.out.println("              5. Balance");
        System.out.println("              6. Detail Balance");
        System.out.println("              7. Exit");
        System.out.println("----------------------------------\n");
		menuidx = getUserInt(1,7);	
    }
    public void ExecMenu(){
        switch (menuidx) {
            case 1:
                getCustomer();
                break;
            case 2:
                getBank();
                break;
            case 3:
                doTransaction();
                break;                
            case 4:
                BankDetails();
                break;                
            case 5:
                listBalance();
                break;                
            case 6:
                listTransaction();
                break;                                
            default:
                break;
        }
    }


    public void getBank(){
        System.out.println("\n\n----------------------------------");
        System.out.printf("        %s's Bank Details%n", customer.getName());
        System.out.println("----------------------------------\n");
        String dbankname = sc.nextLine();
        System.out.print("              Bank Name : ");
        String bankname = sc.nextLine();
        System.out.print("              Address   : ");
        String bankaddr = sc.nextLine();
        System.out.print("              IFC Code  : ");
        String bankifc = sc.next();
        System.out.println("\n----------------------------------\n");               
        Bank bank = new Bank();
        bank.setName(bankname);
        bank.setAddress(bankaddr);
        bank.setIFCNo(bankifc);
               
        System.out.print("      Want to add Account No. (y/n): ");
        //char isacadd = sc.next(".").charAt(0);
		char isacadd = getUserChar("[yn]");
        if(isacadd == 'y'){
            String bankacno;
            do{
                System.out.printf("      Enter %s A/C No. : ",bankname );
                bankacno = sc.next();                
				Account ac = new Account();
                ac.setAccountNo(bankacno);
				bank.setAccount(ac);
                System.out.print("      Want to add Account No. (y/n): ");
                isacadd = sc.next(".").charAt(0);
            }while(isacadd == 'y');
        }
        customer.albank.add(bank);
    }

    public void getCustomer(){
        System.out.println("\n\n----------------------------------");
        System.out.println("              Customer Master");
        System.out.println("----------------------------------\n");
        sc.nextLine();
        System.out.print("              Customer Name : ");
        String name = sc.nextLine();
        System.out.print("              Address   : ");
        String address = sc.nextLine();
        System.out.println("\n----------------------------------\n");        
        customer.setName(name);
        customer.setAddress(address);
    }
    public void doTransaction(){
        int nofbank = customer.NofBank();
        Bank bank = new Bank();
        Account ac = new Account();
        String bankname = "";
        System.out.println("\n\n----------------------------------");
        System.out.println("              Transaction Master");
        System.out.println("----------------------------------\n");
        System.out.println("               Bank Name   ");
		int max = 1;
        for(int i=0;i<nofbank;i++){
            bank = customer.getBank(i);
            bankname = bank.getName();
			max += i;
            System.out.printf("                 %d. %s%n", max, bankname);    
			
        }
        //System.out.print  ("                    Bank Code : ");
        //int bankcode = sc.nextInt();
		int bankcode = getUserInt(1,max);	
        System.out.printf("               %s Bank A/C No.   %n", bankname);
        int nofac = bank.NofAc();
        for(int j=0;j<nofac;j++){
            ac = bank.getAccount(j);
            String acno = ac.getAccountNo();
			max += j;
            System.out.printf("                 %d. %s%n", max, acno);    
        }
        //System.out.print  ("                    Account Code.   : ");
        //int accode = sc.nextInt();   
		int accode = getUserInt(1,max);			
        System.out.print("              Date (dd/mm/yyyy) : ");
        String date = sc.next();
        System.out.print("              Deposit/Withdrawal (d/w) : ");
        char isdeposit = sc.next(".").charAt(0);
        System.out.print("              Amount  : ");
        double amount = sc.nextDouble();        
        System.out.println("----------------------------------\n");        
        double depositamt = 0, withdrawamt = 0;
        if(isdeposit == 'd'){
            depositamt = amount;
        }
        else {
            withdrawamt = amount;
        }
		
		Transaction tr = new Transaction();
		tr.setDate(date);
		tr.setDeposit(depositamt);
		tr.setWithdraw(withdrawamt);
		ac.setTransaction(tr);	
    }
    public void listBalance(){
		int nofbank = customer.NofBank();
		double totbalance = 0;
        Bank bank;
        Account ac;
        System.out.println("\n\n----------------------------------");
        System.out.println("             Bank Balance Details");
        System.out.println("----------------------------------\n");	
        System.out.printf(" Account Holder : %s%n", customer.getName());
		System.out.println("----------------------------------\n");        
        for(int i=0;i<nofbank;i++){
            bank = customer.getBank(i);
            System.out.printf("                 %d. %s%n", i+1, bank.getName());    
			int nofac = bank.NofAc();
			System.out.println("                      Sl.  Account No.     Balance");    
			for(int j=0;j<nofbank;j++){
				ac = bank.getAccount(j);
				String acno = ac.getAccountNo();
				totbalance += ac.getBalance();
				System.out.printf("                      %d. %s                %.2f %n", j+1, acno, ac.getBalance());    
			}
		}
		System.out.println("----------------------------------\n");        
		System.out.printf("                                Total Balance :                   %.2f %n", totbalance);    
        System.out.println("----------------------------------\n");        
    }
	
    public void listTransaction(){
		int nofbank = customer.NofBank();
		double totbalance = 0;
        Bank bank;
        Account ac;
        System.out.println("\n\n-------------------------------------------------------------------------------");
        System.out.println("             Bank Balance Details");
        System.out.println("-------------------------------------------------------------------------------\n");	
        System.out.printf(" Account Holder : %s%n", customer.getName());
		System.out.println("-------------------------------------------------------------------------------\n");        
        for(int i=0;i<nofbank;i++){
            bank = customer.getBank(i);
            System.out.printf(" Bank : %s%n%n", bank.getName());    
			int nofac = bank.NofAc();
			System.out.println("    Sl.  Account No.     Balance");    
			for(int j=0;j<nofbank;j++){
				ac = bank.getAccount(j);
				String acno = ac.getAccountNo();
				totbalance += ac.getBalance();
				System.out.printf("     %d.   %s         %.2f %n", j+1, acno, ac.getBalance());    
				System.out.println("\n          SlNo. Date           Deposit       Withdrawal       Balance");    
				int noftrans = ac.NofTransaction();
				double bal = 0;
				for(int k=0;k<noftrans;k++){
					Transaction trans = ac.getTransaction(k);
					double deposit = trans.getDeposit();
					double withdraw = trans.getWithdraw();
					bal += deposit - withdraw;
					System.out.printf("           %d.   %s     %.2f          %.2f          %.2f %n", k+1, trans.getDate(), deposit, withdraw, bal);    	
				}
			}
		}
		System.out.println("\n-------------------------------------------------------------------------------");        
		System.out.printf("                               Total Balance :                %.2f %n", totbalance);    
        System.out.println("-------------------------------------------------------------------------------\n");        
    }

    public void BankDetails(){
        System.out.println("\n\n----------------------------------");
        System.out.printf("  %s's Bank Details\n", customer.getName());
        System.out.println("----------------------------------\n");

		for (int i = 0; i<customer.NofBank(); i++) {
			Bank bank = customer.getBank(i);
            System.out.printf("     Bank : %s\n", bank.getName());
            System.out.println("----------------------------------\n");           
            for(int j=0;j<bank.account.size();j++){
                System.out.printf("     Account No. %d : %s \n",j+1, bank.account.get(j).getAccountNo());
            }
			System.out.println("----------------------------------\n");       
        }
		String x = sc.next();
    }
	
	public void Init(){
		customer.setName("Sivakumar");
		customer.setAddress("Anna Salai, Pondicherry");
		Bank bank = new Bank();
		bank.setName("ICICI Bank");
		bank.setAddress("II Cross, Pondicherry");
		bank.setIFCNo("IFC8877678");
		customer.setBank(bank);
		Account ac = new Account();
		ac.setAccountNo("123456");
		bank.setAccount(ac);
		Account ac2 = new Account();
		ac2.setAccountNo("789123");
		bank.setAccount(ac2);
		Transaction tr = new Transaction();
		tr.setDate("06/03/2017");
		tr.setDeposit(10500.00);
		tr.setWithdraw(0);
		ac.setTransaction(tr);
		Transaction tr2 = new Transaction();
		tr2.setDate("06/03/2017");
		tr2.setDeposit(0);
		tr2.setWithdraw(1300);
		ac.setTransaction(tr2);
	}

	public int getUserInt(int from, int to){
		int selval = 0;
		do {
			    System.out.printf("               Select from [%d to %d] : ", from, to);
			while (!sc.hasNextInt()) {
			    System.out.printf("               Select from [%d to %d] : ", from, to);
				sc.next();
			}
			selval = sc.nextInt();
		} while ((selval <= 0) | (selval >= 8));		
		return selval;
	}

	public char getUserChar(String pat){
		char selval = ' ';
		//do {
			    System.out.printf("               Select from %s : ", pat);
			while (!sc.hasNext(pat)) {
			    System.out.printf("               Select from %s : ", pat);
				sc.next();
			}
			selval = sc.next(".").charAt(0);
		// } while ((selval <= 0) | (selval >= 8));		
		return selval;
	}	
	
	
	// "[aeiou]"
}