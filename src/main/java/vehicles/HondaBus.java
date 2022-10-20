package vehicles;

public class HondaBus implements Bus{
    @Override
    public void stopAtTrainTracks() {
        System.out.println("Bus is stopped at traintracks");
    }

    @Override
    public void openBackDoor() {
        System.out.println("Backdoor is open");
    }
}
