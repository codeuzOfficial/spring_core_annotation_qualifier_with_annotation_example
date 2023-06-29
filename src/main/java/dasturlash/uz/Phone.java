package dasturlash.uz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String model = "Nokia";
    @Autowired
    @Qualifier("simpleSmsSender")
    private SmsSender smsSender;

    public void sendSms(String phone, String message) {
        smsSender.send(phone,message);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", smsSender=" + smsSender +
                '}';
    }
}
