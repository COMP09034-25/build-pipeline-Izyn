package ie.atu.cloudnative.catalogservice.controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ie.atu.cloudnative.catalogservice.config.AtuProperties;
 
    @RestController
    public class HomeController {
        private final AtuProperties atuProperties; // Automatically injected by Spring
        public HomeController(AtuProperties atuProperties) {
            this.atuProperties = atuProperties;
        }
        @GetMapping("/")
        public String getGreeting() {
            return atuProperties.getGreeting(); // Returns the configured greeting
        }
    }