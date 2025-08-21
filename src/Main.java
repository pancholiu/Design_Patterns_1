import mediator.ArticlesDialogBox;
import mediator.excercise.SignUpDialogBox;

public class Main {
   public static void main(String[] args) {
      /*
      var dialog = new ArticlesDialogBox();
      dialog.simulateUserInteraction();
       */

      var signDialog = new SignUpDialogBox();
      signDialog.simulateUserInteraction();
   }
}