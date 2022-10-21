package vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which vehicle company do you choose (Mercedes or Honda)");
        String company = sc.nextLine();
        System.out.println("Bus, car, or minivan?");
        String type = sc.nextLine();
        if(type.equalsIgnoreCase("car")) {
            System.out.println("Created a " + FactoryProvider.getFactory(company).createCar());
        }else if (type.equalsIgnoreCase("bus")){
            System.out.println("Created a " + FactoryProvider.getFactory(company).createBus());
        }else if (type.equalsIgnoreCase("minivan")){
            System.out.println("Created a " + FactoryProvider.getFactory(company).createMiniVan());
        }
    }
}
