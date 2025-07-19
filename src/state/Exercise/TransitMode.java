package state.Exercise;

public class TransitMode implements MapFunctionalities {
    @Override
    public void getETA() {
        System.out.println("Transit is taking X time");
    }

    @Override
    public void getDirection() {
        System.out.println("Follow these directions for transit");
    }
}
