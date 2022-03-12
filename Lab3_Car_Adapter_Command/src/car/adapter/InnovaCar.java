package car.adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class InnovaCar implements Car {

    final private static Logger logger = Logger.getLogger(InnovaCar.class.getName());

    //concrete implementation of car

    @Override
    public void accelerate() {
        logger.log(Level.INFO, "is Accelerating using Diesel... ");
    }

    @Override
    public void insertFuel() {
        logger.log(Level.INFO, "is Filling Diesel..." +
                "\n ---------------------------------------------------------------------------------------- ");
    }

}
