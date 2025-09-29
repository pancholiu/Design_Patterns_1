package chainOfResponsability.excercise;

public class QuickBookReader extends Handler {
    public QuickBookReader(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(String filename) {
        if(filename.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
            return true;
        }

        return false;
    }

}
