import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationServiceShould {

    @Test
    public void return_correct_string_for_hello_world_response() {
        assertEquals("Hello World", new ApplicationService().getHelloWorldResponse());
    }
}
