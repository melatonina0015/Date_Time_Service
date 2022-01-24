package pl.to.lab10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "humanDateTime")
    public CurrentDateTimeProvider getHumanDateTime() {
        return new HumanReadableDateTimeProvider();
    }

    @Bean(name = "isoDateTime")
    public CurrentDateTimeProvider getIsoDateTime() {
        return new IsoDateTimeProvider();
    }

    @Bean()
    public CurrentDateTimeService getDateTimeService() {
        return new CurrentDateTimeService();
    }
}
