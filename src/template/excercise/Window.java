package template.excercise;


public abstract class Window {

    public void close() {
        beforeClose();
        System.out.println("Closing widnow");
        afterClose();
    }

    protected abstract void beforeClose();
    protected abstract void afterClose();
}
