package command.excercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> configs = new ArrayDeque<>();
}
