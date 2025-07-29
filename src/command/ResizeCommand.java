package command;

import command.fx.Command;

import java.sql.SQLOutput;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
