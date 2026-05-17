public abstract class Vehicle {
    private String Brand;
    private int Year;
    protected int Speed;

    public Vehicle(String Brand, int Year, int Speed){
        this.Brand = Brand;
        this.Year = Year;
        this.Speed = 0;
    }
    public String getBrand(){
        return Brand;
    }
    public int getYear(){
        return Year;
    }
    public int getSpeed(){
    return Speed;
    }
    // to have increasing speed, use method
    public void accelerate(int value){
        Speed += value;
    }
    public void brake(int value){
        Speed -= value;
        if (Speed < 0){
            Speed = 0;// so that it doesn't go to negative no
        }
    }
    public abstract void honk();
    public void display(){
        IO.println("BRAND:" + Brand);
        IO.println("YEAR:" + Year);
        IO.println("SPEED:" + Speed + "Km/hr");
    }
}