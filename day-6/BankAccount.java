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

list.add(customer);
 bankAccountNumberWiseCustomer.put(customer.getAccountNumber(),customer);   

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
class Main5
{
    public static void main(String args[])
    {
       

    Customer customer2=new Customer();
      countNumber("91131822000234");
        customer2.setAccountHolderName("Ahemad bilal");
        customer2.setBalance(55000.00);
        customer2.setAccountType("Saving");
        customer2.setBranchName("Mumbai");

        BankAccount bankAccount=new BankAccount();

   

    bankAccount.getAll();
  
   bankAccount.delete("91131822000234");
    bankAccount.getAll();
  
}
}