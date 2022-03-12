package car.command;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PushStartEngine {

    final private static Logger logger = Logger.getLogger(PushStartEngine.class.getName());

    public void switchOn(){
        logger.log(Level.INFO, "*BUTTON IS PUSHED: ENGINE STARTING*");
    }

    public void switchOff(){
        logger.log(Level.INFO, "*BUTTON IS PUSHED AGAIN: ENGINE SWITCHING OFF");
    }

}
