package org.example.userservice.feign;

import org.example.passportservice.model.Passport;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "passport-service")
@Component
public interface PassportClient {
    @GetMapping("/passports/{passportId}")
    Passport getPassportById(@PathVariable Long passportId);
}