package vehicles;

public class FactoryProvider {
    public static VehicleFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("Honda")){
            return new HondaFactory();
        }
        else if (choice.equalsIgnoreCase("Mercedes")){
            return new MercedesFactory();
        }
        return null;
    }
}
