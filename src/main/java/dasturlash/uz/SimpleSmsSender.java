package dasturlash.uz;

import org.springframework.stereotype.Component;

@Component("simpleSmsSender")
public class SimpleSmsSender implements SmsSender {

    @Override
    public void send(String phone, String message) {
        System.out.printf("Sending simple sms. phone : %s  message: [%s]", phone, message);
    }
}
