package com.javaprogramto.jackson.datetime;


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.joda.time.DateTime;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class CustomDateTimeSerializer extends StdSerializer<DateTime> {
    private static final long serialVersionUID = 1L;
    private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    public CustomDateTimeSerializer() {
        this(null);
    }

    public CustomDateTimeSerializer(Class<DateTime> t) {
        super(t);
    }

    @Override
    public void serialize(DateTime value,
                          JsonGenerator generator, SerializerProvider arg2) throws IOException {
        generator.writeString(formatter.format(value));
    }
}