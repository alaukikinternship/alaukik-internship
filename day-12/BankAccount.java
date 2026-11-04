import java.util.*;
import java.io.*;
public class BankAccount
{
    private Map<String,Customer>bankAccountNumberWiseCustomer;
    private List<Customer>list;
    Scanner sc;
    public BankAccount()
    {
        bankAccountNumberWiseCustomer=new HashMap<>();
        list=new ArrayList<>();
        sc=new Scanner(System.in);
    }
public void add(Customer customer)throws AccountNotFoundException
{
if(bankAccountNumberWiseCustomer.containsKey(customer.getAccountNumber()))
{
  throw new AccountNotFoundException("AccountNumber: "+customer.getAccountNumber() + " already Exists");
 
}
String accountNumber=customer.getAccountNumber();
list.add(customer);
bankAccountNumberWiseCustomer.put(accountNumber,customer);
System.out.println("Customer added successfully");
}
public void update(Customer customer)throws AccountNotFoundException
{
    if(bankAccountNumberWiseCustomer.containsKey(customer.getAccountNumber())==false)
    {
throw new AccountNotFoundException("Invalid Customer details,this Customer can not be Exists"); 
}
    bankAccountNumberWiseCustomer.remove(customer.getAccountNumber());
for(Customer cus:list)
{
    if(cus.getAccountNumber().equalsIgnoreCase(customer.getAccountNumber()))
    {
        list.remove(cus);
        list.add(customer);
    }
}
}
public void delete(String accountNumber)throws AccountNotFoundException
{
    if(bankAccountNumberWiseCustomer.containsKey(accountNumber)==false)
    {
        throw new AccountNotFoundException("Invalid AccountNumber: "+accountNumber);
       
    }
    Customer customer=bankAccountNumberWiseCustomer.get(accountNumber);
    
      System.out.println("Customer Account Number: "+customer.getAccountNumber());
        System.out.println("Cusomer Name: "+customer.getAccountHolderName());
System.out.println(" Balance : "+customer.getBalance());
System.out.println("Account Type: "+customer.getAccountType());
System.out.println("Branch Name: "+customer.getBranchName());
System.out.println("Are you Sure you want to delete this customer (y/N) ?");
char deletion=sc.next().charAt(0);
if(deletion=='y')
{
    list.remove(customer);
    bankAccountNumberWiseCustomer.remove(customer.getAccountNumber());
}




}
public void getByAccountNumber(String accountNumber)throws AccountNotFoundException
{
    if(bankAccountNumberWiseCustomer.containsKey(accountNumber)==false)
    {
        throw new AccountNotFoundException("Inavalid AccountNumber: "+accountNumber);
        
    }
    Customer customer=bankAccountNumberWiseCustomer.get(accountNumber);
    System.out.println("Customer details........");
     System.out.println("Customer Account Number: "+customer.getAccountNumber());
        System.out.println("Cusomer Name: "+customer.getAccountHolderName());
System.out.println(" Balance : "+customer.getBalance());
System.out.println("Account Type: "+customer.getAccountType());
System.out.println("Branch Name: "+customer.getBranchName());

}
public double checkBalance(String accountNumber)throws AccountNotFoundException
{
    if(bankAccountNumberWiseCustomer.containsKey(accountNumber)==false)
{
throw new AccountNotFoundException("Invalid AccountNumber: "+accountNumber);
}
    Customer customer;
    customer=bankAccountNumberWiseCustomer.get(accountNumber);
    return customer.getBalance();


}
public void withDraw(String accountNumber,int amount)throws AccountNotFoundException,InsufficientBalanceException,InvalidAmountException
{
if(amount<0)
{
throw new InvalidAmountException("Invalid Amount: "+amount);
}
      if(bankAccountNumberWiseCustomer.containsKey(accountNumber)==false)
      {
        throw new AccountNotFoundException("Invalid Account Number: "+accountNumber);
        
      }
      Customer customer;
      customer=bankAccountNumberWiseCustomer.get(accountNumber);
      if(amount>customer.getBalance()){
        throw new InsufficientBalanceException("you can not withdraw becuase your amount is larger then your balance");
      }
      double balance=customer.getBalance();
      double afterWithDrawBalance=balance-amount;
      System.out.println("Money WithDraw Successfully with Amount: "+amount);

      customer.setBalance(afterWithDrawBalance);

  

}

public void deposite(String accountNumber,int amount)throws AccountNotFoundException
{

      if(bankAccountNumberWiseCustomer.containsKey(accountNumber)==false)
      {
        throw new AccountNotFoundException("Invalid Account Number: "+accountNumber);
        
      }
      Customer customer;
      customer=bankAccountNumberWiseCustomer.get(accountNumber);
      double balance=customer.getBalance();
      double updatedBalance=balance+amount;
      System.out.println(amount+" Successfully Deposited in your account");
      customer.setBalance(updatedBalance);
}
public void getAll()
{
   
    list.forEach((customer)->{
        System.out.println("Customer Account Number: "+customer.getAccountNumber());
        System.out.println("Cusomer Name: "+customer.getAccountHolderName());
System.out.println(" Balance : "+customer.getBalance());
System.out.println("Account Type: "+customer.getAccountType());
System.out.println("Branch Name: "+customer.getBranchName());

    });
//     for(int i=0;i<list.size();i++)
//     {
//         customer=list.get(i);
//         System.out.println("Customer Account Number: "+customer.getAccountNumber());
//         System.out.println("Cusomer Name: "+customer.getAccountHolderName());
// System.out.println(" Balance : "+customer.getBalance());
// System.out.println("Account Type: "+customer.getAccountType());
// System.out.println("Branch Name: "+customer.getBranchName());

//     }


}

}
 class Customer
{
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    private String branchName;

