package visitor.excercise;

public class NoiseReductionFilter implements AudioFilter {
    @Override
    public void apply(FormatSegment formatSegment) { System.out.println("Noise reduction on format"); }

    @Override
    public void apply(FactSegment factSegment) { System.out.println("Noise reduction on fact"); }
}
