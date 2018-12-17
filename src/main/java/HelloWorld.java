import static spark.Spark.get;

public class HelloWorld {

    public static void main(String[] args) {
        get("/hello-world", (req, res) -> {
            ApplicationService appService = new ApplicationService();
            HelloWorldController controller = new HelloWorldController(appService);
            return controller.helloWorld(req, res);
        });
    }
}
