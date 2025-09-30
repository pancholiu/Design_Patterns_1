package chainOfResponsability.excercise;


public abstract class DataReaderFactory {
    public static DataReader getDataReaderChain() {
        var excelReader = new ExcelReader();
        var numberReader = new NumbersReader();
        var quickBookReader = new QuickBookReader();

        quickBookReader.setNext(numberReader);
        numberReader.setNext(excelReader);

        return quickBookReader;
    }
}
