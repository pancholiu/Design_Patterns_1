package state.Exercise;

public class DrivingMode implements MapFunctionalities {

    @Override
    public void getETA() {
        System.out.println("Driving is taking X time");
    }

    @Override
    public void getDirection() {
        System.out.println("Follow these directions for driving");
    }
}
