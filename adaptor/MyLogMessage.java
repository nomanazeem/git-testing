package adaptor;

public class MyLogMessage implements ILog{
    private OldLogMessage oldLogMessage;
    public MyLogMessage(){
        this.oldLogMessage = new OldLogMessage();
    }
    @Override
    public void LogMessage(String message) {
        oldLogMessage.logMessage(message);
    }
}
