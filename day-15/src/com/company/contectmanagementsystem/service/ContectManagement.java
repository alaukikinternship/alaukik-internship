package com.company.contectmanagementsystem.service;
import com.company.contectmanagementsystem.model.*;
import java.util.*;
public class ContectManagement
{
private Map<String,Contect>phoneNumberWiseMap;
private Set<String>emailWiseSet;
private List<Contect>contectList;
public ContectManagement()
{
phoneNumberWiseMap=new HashMap<>();
emailWiseSet=new HashSet<>();
contectList=new LinkedList<>();
}
public void addContect(Contect contect)throws InvalidContectException
{
String phoneNumber=contect.getPhoneNumber();
phoneNumber=phoneNumber.trim();
if(phoneNumber==null || phoneNumber.length()==0)
{
throw new InvalidContectException("Invalid PhoneNumber: "+phoneNumber);

}
String name=contect.getName();
name=name.trim();
if(name==null || name.length()==0)
{
throw new InvalidContectException("Invalid Name: "+name);
}
String email=contect.getEmail();
email=email.trim();
if(email==null || email.length()==0)
{
throw new InvalidContectException("Invalid Email Id: "+email);

}
if(phoneNumberWiseMap.containsKey(phoneNumber))
{
throw new InvalidContectException("Phone Number: "+phoneNumber+"Already Exists");
}
if(emailWiseSet.contains(email))
{
throw new InvalidContectException("Email: "+email+"Already Exists");
}
Contect cont=new Contect();
cont.setName(name);
cont.setPhoneNumber(phoneNumber);
cont.setEmail(email);
contectList.add(cont);
phoneNumberWiseMap.put(phoneNumber,cont);
emailWiseSet.add(email);

System.out.println("Employee Added SuccessFully");
}
public void updateContect(Contect contect)throws InvalidContectException
{


String phoneNumber=contect.getPhoneNumber();
phoneNumber=phoneNumber.trim();
if(phoneNumber==null || phoneNumber.length()==0)
{
throw new InvalidContectException("Invalid PhoneNumber: "+phoneNumber);

}
String name=contect.getName();
name=name.trim();
if(name==null || name.length()==0)
{
throw new InvalidContectException("Invalid Name: "+name);
}
String email=contect.getEmail();
email=email.trim();
if(email==null || email.length()==0)
{
throw new InvalidContectException("Invalid Email Id: "+email);

}if(phoneNumberWiseMap.containsKey(phoneNumber)==false)
{
throw new InvalidContectException("invalid PhoneNumber: "+phoneNumber);
}

Contect oldContect=phoneNumberWiseMap.get(phoneNumber);

if(phoneNumberWiseMap.containsKey(phoneNumber)==false && emailWiseSet.contains(email)==true)
{
throw new InvalidContectException("Email: "+email+" exists");
}
phoneNumberWiseMap.remove(oldContect.getPhoneNumber());
emailWiseSet.remove(oldContect.getEmail());
contectList.remove(oldContect);
Contect newContect=new Contect();
newContect.setName(name);
newContect.setPhoneNumber(phoneNumber);
newContect.setEmail(email);

phoneNumberWiseMap.put(phoneNumber,newContect);
contectList.add(newContect);
emailWiseSet.add(email);

System.out.println("Employee updated SuccessFully");

}
public Contect searchContect(String phoneNumber)throws InvalidContectException 
{
if(phoneNumberWiseMap.containsKey(phoneNumber)==false)
{
throw new InvalidContectException("invalid PhoneNumber: "+phoneNumber);
}
Contect contect=phoneNumberWiseMap.get(phoneNumber);
return contect;



}
public void deleteContect(String phoneNumber)throws InvalidContectException
{

if(phoneNumberWiseMap.containsKey(phoneNumber)==false)
{
throw new InvalidContectException("invalid PhoneNumber: "+phoneNumber);
}
Contect contect=phoneNumberWiseMap.get(phoneNumber);
phoneNumberWiseMap.remove(phoneNumber);
contectList.remove(contect);
emailWiseSet.remove(contect.getEmail());
System.out.println("Employee deleted SuccessFully");

}
public List<Contect> DisplayContects()throws InvalidContectException
{
if(contectList.size()==0)throw new InvalidContectException("No records");

List<Contect>list=new LinkedList<>();
for(Contect contect:contectList)
{
Contect cont=new Contect();
cont.setName(contect.getName());
cont.setPhoneNumber(contect.getPhoneNumber());
cont.setEmail(contect.getEmail());
list.add(cont);
}
return list;
}




}
