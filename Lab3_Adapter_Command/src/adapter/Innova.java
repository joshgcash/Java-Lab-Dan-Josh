package adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Innova implements Car{

    final private static Logger logger = Logger.getLogger(Innova.class.getName());

    //concrete implementation of car

    @Override
    public void accelerate() {
        logger.log(Level.INFO, "Innova is Accelerating using Diesel... ");
    }

    @Override
    public void insertFuel() {
        logger.log(Level.INFO, "Innova is Filling Diesel..." +
                "\n ---------------------------------------------------------------------------------------- ");
    }

}

