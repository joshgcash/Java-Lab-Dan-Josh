package adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoteControlCar implements ToyCar{

    final private static Logger logger = Logger.getLogger(RemoteControlCar.class.getName());

    @Override
    public void accelerates() {
        logger.log(Level.INFO, "Remote Control Car is also Accelerating using batteries... " +
                "\n ----------------------------------------------------------------------------------------");
    }
}
