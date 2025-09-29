package chainOfResponsability.excercise;

import chainOfResponsability.HttpRequest;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(String filename) {
        if(doHandle(filename))
            return;

        if(next != null)
            next.handle(filename);
    }

    public abstract boolean doHandle(String filename);
}
