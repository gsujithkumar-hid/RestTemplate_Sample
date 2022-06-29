package com.example.microservices;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/greet")
    public ResponseEntity helloworld(){

        log.info("Entered into Microservice-1 from microservice-2");
        return new ResponseEntity<String>("Hello from microservice -1 ", HttpStatus.OK );
    }



}
