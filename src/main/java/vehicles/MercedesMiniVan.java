package vehicles;

public class MercedesMiniVan implements MiniVan {
    @Override
    public void fillTank() {
        System.out.println("Filling up tank");
    }

    @Override
    public void slideDoor() {
        System.out.println("door is slided open");
    }

    @Override
    public void getSpeed() {
        System.out.println("average speed is 45 MPH");
    }
}