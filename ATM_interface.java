import java.util.Scanner;  
public class ATM_interface  
{  

    public static void main(String args[] )  
    {  
    
        int balance = 8000, withdraw, deposit;  
          
        
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("\nWelcome to the ATM!");  
            System.out.println("1.for Withdraw");  
            System.out.println("2.for Deposit");  
            System.out.println("3.for Check Balance");  
            System.out.println("4.for EXIT");  
            System.out.print("Enter your choice:(choose 1,2,3, or 4)");  
              
            
            int choice = sc.nextInt();  
            switch(choice)  
            {  
            case 1:  
        System.out.print("Enter money you want to withdrawn:");  
                      
         
        withdraw = sc.nextInt();  
                      
          
        if(balance >= withdraw)  
        {  
         
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
            break;  
   
        case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
          
        deposit = sc.nextInt();  
                      
          
        balance = balance + deposit;  
        System.out.println("Money has been successfully depsited");
        System.out.println("your total amount will be: "+balance);  
        System.out.println("");  
            break;  
   
        case 3:  
    
        System.out.println("Balance : "+balance);  
        System.out.println("");  
            break;  
   
        case 4:  
        System.out.println("Thank you for using ATM !!");
        System.exit(0);
        
          } 
        } 
    }  
}  