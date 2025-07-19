import state.Exercise.*;


public class Main {

   public static void main(String[] args) {
      var directionService = new DirectionService(new DrivingMode());

      directionService.getETA();
      directionService.getDirection();
   }


}