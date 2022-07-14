package it.develhope.DependencyInjection.controller;

import it.develhope.DependencyInjection.services.MyService;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Data
@RestController
@NoArgsConstructor
public class MyController {

    private MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
        System.out.println("Using: MyController Constructor");
    }

    @GetMapping("/getName")
    public String getnameController() {
        return myService.getName();
    }

    @GetMapping
    public String defaultMessage() {
        System.out.println("Using: MyService.welcome");
        return "Hello user";
    }


}
