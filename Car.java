public class Car extends Vehicle{
    private String model;
    private String color;
    private String fueltype;
    private int liters;
   
    public Car(String Brand, int Year, int Speed, String model, String color, String fueltype, int liters){
        super(Brand, Year, Speed);
        this.model = model;
        this.color = color;
        this.fueltype = fueltype;
        this.liters = liters;
    }
    public String getmodel(){
        return model;
    }
    public String getcolor(){
        return color;
    }
    public String getfueltype(){
        return fueltype;
    }
    public int getliters(){
        return liters;
    }
    public void startengine(){
        IO.println("Car Engine Started successfully!");
    }
    public void gearchange(int gear){
        IO.println("Gear changed to: " + gear);
    }
    @Override
    public void honk(){
        IO.println("Car Honks: Beep Beep!");
    }
    @Override 
    public void display(){
        super.display();
        IO.println("MODEL:" + model);
        IO.println("COLOR:" + color);
        IO.println("FUEL TYPE:" + fueltype);
        IO.println("LITERS:" + liters);
    }


}