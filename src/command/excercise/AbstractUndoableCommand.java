package command.excercise;

public abstract class AbstractUndoableCommand implements UndoableCommand {
    protected VideoEditor videoEditor;
    protected History history;
    public AbstractUndoableCommand(History history, VideoEditor videoEditor) {
        this.history = history;
        this.videoEditor = videoEditor;
    }

    @Override
    public void execute() {

    }

    protected abstract void doExecute();
}
