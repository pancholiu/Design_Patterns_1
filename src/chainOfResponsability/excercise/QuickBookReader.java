package chainOfResponsability.excercise;

public class QuickBookReader extends DataReader {
    @Override
    protected String getExtension() { return ".qbw"; }

    @Override
    protected void doRead(String fileName) { System.out.println("Reading data from Numbers"); }
}
