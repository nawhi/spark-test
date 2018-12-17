public class HelloWorldResponseResource {
    public String message;

    public HelloWorldResponseResource(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
