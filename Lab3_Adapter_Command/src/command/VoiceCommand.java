package command;

public class VoiceCommand {

    Command voice;

    public  VoiceCommand(){
    }

    public void voiceCommand(Command command) {
        voice = command;
    }

    public void voiceSpeaksCommand(){
        voice.execute();
    }

}
