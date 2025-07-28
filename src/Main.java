import strategy.excercise.AesEncryption;
import strategy.excercise.ChatClient;
import strategy.excercise.DesEncyption;

public class Main {

   public static void main(String[] args) {
        var chatClient = new ChatClient();

        chatClient.send("The message", new DesEncyption());
   }
}
