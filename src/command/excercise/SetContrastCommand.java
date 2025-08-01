package command.excercise;

public class SetContrastCommand extends AbstractUndoableCommand {
    private float contrast;
    private float prevContrast;


    public SetContrastCommand(float contrast, History history, VideoEditor videoEditor) {
        super(history, videoEditor);
        prevContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }


    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
        history.push(this);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    }
}
