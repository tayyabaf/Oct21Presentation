package vehicles;

public class HondaCar implements Car{
    @Override
    public void openDoor() {
        System.out.println("Door is opened");
    }

    @Override
    public void getSpeed() {
        System.out.println("Avg speed is 50 MPH");
    }

    @Override
    public String toString() {
        return "HondaCar";
    }
}
