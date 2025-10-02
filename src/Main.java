import visitor.*;
import visitor.excercise.NoiseReductionFilter;
import visitor.excercise.NormalizeFilter;
import visitor.excercise.ReverbFilter;
import visitor.excercise.WavFile;

public class Main {
   public static void main(String[] args) {
      var wavFile = new WavFile().read("hola.wav");

      wavFile.applyFilter(new NoiseReductionFilter());
      wavFile.applyFilter(new ReverbFilter());
      wavFile.applyFilter(new NormalizeFilter());
   }
}