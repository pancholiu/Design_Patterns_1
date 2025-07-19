package state.Exercise;

public class DirectionService {
    private MapFunctionalities travelFunctionalities;

    public DirectionService(MapFunctionalities travelFunctionalities) {
        this.travelFunctionalities = travelFunctionalities;
    }

    public void getETA() {
        travelFunctionalities.getETA();
    }

    public void  getDirection() {
        travelFunctionalities.getDirection();
    }
}
