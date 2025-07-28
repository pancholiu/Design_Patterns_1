package template.excercise;

public class WindowClose extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Code before closing");
    }

    @Override
    protected void afterClose() {
        System.out.println("Code after closing");
    }
}
