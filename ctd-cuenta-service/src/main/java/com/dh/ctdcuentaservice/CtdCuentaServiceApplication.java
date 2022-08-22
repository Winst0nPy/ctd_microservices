package com.dh.ctdcuentaservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class CtdCuentaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CtdCuentaServiceApplication.class, args);
    }

}

@RestController
class AccountService{

    @Value("${message}")
    private String message;

    @Value("${global-message}")
    private String globalMessage;

    @RequestMapping(method = RequestMethod.GET, path="service")
    public Map<String, String> message(){
        Map<String, String> response = new HashMap<>();

        response.put("message", message);
        response.put("global-message", globalMessage);

        return response;
    }



}
