package apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.TestBean;

public class Practice1 {

    public static void main(String a[]){
        String confFile = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
        TestBean sft = (TestBean) context.getBean("springTest");
        sft.testMe();

        TestBean sft2 = (TestBean) context.getBean("springTest");
        if (sft == sft2) {
            System.out.println("Yes, singleton");
        } else {
            System.out.println("No, not a singleton");
        }
    }
}
