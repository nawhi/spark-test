import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spark.Request;
import spark.Response;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HelloWorldControllerShould {
    private Response res;
    private Request req;
    private HelloWorldController controller;
    private ApplicationService appService;

    /*
    2. content type application/json
    3. convert content from internal format to JSON
     */

    @BeforeEach
    void setUp() {
        res = mock(Response.class);
        req = mock(Request.class);
        appService = mock(ApplicationService.class);
        controller = new HelloWorldController(appService);
    }

    @Test
    public void set_status_200_for_hello_world_request() {
        controller.helloWorld(req, res);
        verify(res).status(200);
    }

    @Test
    public void set_json_content_for_hello_world_request() {
        controller.helloWorld(req, res);
        verify(res).type("application/json");
    }

    @Test
    public void ask_service_for_hello_world_response() {
        controller.helloWorld(req, res);
        verify(appService).getHelloWorldResponse();
    }
}
