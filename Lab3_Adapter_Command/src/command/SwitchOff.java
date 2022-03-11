package command;

public class SwitchOff implements Command{

    Switch aSwitch;

    //constructor
    public SwitchOff(Switch aSwitch) {
        this.aSwitch = aSwitch;
    }

    @Override
    public void execute() {
        aSwitch.switchOff();
    }
}
