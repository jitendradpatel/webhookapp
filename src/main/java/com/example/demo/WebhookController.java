package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/webhook")
public class WebhookController {

    private static final Logger logger = Logger.getLogger("webhook");

    @PostMapping // http://localhost:8080/api/webhook
    public ResponseEntity<String> print(@RequestBody String requestBody) {
        logger.info("********Webhook call received!");
        System.out.println((new Date()) + ": ###### Webhook #####" + requestBody);
        return new ResponseEntity<String >(requestBody, HttpStatus.OK);
    }
}

