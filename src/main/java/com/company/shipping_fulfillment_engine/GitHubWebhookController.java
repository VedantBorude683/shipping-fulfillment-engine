package com.company.shipping_fulfillment_engine;

import org.springframework.web.bind.annotation.*;

@RestController
public class GitHubWebhookController {

    // This is the absolute root path.
    // If your webhook URL ends in /github, change this to @PostMapping("/github")
    @PostMapping("/github")
    public String handleWebhook(@RequestBody String payload) {
        System.out.println("✅ Received GitHub payload!");
        return "OK";
    }
}