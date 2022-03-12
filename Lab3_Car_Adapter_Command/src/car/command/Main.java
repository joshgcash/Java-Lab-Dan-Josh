package car.command;

public class Main {

    public static void main(String[] args) {

        RemoteCommand pushButton = new RemoteCommand();
        PushStartEngine pushStartEngine = new PushStartEngine();

        //ENGINE ON
        pushButton.pushButtonCommand(new StartEngine (pushStartEngine));
        pushButton.pushStartStopEngineButton();

        //ENGINE OFF
        pushButton.pushButtonCommand(new StopEngine (pushStartEngine));
        pushButton.pushStartStopEngineButton();

    }
}
