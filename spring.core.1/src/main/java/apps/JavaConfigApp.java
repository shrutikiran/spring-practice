package apps;

import beans.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.SimpleBean;

public class JavaConfigApp {
    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        SimpleBean sb = (SimpleBean) context.getBean("simple_bean");
        sb.testMe();

        TestBean tb = (TestBean) context.getBean("test_bean");
        tb.testMe();
    }
}
