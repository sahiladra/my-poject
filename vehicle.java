class Vehicle 
{
    
    protected String vehicleType;
    public Vehicle(String vehicleType) 
    {
        this.vehicleType = vehicleType;
    }
    public void display() 
    {
        System.out.println("Vehicle Type: " + vehicleType);
    }
}

class Car extends Vehicle 
{

    private String modelType;
    private String companyName;

    public Car(String vehicleType, String modelType, String companyName) 
    {
        
        super(vehicleType);
        this.modelType = modelType;
        this.companyName = companyName;
    }

    
   
    public void display() 
    {
        
        super.display();
        System.out.println("Model Type: " + modelType);
        System.out.println("Company Name: " + companyName);
    }
}

public class Vehicle 
{
    public static void main(String[] args) 
    {
       
        Vehicle vehicle = new Vehicle("Two-Wheeler");
        System.out.println("Vehicle Information:");
        vehicle.display();  

        System.out.println("\n--------------------");

        
        Car car = new Car("Four-Wheeler", "Sedan", "Toyota");
        System.out.println("Car Information:");
        car.display();  
    }
}