package car.command;

public class StopEngine implements Command{

    PushStartEngine pushStartEngine;

    //constructor
    public StopEngine (PushStartEngine pushStartEngine) {
        this.pushStartEngine = pushStartEngine;
    }

    @Override
    public void execute() {
        pushStartEngine.switchOff();
    }

}
