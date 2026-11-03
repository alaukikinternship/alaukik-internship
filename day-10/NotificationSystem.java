import java.util.*;
public interface NotificationSystem
{
public void sendNotification(String message);
}
class EmailService implements NotificationSystem
{
public void sendNotification(String message)
{
System.out.println("Notification can be send through Email");
System.out.println("Message: "+message);
System.out.println("Email send SuccessFully");
}
}
class SMSService implements NotificationSystem
{
public void sendNotification(String message)
{
System.out.println("Notification can be send through SMS");
System.out.println("Message: "+message);
System.out.println("SMS send SuccessFully");

}
}
class WhatsappService implements NotificationSystem
{

public void sendNotification(String message)
{
System.out.println("Notification can be send through WhatsApp");
System.out.println("Message: "+message);
System.out.println("WhatSapp message send SuccessFully");
}

}
class Main1
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("Select Notification");
System.out.println("1. send Email");
System.out.println("2. send SMS");
System.out.println("3. send Whatsapp Message");
System.out.println("4. Exit");
System.out.print("Enter your Choice: ");
int choice=sc.nextInt();
if(choice==1)
{
System.out.println("send Notification through Email");
NotificationSystem service=new EmailService();
System.out.print("Enter your Message: ");
if(sc.hasNext())sc.nextLine();
String message= sc.nextLine();
service.sendNotification(message);
}else if(choice==2)
{

System.out.println("send Notification through SMS");
NotificationSystem service=new SMSService();
System.out.print("Enter your Message: ");
if(sc.hasNext())sc.nextLine();
String message= sc.nextLine();
service.sendNotification(message);

}else if(choice==3)
{

System.out.println("send Notification through Whatsapp");
NotificationSystem service=new WhatsappService();

System.out.print("Enter your Message: ");
if(sc.hasNext())sc.nextLine();
String message= sc.nextLine();
service.sendNotification(message);


}else if(choice==4)
{
break;
}
}
}
}