package pl.to.lab10;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HumanReadableDateTimeProvider implements CurrentDateTimeProvider{
    LocalDateTime dateTime = LocalDateTime.now();
    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss", new Locale("en"));
    String formattedDate = pattern.format(dateTime);

    @Override
    public String currentDateTime() {
        return formattedDate;
    }
}
