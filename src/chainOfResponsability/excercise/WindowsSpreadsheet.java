package chainOfResponsability.excercise;

public class WindowsSpreadsheet extends Handler {
    public WindowsSpreadsheet(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        System.out.println("filename: " + filename);
        if(filename.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
            return true;
        }

        return false;
    }
}
