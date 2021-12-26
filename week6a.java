import java.util.*;
class vehicle {
    String vehicletype;
    vehicle(String vehicletype)
    {
        this.vehicletype = vehicletype;
    }
}
class brand extends vehicle {
    String vehiclebrand;
    brand(String vehicletype, String vehiclebrand)
    {
        super(vehicletype);
        this.vehiclebrand = vehiclebrand;
    }
}
class cost extends brand {
    int vehiclecost;
    cost(String vehicletype, String vehiclebrand, int vehiclecost)
    {
        super(vehicletype, vehiclebrand);
        this.vehiclecost = vehiclecost;
    }
    void displayInfo()
    {
        System.out.print("\nVehicle type: " + vehicletype + "\nBrand: " + vehiclebrand + "\nCost: " + vehiclecost + ".00/-");
    }
}
class a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Vehicle type, brand and cost: ");
        cost c = new cost(scanner.next(), scanner.next(), scanner.nextInt());
        c.displayInfo();
        scanner.close();
    }
}