    public Customer()
    {

    }
    public Customer(String accountNumber,String accountHolderName,double balance,String accountType,String branchName)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.accountType=accountType;
        this.branchName=branchName;
    }


   public String getAccountNumber() {
    return accountNumber;
}

public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
}

public String getAccountHolderName() {
    return accountHolderName;
}

public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
}

public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}

public String getAccountType() {
    return accountType;
}

public void setAccountType(String accountType) {
    this.accountType = accountType;
}

public String getBranchName() {
    return branchName;
}

public void setBranchName(String branchName) {
    this.branchName = branchName;
}
    
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BankAccount bankAccount=new BankAccount();
        int choice;
       while(true)
       {
        System.out.println("1. Add Customer");
        System.out.println("2. Update Customer");
        System.out.println("3. delete Customer");
        System.out.println("4. getAll Customer");
	System.out.println("5. get Customer by Account Number");
        System.out.println("6. CheckBalance");
        System.out.println("7. WithDraw Money");
        System.out.println("8. Deposite Money");
        System.out.println("9. Exit");
        System.out.print("Perform Action choose (1--9): ");
    choice=sc.nextInt();
if(choice<1 || choice>9)
{
System.out.println("Please choose the valid Choice");

}
    if(choice==1)
    {
try
{
        String accountNumber;
        String accountHolderName;
        double balance;
        String accountType;
        String branchName;
        System.out.print("Enter Customer AccountNumber: ");
        if(sc.hasNext())sc.nextLine();
        accountNumber=sc.nextLine();
accountNumber=accountNumber.trim();
        System.out.print("Enter Customer AccountHolderName: ");
        
        accountHolderName=sc.nextLine();
        System.out.print("Enter Customer Balance: ");
       
        balance=sc.nextDouble();
        System.out.print("Enter Customer Account Type: ");
        if(sc.hasNext()) sc.nextLine();        
        accountType=sc.nextLine();

        System.out.print("Enter Branch Name: ");
        branchName=sc.nextLine();
 Customer customer=new Customer();
      customer.setAccountNumber(accountNumber);
        customer.setAccountHolderName(accountHolderName);
        customer.setBalance(balance);
        customer.setAccountType(accountType);
        customer.setBranchName(branchName);

bankAccount.add(customer);
}catch(AccountNotFoundException exception)
{
System.out.println(exception.getMessage());
}   

    }


else if(choice==2)
{
try
{
        String accountNumber;
        String accountHolderName;
        double balance;
        String accountType;
        String branchName;
        System.out.print("Enter Customer AccountNumber: ");
        if(sc.hasNext()) sc.nextLine();        
        
        accountNumber=sc.nextLine();
        System.out.print("Enter Customer AccountHolderName: ");
        if(sc.hasNext()) sc.nextLine();        
        
        accountHolderName=sc.nextLine();
        System.out.print("Enter Customer Balance: ");
        
        balance=sc.nextDouble();
        System.out.print("Enter Customer Account Type: ");
        if(sc.hasNext()) sc.nextLine();        
        
        accountType=sc.nextLine();
        System.out.print("Enter Branch Name: ");

        branchName=sc.nextLine();

 Customer customer=new Customer();
      customer.setAccountNumber(accountNumber);
        customer.setAccountHolderName(accountHolderName);
        customer.setBalance(balance);
        customer.setAccountType(accountType);
        customer.setBranchName(branchName);

bankAccount.update(customer);
   
}catch(AccountNotFoundException exception)
{
System.out.println(exception.getMessage());
}


}else if(choice==3)
{
try
{
    String accountNumber;
    System.out.print("Enter Customer AccountNumber: ");
    if(sc.hasNext()) sc.nextLine();        
            
    accountNumber=sc.nextLine();
bankAccount.delete(accountNumber);
}catch(AccountNotFoundException exception)
{
System.out.println(exception.getMessage());
}
}
else if(choice==4)
{
bankAccount.getAll();
    
}
else if(choice==5)
{
System.out.println("Get Customer By Account Number");
    String accountNumber;
    System.out.print("Enter your Account Number: ");
if(sc.hasNext()) sc.nextLine();        
      
    accountNumber=sc.nextLine();
try
{
bankAccount.getByAccountNumber(accountNumber);
 }catch(AccountNotFoundException accountNotFoundException)
{
System.out.println(accountNotFoundException.getMessage());
}
}
else if(choice==6)
{
try
{
    String accountNumber;
    System.out.print("Enter your Account Number: ");
if(sc.hasNext()) sc.nextLine();        
      
    accountNumber=sc.nextLine();
double balance=bankAccount.checkBalance(accountNumber);
System.out.println("your balance is : "+balance);
 }catch(AccountNotFoundException exception)
{
System.out.println(exception.getMessage());
}     
}
else if(choice==7)
{
 try
{   
    String accountNumber;
    System.out.print("Enter your Account Number: ");
    if(sc.hasNext()) sc.nextLine();        
        
    accountNumber=sc.nextLine();
int amount;
    System.out.print("Enter a Amount You Want To WithDraw: ");
       
        
    amount=sc.nextInt();
bankAccount.withDraw(accountNumber,amount);
}catch(AccountNotFoundException exception)
{
System.out.println(exception.getMessage());
}catch(InsufficientBalanceException insufficientBalanceException)
{
System.out.println(insufficientBalanceException.getMessage());
}
catch(InvalidAmountException invalidAmountException)
{
System.out.println(invalidAmountException.getMessage());
}
}else if(choice==8)
{
try
{
    String accountNumber;
    System.out.print("Enter your Account Number: ");
    if(sc.hasNext()) sc.nextLine();        
        
    accountNumber=sc.nextLine();
    System.out.print("Enter a Amount you Want to Deposit your Account: ");
  
    int amount=sc.nextInt();
     
bankAccount.deposite(accountNumber,amount);
}catch(AccountNotFoundException exception)
{
System.out.println(exception.getMessage());
}

}
else if(choice==9)
{
    break;
}

}

    }
}