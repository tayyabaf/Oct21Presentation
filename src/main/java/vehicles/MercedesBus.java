package vehicles;

public class MercedesBus implements Bus{

    @Override
    public void openBackDoor() {
        System.out.println("Backdoor is open");
    }

    @Override
    public String toString() {
        return "MercedesBus";
    }
}