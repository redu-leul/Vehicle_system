public class Truck extends Vehicle{
    private boolean isdiesel;
    private int loadcapacity;
    private boolean bedcover;

    public Truck(String Brand, int Year, int Speed, boolean isdiesel, int loadcapacity, boolean bedcover){
        super(Brand, Year, Speed);
        this.isdiesel = isdiesel;
        this.loadcapacity = loadcapacity;
        this.bedcover = bedcover;
    }
    public boolean getisdiesel(){
        return isdiesel;
    }
    public int getloadcapacity(){
        return loadcapacity;
    }
    public boolean getbedcover(){
        return bedcover;
    }
    @Override
    public void honk(){
        IO.println("Truck Honks: Honk Hoooonk!");
    }
    @Override
    public void display(){
        super.display();
        IO.println("IS DIESEL:" + isdiesel);
        IO.println("LOAD CAPACITY:" + loadcapacity + " Tons");
        IO.println("BED COVER:" + bedcover);
    }
}
