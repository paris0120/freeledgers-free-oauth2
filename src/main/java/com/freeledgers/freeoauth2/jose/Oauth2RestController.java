package com.freeledgers.freeoauth2.jose;

import com.freeledgers.freeoauth2.Version;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Oauth2RestController {
    @GetMapping(value = "/version")
    public Version version(){
        return new Version("free");
    }
}
