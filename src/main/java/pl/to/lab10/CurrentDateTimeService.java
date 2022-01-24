package pl.to.lab10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("currentDateTimeService")
public class CurrentDateTimeService {

    @Autowired
    @Qualifier("isoDateTime")
    CurrentDateTimeProvider currentDateTimeProvider;

    public void display(){
        System.out.println("Current date is " + currentDateTimeProvider.currentDateTime());
    }

}
