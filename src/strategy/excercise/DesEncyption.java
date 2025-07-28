package strategy.excercise;

public class DesEncyption implements Encryption {
    @Override
    public void apply(String message) {
        System.out.println("Encrypting message using DES");
    }
}
