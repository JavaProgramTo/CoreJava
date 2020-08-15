package com.javaprogramto.java8.streams.infinite;

import java.io.Serializable;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomObjectsStreamGenerateExample {

    public static void main(String[] args) {

        List<Book> uuidList = Stream.generate(Book::create)
                                                            .limit(10)
                                                            .collect(Collectors.toList());

        System.out.println("10 random UUID list : "+uuidList);

    }
}

class Book implements Serializable {

    private int id;
    private String title;
    private double price;

    public Book(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public static Book create(){
        int id = new Random().nextInt(10);
        return new Book(id, "name "+id, id * 2.2);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
