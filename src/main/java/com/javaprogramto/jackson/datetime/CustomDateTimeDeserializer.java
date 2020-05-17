package com.javaprogramto.jackson.datetime;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.IOException;

public class CustomDateTimeDeserializer extends StdDeserializer<DateTime> {
    private static final long serialVersionUID = 1L;
    private static DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd");

    public CustomDateTimeDeserializer() {
        this(null);
    }

    public CustomDateTimeDeserializer(Class<DateTime> t) {
        super(t);
    }

    @Override
    public DateTime deserialize(JsonParser parser, DeserializationContext context)
            throws IOException, JsonProcessingException {

        String date = parser.getText();

        return format.parseDateTime(date);

    }
}