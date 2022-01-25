package pl.to.lab10;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        CurrentDateTimeService dateTimeService = context.getBean(CurrentDateTimeService.class);
        System.out.println(dateTimeService.display());
    }
}
