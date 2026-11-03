public class Payment
{

private int paymentId;
private double amount;
private String paymentDate;
private String paymentStatus;
public Payment()
{
}
public Payment(int paymentId,double amount,String paymentDate,String paymentStatus)
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
class CashPayment extends Payment
{
public void processPayment()
{
System.out.println("Processing Payment through Cash");
}

}
class CardPayment extends Payment
{
public void processPayment()
{
System.out.println("Processing Payment through Card");
}

}
class UPIPayment extends Payment
{
public void processPayment()
{
System.out.println("Processing Payment through Upi");
}

}
class Main
{
public static void main(String args[])
{
CashPayment cashPayment=new CashPayment();
cashPayment.setPaymentId(101);
cashPayment.setAmount(20000);

cashPayment.setPaymentDate("02/11/2026");
cashPayment.setPaymentStatus("Success");
System.out.println("Cash payment Details........");
System.out.println("PaymentId: "+cashPayment.getPaymentId());

System.out.println("Amount: "+cashPayment.getAmount());
System.out.println("Date: "+cashPayment.getPaymentDate());
cashPayment.processPayment();
System.out.println("status: "+cashPayment.getPaymentStatus());
System.out.println("********************");



CardPayment cardPayment = new CardPayment();

cardPayment.setPaymentId(102);
cardPayment.setAmount(15000);
cardPayment.setPaymentDate("02/11/2026");
cardPayment.setPaymentStatus("Success");

System.out.println("Card Payment Details........");
System.out.println("PaymentId: " + cardPayment.getPaymentId());
System.out.println("Amount: " + cardPayment.getAmount());
System.out.println("Date: " + cardPayment.getPaymentDate());

cardPayment.processPayment();

System.out.println("Status: " + cardPayment.getPaymentStatus());
System.out.println("********************");



UPIPayment upiPayment = new UPIPayment();

upiPayment.setPaymentId(103);
upiPayment.setAmount(5000);
upiPayment.setPaymentDate("02/11/2026");
upiPayment.setPaymentStatus("Pending");

System.out.println("UPI Payment Details........");
System.out.println("PaymentId: " + upiPayment.getPaymentId());
System.out.println("Amount: " + upiPayment.getAmount());
System.out.println("Date: " + upiPayment.getPaymentDate());

upiPayment.processPayment();

System.out.println("Status: " + upiPayment.getPaymentStatus());
System.out.println("********************");





}
}

