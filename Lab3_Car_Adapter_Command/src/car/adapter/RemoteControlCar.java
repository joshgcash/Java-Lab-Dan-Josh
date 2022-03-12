package car.adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoteControlCar implements ToyCar{

    final private static Logger logger = Logger.getLogger(RemoteControlCar.class.getName());

    @Override
    public void accelerates() {
        logger.log(Level.INFO, "is also Accelerating using batteries... " +
                "\n ----------------------------------------------------------------------------------------");
    }
}
