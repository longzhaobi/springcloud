import com.spring.RabbitmqHelloApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.spring.rabbit.Sender;

/**
 * @Author： 龙召碧
 * @Date: Created in 2017-9-23 21:17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RabbitmqHelloApplication.class)
public class HelloApplicationTests {
    @Autowired(required = false)
    private Sender sender;

    @Test
    public void hello() throws Exception {
        sender.send();
    }
}
