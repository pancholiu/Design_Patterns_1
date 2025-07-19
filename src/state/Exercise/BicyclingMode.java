package state.Exercise;

public class BicyclingMode implements MapFunctionalities{
    @Override
    public void getETA() {
        System.out.println("Bicycling is taking X time");
    }

    @Override
    public void getDirection() {
        System.out.println("Follow these directions for bicycling");
    }
}
