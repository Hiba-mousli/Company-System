package org.closure.systemcompany.controller;

import com.google.firebase.messaging.FirebaseMessagingException;

import org.closure.systemcompany.Services.FCMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = {"/api/v1/FCM"})
public class FirebaseController {

    @Autowired
    FCMService fcmService;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String sendNotification(@RequestParam String title, @RequestParam String message,
            @RequestParam String token) {
        try {
            return fcmService.sendMessage(title, message, token);
        } catch (FirebaseMessagingException e) {
            return e.getMessage();
        }
    }
    
}
