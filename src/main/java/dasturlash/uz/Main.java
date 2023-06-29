package dasturlash.uz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Phone phone = (Phone) context.getBean("phone");
        phone.sendSms("998915721213", "Welocome to dasturlash.uz");
    }
}