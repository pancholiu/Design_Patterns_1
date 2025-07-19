package state.Exercise;

public class WalkingMode implements MapFunctionalities{
    @Override
    public void getETA() {
        System.out.println("Walking is taking X time");
    }

    @Override
    public void getDirection() {
        System.out.println("Follow these directions for walking");
    }
}
