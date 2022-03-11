package command;

public class Main {

    public static void main(String[] args) {

        VoiceCommand voice = new VoiceCommand();
        Switch aSwitch = new Switch();

        voice.voiceCommand(new SwitchOn(aSwitch));
        voice.voiceSpeaksCommand();

        voice.voiceCommand(new SwitchOff(aSwitch));
        voice.voiceSpeaksCommand();

    }
}
