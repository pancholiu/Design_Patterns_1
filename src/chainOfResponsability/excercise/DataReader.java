package chainOfResponsability.excercise;


public class DataReader {


    public void read(String filename) {

        var windowsReader = new WindowsSpreadsheet(null);
        windowsReader.doHandle(filename);

        var macReader = new MacSpreadSheet(windowsReader);
        macReader.doHandle(filename);

        var quickBookReader = new QuickBookReader(macReader);

        if(quickBookReader.doHandle(filename))
            throw new UnsupportedOperationException("File format not supported.");

        /*
        if (fileName.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
        }
        else if (fileName.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
        }
        else if (fileName.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
        }
        else
            throw new UnsupportedOperationException("File format not supported.");
         */
    }
}
