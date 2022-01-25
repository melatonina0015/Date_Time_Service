package pl.to.lab10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CurrentDateTimeService {

    @Autowired
    @Qualifier("isoDateTime")
    CurrentDateTimeProvider currentDateTimeProvider;

    public String display(){
        return "Current date is " + currentDateTimeProvider.currentDateTime();
    }

}
