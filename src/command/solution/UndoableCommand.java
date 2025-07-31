package command.solution;

public interface UndoableCommand extends Command {
    void undo();
}
