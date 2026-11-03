import java.util.*;
public class PaymentProcessingSystem
{

private int paymentId;
private double amount;
private String paymentDate;
private String paymentStatus;
public PaymentProcessingSystem()
{
}
public PaymentProcessingSystem(int paymentId,double amount,String paymentDate,String paymentStatus)
{
this.paymentId=paymentId;
this.amount=amount;
this.paymentDate=paymentDate;
}
public int getPaymentId() {
    return paymentId;
}

public void setPaymentId(int paymentId) {
    this.paymentId = paymentId;
}

public double getAmount() {
    return amount;
}

public void setAmount(double amount) {
    this.amount = amount;
}

public String getPaymentDate() {
    return paymentDate;
}

public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
}

public String getPaymentStatus() {
    return paymentStatus;
}

public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
}
    public void processPayment() {
        System.out.println("Processing Payment...");
    }

}
class CashPayment1 extends PaymentProcessingSystem
{
public void processPayment()
{
System.out.println("Processing Payment through Cash");
}

}
class CardPayment1 extends PaymentProcessingSystem
{
public void processPayment()
{
System.out.println("Processing Payment through Card");
}

}
class UPIPayment1 extends PaymentProcessingSystem
{
public void processPayment()
{
System.out.println("Processing Payment through Upi");
}

}
class Main1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
    System.out.println("1. Cash Payment");
    System.out.println("2. Card Payment");
    System.out.println("3. UPI Payment");
    System.out.println("4. Exit");
    System.out.print("Enter your choice: ");
int choice=sc.nextInt();
if(choice==1)
{
    System.out.println("payment through cash: ");
    System.out.print("Enter Payment id: ");
    int id=sc.nextInt();
    System.out.print("Enter Amount: ");
    double amount=sc.nextDouble();
System.out.print("Enter Payment Date: ");
if(sc.hasNext())sc.nextLine();
String date=sc.nextLine();
System.out.print("TransmissionType: ");
String transmissionType=sc.nextLine();

CashPayment1 cashPayment=new CashPayment1();
cashPayment.setPaymentId(id);
cashPayment.setAmount(amount);

cashPayment.setPaymentDate(date);
cashPayment.setPaymentStatus(transmissionType);
System.out.println("Cash payment Details........");
System.out.println("PaymentId: "+cashPayment.getPaymentId());

System.out.println("Amount: "+cashPayment.getAmount());
System.out.println("Date: "+cashPayment.getPaymentDate());
cashPayment.processPayment();
System.out.println("status: "+cashPayment.getPaymentStatus());
System.out.println("********************");

}else if(choice==2)
{


    System.out.println("payment through Card");
    System.out.print("Enter Payment id: ");
    int id=sc.nextInt();
    System.out.print("Enter Amount: ");
    double amount=sc.nextDouble();
System.out.print("Enter Payment Date: ");
if(sc.hasNext())sc.nextLine();

String date=sc.nextLine();
System.out.print("TransmissionType: ");
String transmissionType=sc.nextLine();



CardPayment1 cardPayment = new CardPayment1();

cardPayment.setPaymentId(id);
cardPayment.setAmount(amount);
cardPayment.setPaymentDate(date);
cardPayment.setPaymentStatus(transmissionType);

System.out.println("Card Payment Details........");
System.out.println("PaymentId: " + cardPayment.getPaymentId());
System.out.println("Amount: " + cardPayment.getAmount());
System.out.println("Date: " + cardPayment.getPaymentDate());

cardPayment.processPayment();

System.out.println("Status: " + cardPayment.getPaymentStatus());
System.out.println("********************");

}else if(choice==3)
{
    System.out.println("Payment through UPI");

        System.out.print("Enter Payment id: ");
    int id=sc.nextInt();
    System.out.print("Enter Amount: ");
    double amount=sc.nextDouble();
System.out.print("Enter Payment Date: ");
if(sc.hasNext())sc.nextLine();

String date=sc.nextLine();
System.out.print("TransmissionType: ");
String transmissionType=sc.nextLine();


UPIPayment1 upiPayment = new UPIPayment1();

upiPayment.setPaymentId(id);
upiPayment.setAmount(amount);
upiPayment.setPaymentDate(date);
upiPayment.setPaymentStatus(transmissionType);

System.out.println("UPI Payment Details........");
System.out.println("PaymentId: " + upiPayment.getPaymentId());
System.out.println("Amount: " + upiPayment.getAmount());
System.out.println("Date: " + upiPayment.getPaymentDate());

upiPayment.processPayment();

System.out.println("Status: " + upiPayment.getPaymentStatus());
System.out.println("********************");



}else if(choice==4)
{
    break;
}
}








}
}

