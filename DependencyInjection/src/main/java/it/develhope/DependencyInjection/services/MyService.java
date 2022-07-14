package it.develhope.DependencyInjection.services;

import it.develhope.DependencyInjection.component.MyComponent;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class MyService {


    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
        System.out.println("Using: MyService Constructor");
    }

    public String getName() {
        System.out.println("Using: MyService.getName");
        ;
        return myComponent.getMyComponentName();
    }

}
