package com.fatboyindustrial.gsonjavatime;

import java.time.format.DateTimeFormatter;

public abstract class FormatableConverter {

    private DateTimeFormatter formatter;

    public FormatableConverter() {
        this.formatter = getDefaultFormatter();
    }

    public FormatableConverter(DateTimeFormatter formatter) {
        super();
        this.formatter = formatter;
    }

    public abstract DateTimeFormatter getDefaultFormatter();

    public DateTimeFormatter getFormatter() {
        return formatter;
    }

}
