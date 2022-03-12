package car.command;

public class StartEngine implements Command {

    PushStartEngine pushStartEngine;

    //constructor
    public StartEngine (PushStartEngine pushStartEngine) {
        this.pushStartEngine = pushStartEngine;
    }

    @Override
    public void execute() {
        pushStartEngine.switchOn();
    }

}
