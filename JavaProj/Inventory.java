import java.util.Date;
import java.util.Scanner;

class Inventory {

	public static void main(String args[]){
		//Product prd = new Product();
		//Supplier sup = new Supplier();
		//Customer cust = new Customer();
		//Purchase pur = new Purchase();
		//Sales sale = new Sales();
		MenuMaster mm = new MenuMaster();
	
		mm.getInputs();
		System.out.println();
		System.out.println();			
		System.out.println(mm.mnuMastIdx + " - " + mm.mnuMast);
		System.out.println(mm.mnuSubIdx + " - " + mm.mnuSub);
	}
}	



class Product {
	int code;
	String itemName;
	float stockQty;

	public Product(){

	}

	public Product(int code, String itemName, float stockQty){
		this.code = code;
		this.itemName = itemName;
		this.stockQty = stockQty;
	}	

	public void Code (int code) { this.code = code; }
	public void ItemName(String itemName) {this.itemName = itemName; }
	public void StockQty(float stockQty){this.stockQty = stockQty; }
	public int Code () { return this.code; }
	public String ItemName() { return this.itemName; }
	public float StockQty(){ return this.stockQty; }

}

class Personnal {

	int code;
	String name;
	String address;
	String contactNo;	

	public Personnal(){
	}

	public Personnal(int code, String name, String address, String contactNo){
		this.code = code;
		this.name = name;
		this.address = address;
		this.contactNo = contactNo;	
	}
	
	public void Code (int code) { this.code = code;}
	public void Name(String name) {this.name = name;}
	public void Address(String address){this.address = address;}
	public void ContactNo(String contactNo){this.contactNo = contactNo;}
	public int Code () { return this.code;}
	public String Name() { return this.name;}
	public String Address(){ return this.address;}
	public String ContactNo(){ return this.contactNo;}

}
class Invoice {
	int code;
	int invNo;
	Date invDate;
	int personnalCode;
	int ProductCode;
	float rate;
	float quantity;

	public Invoice(){

	}

	public Invoice(int code, int invNo, Date invDate, int personnalCode, int ProductCode, float rate, float quantity){
		this.code = code;
		this.invNo = invNo;
		this.invDate = invDate;
		this.personnalCode = personnalCode;
		this.ProductCode = ProductCode;
		this.rate = rate;
		this.quantity = quantity;
	}

	public void Code (int code) { this.code = code;}
	public void InvNo(int invNo) {this.invNo = invNo;}
	public void InvDate(Date invDate){this.invDate = invDate;}
	public void PersonnalCode (int personnalCode) { this.personnalCode = personnalCode;}
	public void ProductCode (int ProductCode) { this.ProductCode = ProductCode;}
	public void Rate(float rate){this.rate = rate;}
	public void Quantity(float quantity){this.quantity = quantity;}

	public int Code () { return code;}
	public int InvNo() { return invNo;}
	public Date InvDate(){ return invDate;}
	public int PersonnalCode () { return personnalCode;}
	public int ProductCode () { return ProductCode;}
	public float Rate(){ return rate; }
	public float Quantity(){ return quantity; }

}

class Supplier extends Personnal {}
class Purchase extends Invoice {}

class Customer extends Personnal {}
class Sales extends Invoice {}

class MenuMaster {
	
	int mnuMastIdx = 1;
	int mnuSubIdx = 1;	
	String mnuMast = "Product";
	String mnuSub = "Add";	

	public int MnuMastIdx(){return mnuMastIdx;}
	public int MnuSubIdx(){return mnuSubIdx;}	
	public String MnuMast(){return mnuMast;}
	public String MnuSub(){return mnuMast;}	
	
	public void getInputs(){	
	
		String aMenuMast[] = {"Product","Supplier","Customer","Purchase","Sales","Quit"};
		String aMenuSub[] = {"Add","Edit","Delete","List","Display","Exit"};		
		Scanner sc = new Scanner(System.in);		

		DispMenu (aMenuMast, "") ;
		while (!sc.hasNextInt()) sc.next();
		mnuMastIdx = sc.nextInt();
		mnuMast = aMenuMast[mnuMastIdx];		

		DispMenu (aMenuSub, mnuMast) ;
		while (!sc.hasNextInt()) sc.next();
		mnuSubIdx = sc.nextInt();
		mnuSub = aMenuSub[mnuSubIdx];		
		
/*
		do {
			while (!sc.hasNextInt()) sc.next();
			num2 = sc.nextInt();
		} while (num2 < num1);
		System.out.println(num1 + " " + num2);
	
	
		InputStreamReader istream = new InputStreamReader(System.in) ;
        BufferedReader bufRead = new BufferedReader(istream) ;
               
               System.out.println("Welcome To My First Java Program");
          try {
               System.out.println("Please Enter In Your First Name: ");
               String firstName = bufRead.readLine();
          }
          catch (IOException err) {
               System.out.println("Error reading line");
          }
*/
		  
	}
	
	public void DispMenu( String[] menuList, String mastMenu){
		int i = 0;
		System.out.println();
		if(mastMenu != ""){
			System.out.println("Main Menu : " + mastMenu);		
		}
		System.out.println("Select a Menu by number...");
		System.out.println();
		for(i=0;i<menuList.length;i++){
			System.out.println(i + " - " + menuList[i]);
		}
		System.out.println();		
	}
}

