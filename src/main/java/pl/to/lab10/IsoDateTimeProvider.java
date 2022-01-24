package pl.to.lab10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class IsoDateTimeProvider implements CurrentDateTimeProvider{
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter pattern = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    String formattedDate = dateTime.truncatedTo(ChronoUnit.SECONDS).format(pattern);

    @Override
    public String currentDateTime() {
        return formattedDate;
    }
}
