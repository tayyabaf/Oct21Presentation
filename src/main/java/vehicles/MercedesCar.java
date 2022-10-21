package vehicles;

public class MercedesCar implements Car {
    @Override
    public void openDoor() {
        System.out.println("Door is opened");
    }

    @Override
    public void getSpeed() {
        System.out.println("Avg speed is 60 MPH");
    }

    @Override
    public String toString() {
        return "MercedesCar";
    }
}
