import java.util.Scanner;
class Vehicle
{
    float speed,fuel,dist,mileage;
    int no_of_wheels;
    String type;
    public static void main(String[] args)
    {
        Vehicle v = new Vehicle();
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the speed(km/hr): ");
        v.speed=r.nextFloat();
        System.out.print("Enter number of wheels: ");
        v.no_of_wheels=r.nextInt();
        System.out.print("Enter distance covered(km): ");
        v.dist=r.nextFloat();
        System.out.print("Enter total fuel used to covered the above distance(in liters): ");
        v.fuel=r.nextFloat();
        r.nextLine();
        System.out.print("Enter type: ");
        v.type=r.nextLine();
        v.calspeed();
        v.displayinfo();
    }
    void calspeed()
    {
        mileage=dist/fuel;
    }
    void displayinfo()
    {
       System.out.println("Speed(km/hr): "+speed);
       System.out.println("No of wheels: "+no_of_wheels);
       System.out.println("Distance covered: "+dist);
       System.out.println("Fuel used: "+fuel);
       System.out.println("Type: "+type);
       System.out.println("Mileage(km/l): "+mileage);
    }
}
