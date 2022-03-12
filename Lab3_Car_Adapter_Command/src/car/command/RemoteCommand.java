package car.command;

public class RemoteCommand {

    Command pushButton;

    public RemoteCommand() {
        this.pushButton = pushButton;
    }

    public void pushButtonCommand (Command command) {
        pushButton = command;
    }

    public void pushStartStopEngineButton(){
        pushButton.execute();
    }
}
