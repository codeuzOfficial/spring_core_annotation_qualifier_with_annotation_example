package dasturlash.uz;

import org.springframework.stereotype.Component;

@Component("smtpSmsSender")
public class SmtpSmsSender implements SmsSender {
    @Override
    public void send(String phone, String message) {
        System.out.printf("Sending sms using smtp. phone : %s  message: [%s]", phone, message);

    }
}
