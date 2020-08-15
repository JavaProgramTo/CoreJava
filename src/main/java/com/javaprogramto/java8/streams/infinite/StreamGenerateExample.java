package com.javaprogramto.java8.streams.infinite;

import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGenerateExample {

    public static void main(String[] args) {

        // Generates the UUID
        Supplier<UUID> randomUUIDSupplier = () -> UUID.randomUUID();

        List<UUID> uuidList = Stream.generate(randomUUIDSupplier).limit(10).collect(Collectors.toList());

        System.out.println("10 random UUID list : "+uuidList);

    }
}
