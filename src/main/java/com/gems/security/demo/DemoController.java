package com.gems.security.demo;

import com.gems.security.config.JWTService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    private final JWTService jwtService;

    public DemoController(JWTService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping
    public ResponseEntity<String> sayHello(
            @RequestHeader(HttpHeaders.AUTHORIZATION) String authToken
    ) {
//        var a = jwtService.extractUsername(authToken);
//        System.out.println(a);
        // TODO: I have problems with this. Not sure how to correctly extract the authToken

        return ResponseEntity.ok("hello from secured endpoint");
    }
}
