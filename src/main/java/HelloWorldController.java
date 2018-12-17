import spark.Request;
import spark.Response;

public class HelloWorldController {
    public String helloWorld(Request req, Response res) {
        res.status(200);
        res.type("application/json");
        return null;
    }
}
