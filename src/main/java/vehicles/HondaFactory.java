package vehicles;

public class HondaFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        HondaCar hondaCar = new HondaCar();
        return hondaCar;
    }

    @Override
    public MiniVan createMiniVan() {
        HondaMiniVan hondaVan = new HondaMiniVan();
        return hondaVan;
    }

    @Override
    public Bus createBus() {
        HondaBus bus = new HondaBus();
        return bus;
    }
}
