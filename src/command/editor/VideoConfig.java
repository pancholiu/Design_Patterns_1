package command.editor;

import command.excercise.UndoableCommand;
import command.excercise.VideoEditor;

public class VideoConfig implements UndoableCommand {
    private String prevText;
    private float prevContrast;
    private VideoEditor videoEditor;
    private History history;

    public VideoConfig(VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }


    @Override
    public void execute() {
        prevText = videoEditor.getText();
        prevContrast = videoEditor.getContrast();

    }

    @Override
    public void unexecute() {

    }
}
