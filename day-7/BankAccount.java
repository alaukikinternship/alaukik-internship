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
public void add(Customer customer)
{
if(bankAccountNumberWiseCustomer.containsKey(customer.getAccountNumber()))
{
  System.out.println("AccountNumber: "+customer.getAccountNumber() + " already Exists");
    return;
}
String accountNumber=customer.getAccountNumber();
list.add(customer);
bankAccountNumberWiseCustomer.put(accountNumber,customer);
System.out.println("Customer added successfully");
}
public void update(Customer customer)
{
    if(bankAccountNumberWiseCustomer.containsKey(customer.getAccountNumber())==false)
    {
        System.out.println("Invalid Customer details");
        return;
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
public void delete(String accountNumber)
{
    if(bankAccountNumberWiseCustomer.containsKey(accountNumber)==false)
    {
        System.out.println("Invalid AccountNumber: "+accountNumber);
        return;
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
public void getByAccountNumber(String accountNumber)
{
    if(bankAccountNumberWiseCustomer.containsKey(accountNumber)==false)
    {
        System.out.println("Inavalid AccountNumber: "+accountNumber);
        return;
    }
    Customer customer=bankAccountNumberWiseCustomer.get(accountNumber);
    
     System.out.println("Customer Account Number: "+customer.getAccountNumber());
        System.out.println("Cusomer Name: "+customer.getAccountHolderName());
System.out.println(" Balance : "+customer.getBalance());
System.out.println("Account Type: "+customer.getAccountType());
System.out.println("Branch Name: "+customer.getBranchName());

}
public double checkBalance(String accountNumber)
{
    if(bankAccountNumberWiseCustomer.containsKey(accountNumber)==false)return 0.0;
    Customer customer;
    customer=bankAccountNumberWiseCustomer.get(accountNumber);
    return customer.getBalance();


}
public void withDraw (String accountNumber,int amount)
{
      if(bankAccountNumberWiseCustomer.containsKey(accountNumber)==false)
      {
        System.out.println("Invalid Account Number: "+accountNumber);
        return;
      }
      Customer customer;
      customer=bankAccountNumberWiseCustomer.get(accountNumber);
      if(amount>customer.getBalance()){
        System.out.println("you can not withdraw becuase your amount is larger then your balance");
        return;
      }
      double balance=customer.getBalance();
      double afterWithDrawBalance=balance-amount;
      System.out.println("Money WithDraw Successfully with Amount: "+amount);

      customer.setBalance(afterWithDrawBalance);

  

}
public void deposite(String accountNumber,int amount)
{

      if(bankAccountNumberWiseCustomer.containsKey(accountNumber)==false)
      {
        System.out.println("Invalid Account Number: "+accountNumber);
        return;
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
    // Custo    mer customer;
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
        System.out.println("5. CheckBalance");
        System.out.println("6. WithDraw Money");
        System.out.println("7. Deposite Money");
        System.out.println("8. Exit");
        System.out.println("Perform Action choose (1--8): ");
    choice=sc.nextInt();
    if(choice==1)
    {
        String accountNumber;
        String accountHolderName;
        double balance;
        String accountType;
        String branchName;
        System.out.println("Enter Customer AccountNumber: ");
        if(sc.hasNext()) sc.nextLine();
        accountNumber=sc.nextLine();
        System.out.println("Enter Customer AccountHolderName: ");
        
        accountHolderName=sc.nextLine();
        System.out.println("Enter Customer Balance: ");
       
        balance=sc.nextDouble();
        System.out.println("Enter Customer Account Type: ");
        if(sc.hasNext()) sc.nextLine();        
        accountType=sc.nextLine();

        System.out.println("Enter Branch Name: ");
        branchName=sc.nextLine();
 Customer customer=new Customer();
      customer.setAccountNumber(accountNumber);
        customer.setAccountHolderName(accountHolderName);
        customer.setBalance(balance);
        customer.setAccountType(accountType);
        customer.setBranchName(branchName);

bankAccount.add(customer);
   

    }


else if(choice==2)
{

        String accountNumber;
        String accountHolderName;
        double balance;
        String accountType;
        String branchName;
        System.out.println("Enter Customer AccountNumber: ");
        if(sc.hasNext()) sc.nextLine();        
        
        accountNumber=sc.nextLine();
        System.out.println("Enter Customer AccountHolderName: ");
        if(sc.hasNext()) sc.nextLine();        
        
        accountHolderName=sc.nextLine();
        System.out.println("Enter Customer Balance: ");
        
        balance=sc.nextDouble();
        System.out.println("Enter Customer Account Type: ");
        if(sc.hasNext()) sc.nextLine();        
        
        accountType=sc.nextLine();
        System.out.println("Enter Branch Name: ");

        branchName=sc.nextLine();

 Customer customer=new Customer();
      customer.setAccountNumber(accountNumber);
        customer.setAccountHolderName(accountHolderName);
        customer.setBalance(balance);
        customer.setAccountType(accountType);
        customer.setBranchName(branchName);

bankAccount.update(customer);
   



}else if(choice==3)
{
    String accountNumber;
    System.out.println("Enter Customer AccountNumber: ");
    if(sc.hasNext()) sc.nextLine();        
            
    accountNumber=sc.nextLine();
bankAccount.delete(accountNumber);

}
else if(choice==4)
{
bankAccount.getAll();
    
}
else if(choice==5)
{
    String accountNumber;
    System.out.println("Enter your AccountNumber: ");
if(sc.hasNext()) sc.nextLine();        
      
    accountNumber=sc.nextLine();
double balance=bankAccount.checkBalance(accountNumber);
System.out.println("your balance is : "+balance);
      
}
else if(choice==6)
{
    
    String accountNumber;
    System.out.println("Enter your Account Number: ");
    if(sc.hasNext()) sc.nextLine();        
        
    accountNumber=sc.nextLine();
int amount;
    System.out.println("Enter a Amount You Want To WithDraw: ");
       
        
    amount=sc.nextInt();
bankAccount.withDraw(accountNumber,amount);

}else if(choice==7)
{
    String accountNumber;
    System.out.println("Enter your Account Number: ");
    if(sc.hasNext()) sc.nextLine();        
        
    accountNumber=sc.nextLine();
    System.out.println("Enter a Amount you Want to Deposit your Account: ");
  
    int amount=sc.nextInt();
     
bankAccount.deposite(accountNumber,amount);


}
else if(choice==8)
{
    break;
}

}

    }
}