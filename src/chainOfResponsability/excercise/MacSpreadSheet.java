package chainOfResponsability.excercise;

public class MacSpreadSheet extends Handler {
    public MacSpreadSheet(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        if(filename.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
            return true;
        }

        return false;
    }
}
