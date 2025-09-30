import chainOfResponsability.excercise.DataReaderFactory;

public class Main {
   public static void main(String[] args) {
      var reader = DataReaderFactory.getDataReaderChain();
      reader.read("data.exe");
   }
}