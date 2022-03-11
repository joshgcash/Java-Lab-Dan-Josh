package adapter;

public class CarAdapter implements ToyCar{

    //implement the interface you expect to use

    Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void accelerates() {
        car.accelerate();
    }
}
