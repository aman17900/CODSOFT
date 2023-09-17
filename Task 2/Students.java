package Registration;
import java.util.Scanner ;
	
public class Students {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=== Welcome To Student Course Registration ===");
		do {
			
			Students b=new Students();
			System.out.println(" 1. ADD RECORDS :");
			System.out.println(" 2. GUARIDIAN RECORDS :");
			System.out.println(" 3. COURSE DETAILS :");	
			System.out.println(" 4. EXIT :");
			System.out.println(" ENTER YOUR CHOICE :");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: b.add();
			break;
			case 2: b.parent();
			break;
			case 3: b.course();
			break;
			case 4: b.exit();
			break;
			default :System .out.println("YOU HAVE ENTERED INVALID NUMBER");
			break;
			}
		
			System.out.println("DO YOU WANT TO CONTINUE PRESS 1");
			} 
		while(sc.nextInt()==1);
	}
	Scanner sc=new Scanner(System.in);
	void add() 
	{
		System .out.println("=== STUDENT'S DETAILS===");
		System .out.println("ENTER STUDENT'S NAME :");
		String name=sc.nextLine();
		System .out.println("ENTER STUDENT'S ID :");
		String id=sc.nextLine();
		System .out.println("ENTER STUDENT'S ADDRESS :"); 
		String address=sc.nextLine();
		System .out.println("ENTER STUDENT'S DOB:");
		String dob=sc.nextLine();
		System .out.println("ENTER STUDENT'S CONTACT NUMBER:");
		String cn=sc.nextLine();
	}
	  void parent()
	  
{       System .out.println("=== STUDENT'S GUARIDIANS DETAILS:");
        System.out.println("ENTER STUDENT'S PARENT NAME: ");
        String n=sc.nextLine();
        
        
        System.out.println("ENTER STUDENT'S PARENT CONTACT NUMBER:");
        String c=sc.nextLine();
        
        System.out.println("ENTER STUDENT'S PARENT E-MAIL: ");
        String e=sc.nextLine();
        
      
	
}
	  void course()
	  {  System .out.println("=== ENTER THE COURSE FROM THE FOLLOWING===");
      System.out.println("COMPUTER SCIENCE ENGINEERING: ");
      System .out.println("INFORMATION TECHNOLOGY ENGINEERING: ");
      System.out.println("CIVIL ENGINEERING : ");
      System .out.println("MECHNICAL ENGINEERING: ");
      
      String select=sc.nextLine();
      System .out.println("YOU HAVE SELECTED " +select );
      
		  
	  }
	  
	  void exit()
	  {
		  System .out.println("====THANKS FOR VISITING====");
	  }
	  
}
