public interface PaymentService
{
    public void processPayment(double amount);
}
class UPIPayment implements PaymentService
{
public void processPayment(double amount)
{
    System.out.println("Processing UPI Amount....");
    System.out.println("Amount: "+amount);
    System.out.println("UPI Payment Successfull");

}
}
class CardPayment implements PaymentService
{
    public void processPayment(double amount)
    {

    System.out.println("Processing Card Amount....");
    System.out.println("Amount: "+amount);
    System.out.println("Card Payment Successfull");

    }

}
class NetBankingPayment implements PaymentService
{
public void processPayment(double amount)
{

    System.out.println("Processing through NetBanking....");
    System.out.println("Amount: "+amount);
    System.out.println("NetBanking Payment Successfull");

}
}
class Main
{
    public static void main(String gg[])
    {
        PaymentService service=new CardPayment();
        service.processPayment(15000.00);
        service=new UPIPayment();
        service.processPayment(17000);
        service=new NetBankingPayment();
        service.processPayment(10000);
    }
}