import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Vehicle> Vehicles = new ArrayList<>();

        while (true){
            IO.println("\n =====VEHICLE SYSTEM=====");
            IO.println("1. Add a Car");
            IO.println("2. Add a Truck ");
            IO.println("3. Add a Bike ");
            IO.println("4. Show all vehicles ");
            IO.println("5. Use all vehicles ");
            IO.println("6. Exit");
            IO.print("Choose a number: ");
            
            try{
                int choice = input.nextInt();

                if (choice==1){
                    IO.print("Enter Brand: ");
                    String brand = input.next();
                    IO.print("Enter Year: ");
                    int year = input.nextInt();
                    IO.print("Enter Speed: ");
                    int speed = input.nextInt();
                    IO.print("Enter Model: ");
                    String model = input.next();
                    IO.print("Enter Color: ");
                    String color = input.next();
                    IO.print("Enter Fuel Type: ");
                    String fueltype = input.next();
                    IO.print("Enter Liters: ");
                    int liters = input.nextInt();

                    Car car = new Car(brand, year, speed, model, color, fueltype, liters);
                    Vehicles.add(car);

                    IO.println("Car added successfully!");
                }
                else if (choice==2){
                    IO.print("Enter Brand: ");
                    String brand = input.next();
                    IO.print("Enter Year: ");
                    int year = input.nextInt();
                    IO.print("Enter Speed: ");
                    int speed = input.nextInt();
                    IO.print("Is it Diesel (true/false): ");
                    boolean isdiesel = input.nextBoolean();
                    IO.print("Enter Load Capacity (in Tons): ");
                    int loadcapacity = input.nextInt();
                    IO.print("Does it have Bed Cover (true/false): ");
                    boolean bedcover = input.nextBoolean();

                    Truck truck = new Truck(brand, year, speed, isdiesel, loadcapacity, bedcover);
                    Vehicles.add(truck);

                    IO.println("Truck added successfully!");
                }
                else if (choice==3){
                    IO.print("Enter Brand: ");
                    String brand = input.next();
                    IO.print("Enter Year: ");
                    int year = input.nextInt();
                    IO.print("Enter Speed: ");
                    int speed = input.nextInt();
                    IO.print("Does it have Carrier (true/false): ");
                    boolean hascarrier = input.nextBoolean();
                    IO.print("Enter Size (Small/Medium/Large): ");
                    String size = input.next();

                    Bike bike = new Bike(brand, year, speed, hascarrier, size);
                    Vehicles.add(bike);

                    IO.println("Bike added successfully!");
                }
                else if (choice==4){
                   for (Vehicle v : Vehicles){
                        v.display();
                        IO.println("-------------------");
                   }
                }
                else if (choice==5){
                   for (Vehicle v : Vehicles){
                        v.honk();
                    if(v instanceof Car){
                        ((Car) v).startengine();
                        ((Car) v).gearchange(2);
                    }
                    if (v instanceof Bike){
                        ((Bike) v).pedal();
                    }
                }
            }
                else if (choice==6){
                    IO.print("Exiting the system");
                }
                else{
                    IO.println("Invalid choice! Please choose a number between 1 and 6.");
                }
            }
            catch(Exception e){
                IO.println("Invalid input! Try again.");
                input.nextLine();
            }
        }
    }
}
