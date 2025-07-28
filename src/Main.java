import strategy.excercise.AesEncryption;
import strategy.excercise.ChatClient;
import strategy.excercise.DesEncyption;
import template.TransferMoneyTask;

public class Main {
   public static void main(String[] args) {
      var task = new TransferMoneyTask();
      task.execute();
   }
}
