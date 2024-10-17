package command;

public interface ICommand {
    public void AppendText(String text);
    public void UndoText(String text);
}
