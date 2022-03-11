package command;

import adapter.Innova;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Switch {

    final private static Logger logger = Logger.getLogger(Switch.class.getName());

    public void switchOn(){
        logger.log(Level.INFO, "*TURN'S ON THE LIGHT*");
    }

    public void switchOff(){
        logger.log(Level.INFO, "SWITCH IS OFF");
    }

}
