package ATM;
import java.util.Scanner;

public class atminterface {
	
	
	
public static void main(String[] args) {
	
	 AtmOperations op=new AtmOperations();
     int atmpin=98765;

		
		// TODO Auto-generated method stub

		
		
		//import required classes and packages   
		
		



		

		  
		      
//		        //declare and initialize balance, withdraw, and deposit  
		        
		          
//		        //create scanner class object to get choice of user  
		       
		int balance=5000,withdraw,deposite;
		Scanner sc=new Scanner(System.in);
		          
		        while(true)  
		        {  
		            System.out.println("Automated Teller Machine");  
		            System.out.println("Choose 1 for Withdraw");  
		            System.out.println("Choose 2 for Deposit");  
		            System.out.println("Choose 3 for Check Balance");  
		            System.out.println("Choose 4 for EXIT");  
		            System.out.print("Choose Option:");  
		              
		            //get choice from user  
		            int choice = sc.nextInt();  
		            switch(choice)  
		            {  
		                case 1:  
		                	System.out.print("Enter ATM Pin: ");
		                	
		                	 int pin=sc.nextInt();
			                	if(atmpin == pin){
			                	   
		                	
		                	System.out.print("Enter money to be withdrawn:");  
		                      
		        //get the withdrawl money from user  
		        withdraw = sc.nextInt();  
		                      
		        //check whether the balance is greater than or equal to the withdrawal amount  
		        if(balance >= withdraw)  
		        {  
		            //remove the withdrawl amount from the total balance  
		            balance = balance - withdraw;  
		            System.out.println("Please collect your money");  
		        }  
		        else  
		        {  
		            //show custom error message   
		            System.out.println("Insufficient Balance");  
		        }  
		        System.out.println("");  
		        break;  }
		   
		                case 2:  
		                	System.out.print("Enter ATM Pin: ");
		                	
		                	int pin1=sc.nextInt();
		                	if(atmpin == pin1){
		                	   
			                	   
		                      
		        System.out.print("Enter money to be deposited:");  
		                      
		        //get deposite amount from te user  
		        deposite = sc.nextInt();  
		                      
		        //add the deposit amount to the total balanace  
		        balance = balance + deposite  ;
		        System.out.println("Your Money has been successfully depsited");  
		        System.out.println("");  
		        break;  }
		   
		                case 3:  
		                	System.out.print("Enter ATM Pin: ");
		                	
		                	 int pin2=sc.nextInt();
			                	if(atmpin == pin2){
			                	   
		        //displaying the total balance of the user  
		        System.out.println("Balance : "+balance);  
		        System.out.println("");  
		        break; } 
		   
		                case 4:  
		        //exit from the menu  
		        System.exit(0);  
		            }  
		        }  
		    }  
	 
	}

