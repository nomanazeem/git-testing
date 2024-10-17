package command;

public class TextEditor implements ICommand {
    String text="";

    @Override
    public void AppendText(String text) {
        this.text = this.text.concat(text);

        System.out.println("data-->"+this.text);
    }

    @Override
    public void UndoText(String text) {
        this.text = this.text.replace(text, "");
        System.out.println("data-->"+this.text);
    }
}

