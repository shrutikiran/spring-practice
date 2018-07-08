package apps;

import beans.SimpleBean;
import beans.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name="simple_bean")
    public SimpleBean getSimpleBean() {
        return new SimpleBean();
    }

    @Bean(name="test_bean")
    public TestBean getTestBean() {
        return new TestBean();
    }
}
