package vehicles;

public class MercedesFactory implements VehicleFactory{
    @Override
    public Car createCar() {
        MercedesCar mercedesCar = new MercedesCar();
        return mercedesCar;
    }

    @Override
    public MiniVan createMiniVan() {
        MercedesMiniVan mercedesMiniVan = new MercedesMiniVan();
        return mercedesMiniVan;
    }

    @Override
    public Bus createBus() {
        MercedesBus mercedesBus = new MercedesBus();
        return mercedesBus;
    }
}
