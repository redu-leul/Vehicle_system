public class Bike extends Vehicle {
    private boolean hascarrier;
    private String size;

    public Bike(String Brand, int Year, int Speed, boolean hascarrier, String size){
        super(Brand, Year, Speed);
        this.hascarrier = hascarrier;
        this.size = size;
    }
    public boolean gethascarrier(){
        return hascarrier;
    }
    public String getsize(){
        return size;
    }
    public void pedal(){
        IO.println("Pedaling the bike...");
    }
    @Override
    public void honk(){
        IO.println("Bike Honks: Ring Ring!");
    }
    @Override
    public void display(){
        super.display();
        IO.println("HAS CARRIER:" + hascarrier);
        IO.println("SIZE:" + size);
    }

    
}
