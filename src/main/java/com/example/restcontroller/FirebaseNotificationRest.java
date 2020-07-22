package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.PnsRequest;
import com.example.service.FCMService;

@RestController
public class FirebaseNotificationRest {
	String registrationToken = "BGaAfH1NK2cxF3T7b4FnKExokyAG7t6WMBtAZsi_tQ3m3Y00vHxu58yNvUEeBh9mW-EAAt-603xBhbxNZlxPu_I";
	@Autowired
    private FCMService fcmService;

    @PostMapping("/notification")
    public String sendSampleNotification(@RequestBody PnsRequest pnsRequest) {
        return fcmService.pushNotification(pnsRequest);
    }
}
