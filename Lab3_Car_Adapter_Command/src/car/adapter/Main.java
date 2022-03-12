package car.adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    final private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        InnovaCar innovaCar = new InnovaCar();
        ToyCar toyCar = new RemoteControlCar();

        //
        ToyCar carAdapter = new CarAdapter(innovaCar);

        logger.log(Level.INFO, "Innova...");
        innovaCar.accelerate();
        innovaCar.insertFuel();

        logger.log(Level.INFO, "Remote Control Car...");
        toyCar.accelerates();

        //Toy Car behaving like Innova (real car)
        logger.log(Level.INFO , "Car Adapter");
        carAdapter.accelerates();
    }
}
