import spark.Request;
import spark.Response;

public class HelloWorldController {
    private ApplicationService appService;

    public HelloWorldController(ApplicationService appService) {
        this.appService = appService;
    }

    public HelloWorldResponseResource helloWorld(Request req, Response res) {
        res.status(200);
        res.type("application/json");
        return new HelloWorldResponseResource(appService.getHelloWorldResponse());
    }
}
