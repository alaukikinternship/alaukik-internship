public class Vehicle
{
    private int vehicleId;
private String brand;
private String model;
private double price;
private String fuelType;

public Vehicle()
    {

    }
    public int getVehicleId() {
    return vehicleId;
}

public void setVehicleId(int vehicleId) {
    this.vehicleId = vehicleId;
}

public String getBrand() {
    return brand;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public String getFuelType() {
    return fuelType;
}

public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
}
    
}
class Car extends Vehicle
{
    private int numberOfDoors;
private int seatingCapacity;
private String transmissionType;
public Car()
{

}
public Car(int numberOfDoors,int seatingCapacity,String transmissionType)
{
    this.numberOfDoors=numberOfDoors;
    this.seatingCapacity=seatingCapacity;
    this.transmissionType=transmissionType;

 
}
public int getNumberOfDoors()
{
    return this.numberOfDoors;
}

public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
}

public int getSeatingCapacity() {
    return seatingCapacity;
}

public void setSeatingCapacity(int seatingCapacity) {
    this.seatingCapacity = seatingCapacity;
}

public String getTransmissionType() {
    return transmissionType;
}

public void setTransmissionType(String transmissionType) {
    this.transmissionType = transmissionType;
}
}
class Bike extends Vehicle
{
private int engineCC;
private String bikeType;
private boolean hasGear;
public Bike()
{

}
public Bike(int engineCC,String bikeType,boolean hasGear)
{
    this.engineCC=engineCC;
    this.bikeType=bikeType;
    this.hasGear=hasGear;
}
public int getEngineCC() {
    return engineCC;
}

public void setEngineCC(int engineCC) {
    this.engineCC = engineCC;
}

public String getBikeType() {
    return bikeType;
}

public void setBikeType(String bikeType) {
    this.bikeType = bikeType;
}

public boolean isHasGear() {
    return hasGear;
}

public void setHasGear(boolean hasGear) {
    this.hasGear = hasGear;
}







}
class Truck extends Vehicle
{


    private double loadCapacity;
private int numberOfWheels;
private String truckType;
public Truck()
{

}
public Truck(double loadCapacity, int numberOfWheels, String truckType)
{
    this.loadCapacity=loadCapacity;
    this.numberOfWheels=numberOfWheels;
    this.truckType=truckType;
}
public double getLoadCapacity() {
    return loadCapacity;
}

public void setLoadCapacity(double loadCapacity) {
    this.loadCapacity = loadCapacity;
}

public int getNumberOfWheels() {
    return numberOfWheels;
}

public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
}

public String getTruckType() {
    return truckType;
}

public void setTruckType(String truckType) {
    this.truckType = truckType;
}


}
class Main1
{
    public static void main(String args[])
    {
        Car car=new Car();
        car.setVehicleId(1450);
        car.setBrand("Kia");
        car.setModel("Seltos");
        car.setPrice(1800000.00);
        car.setFuelType("Deisel");
        car.setNumberOfDoors(4);
        car.setSeatingCapacity(6);
        car.setTransmissionType("manual");
        System.out.println("Car Details.........");
        System.out.println("Id: "+car.getVehicleId());
        System.out.println("Brand: "+car.getBrand());
        System.out.println("Model: "+car.getModel());
        System.out.println("Price: "+car.getPrice());
        System.out.println("FuelType: "+car.getFuelType());
        System.out.println("Number Of Doors: "+car.getNumberOfDoors());
        System.out.println("SeatingCapacity: "+car.getSeatingCapacity());
        System.out.println("TransmissionType: "+car.getTransmissionType());
        System.out.println("************************************");


        Bike bike = new Bike();

bike.setVehicleId(1451);
bike.setBrand("Hero");
bike.setModel("HF Delux");
bike.setPrice(100000.00);
bike.setFuelType("Petrol");

bike.setEngineCC(100);
bike.setBikeType("Cruiser");
bike.setHasGear(true);

System.out.println("Bike Details.........");
System.out.println("Id: " + bike.getVehicleId());
System.out.println("Brand: " + bike.getBrand());
System.out.println("Model: " + bike.getModel());
System.out.println("Price: " + bike.getPrice());
System.out.println("FuelType: " + bike.getFuelType());
System.out.println("Engine CC: " + bike.getEngineCC());
System.out.println("Bike Type: " + bike.getBikeType());
System.out.println("Has Gear: " + bike.isHasGear());

System.out.println("**************************");


Truck truck = new Truck();

truck.setVehicleId(1452);
truck.setBrand("Tata");
truck.setModel("Prima");
truck.setPrice(3500000.00);
truck.setFuelType("Diesel");

truck.setLoadCapacity(25.5);
truck.setNumberOfWheels(10);
truck.setTruckType("Heavy Duty");

System.out.println("Truck Details.........");
System.out.println("Id: " + truck.getVehicleId());
System.out.println("Brand: " + truck.getBrand());
System.out.println("Model: " + truck.getModel());
System.out.println("Price: " + truck.getPrice());
System.out.println("FuelType: " + truck.getFuelType());
System.out.println("Load Capacity: " + truck.getLoadCapacity());
System.out.println("Number Of Wheels: " + truck.getNumberOfWheels());
System.out.println("Truck Type: " + truck.getTruckType());

        


    }
}