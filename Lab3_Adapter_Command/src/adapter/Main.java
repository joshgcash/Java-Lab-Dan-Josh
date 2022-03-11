package adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    final private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Innova innova = new Innova();
        ToyCar toyCar = new RemoteControlCar();

        //
        ToyCar carAdapter = new CarAdapter(innova);

        logger.log(Level.INFO, "Innova...");
        innova.accelerate();
        innova.insertFuel();

        logger.log(Level.INFO, "Remote Control Car...");
        toyCar.accelerates();

        //Toy Car behaving like Innova (real car)
        logger.log(Level.INFO , "Car Adapter");
        carAdapter.accelerates();
    }
}

