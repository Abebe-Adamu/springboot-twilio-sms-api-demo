package controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import model.SmsRequest;
import service.SmsService;

@RestController
@RequestMapping("/api/sms")
public class SMSController {
	  private final SmsService smsService;

	    public SMSController(SmsService smsService) {
	        this.smsService = smsService;
	    }

	    @PostMapping("/send")
	    public ResponseEntity<String> sendSms(@RequestBody SmsRequest smsRequest) {
	        smsService.sendSms(smsRequest.getTo(), smsRequest.getMessage());
	        return ResponseEntity.ok("SMS sent to " + smsRequest.getTo());
	    }
}
