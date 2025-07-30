package command.excercise;

public interface UndoableCommand extends Command{
    void unexecute();
}
