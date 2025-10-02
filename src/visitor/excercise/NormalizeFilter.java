package visitor.excercise;

public class NormalizeFilter implements AudioFilter {

    @Override
    public void apply(FormatSegment formatSegment) { System.out.println("Normalize on format"); }

    @Override
    public void apply(FactSegment factSegment) { System.out.println("Normalize on fact"); }
}
