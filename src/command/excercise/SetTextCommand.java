package command.excercise;


public class SetTextCommand extends AbstractUndoableCommand {
    private String text;

    public SetTextCommand(String text, VideoEditor videoEditor, History history) {
        super(history, videoEditor);
        this.text = text;
    }

    @Override
    protected void doExecute() {
        videoEditor.setText(text);
    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }
}
