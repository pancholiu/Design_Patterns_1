package chainOfResponsability;

public class WebServer {
    public void handle(HttpRequest request) {
        // Authentication
        var authenticator = new Authenticator();
        authenticator.authenticate(request);

        // Logging
        // Compression
    }
}
