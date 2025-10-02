package visitor.excercise;

public class ReverbFilter implements AudioFilter {
    @Override
    public void apply(FormatSegment formatSegment) { System.out.println("Reverb for format"); }

    @Override
    public void apply(FactSegment factSegment) { System.out.println("Reverb for fact"); }
}
