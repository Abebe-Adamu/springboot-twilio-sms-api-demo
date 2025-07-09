package config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

import jakarta.annotation.PostConstruct;
import lombok.Data;
@Data
@Configuration
@ConfigurationProperties(prefix = "twilio")
public class TwilioConfig {
	private String accountSid;
    private String authToken;
    private String phoneNumber;

    @PostConstruct
    public void init() {
        Twilio.init(accountSid, authToken);
    }
}
