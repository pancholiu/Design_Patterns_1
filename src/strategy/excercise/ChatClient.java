package strategy.excercise;
import strategy.excercise.Encryption;

public class ChatClient {
    public void send(String message, Encryption encryptionAlgorithm) {
        encryptionAlgorithm.apply(message);

    }
}
