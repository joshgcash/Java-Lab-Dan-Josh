package command;

public class SwitchOn implements Command{

    Switch aSwitch;

    //constructor
    public SwitchOn (Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void execute() {
        aSwitch.switchOn();
    }
}
