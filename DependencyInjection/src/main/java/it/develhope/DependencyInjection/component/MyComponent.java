package it.develhope.DependencyInjection.component;

import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent() {
        this.myComponentName = "This is my component name";
        System.out.println("Using: MyComponent constructor");

    }


    public String getMyComponentName() {
        System.out.println("Using: MyComponent.getMyComponentName");
        return myComponentName;

    }
}
