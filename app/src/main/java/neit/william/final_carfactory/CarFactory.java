package neit.william.final_carfactory;

import java.util.ArrayList;

public class CarFactory 
{

	private String carType;
	
	private int numOfDoors;
	
	private String tireType;
	
	private int numOfCylinders;
	
	private int wheelSize;
	
	private String drivetrain;
	
	private String carName;
	
	ArrayList<String> shippingCrate = new ArrayList<String>();
	
	public String builtCar;
	
	

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public String getTireType() {
		return tireType;
	}

	public void setTireType(String tireType) {
		this.tireType = tireType;
	}

	public int getNumOfCylinders() {
		return numOfCylinders;
	}

	public void setNumOfCylinders(int numOfCylinders) {
		this.numOfCylinders = numOfCylinders;
	}

	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

	public String getDrivetrain() {
		return drivetrain;
	}

	public void setDrivetrain(String drivetrain) {
		this.drivetrain = drivetrain;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	
	
		
	public String createNewCar (String carType, int numOfDoors, String tireType, int numOfCylinders, int wheelSize, String drivetrain, String carName)
	{
		builtCar =  "Car Name: " + carName + "\n " + "Car Type: "+ carType  +  "\n " + " Number of Doors: "+ Integer.toString(numOfDoors) + "\n " + " Type of Tires: " + tireType +  "\n " +" Number of Cylinders: " + Integer.toString(numOfCylinders)+  "\n " + " Wheel Size: " + Integer.toString(wheelSize) +  "\n " + " Drivetrain: " + drivetrain + "\n " + "\n ";
		
				
		return builtCar;
	}
	
	public void addToCrate(String builtCar)
	{
		shippingCrate.add(builtCar);
	}
	
	
	
}
