package com.javaprogramto.java8.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8SortMultipleFields {

    public static void main(String[] args) {


        Book book1 = new Book(105, "Title 5", "Author2", 10);
        Book book2 = new Book(103, "Title 3", "Author1", 15);
        Book book3 = new Book(104, "Title 4", "Author2", 10);
        Book book4 = new Book(101, "Title 1", "Author1", 20);
        Book book5 = new Book(102, "Title 2", "Author2", 15);

        List<Book> unsortredBooksList = Arrays.asList(book1, book2, book3, book4, book5);

        Comparator<Book> idBookComparator = Comparator.comparing(Book::getId);

        Comparator<Book> titleBookComparator = Comparator.comparing(Book::getTitle);

        Comparator<Book> multipleFieldsComparator = idBookComparator.thenComparing(titleBookComparator);

        System.out.println("Unsorted Books List : ");

        for (Book book : unsortredBooksList) {
            System.out.println(book);
        }

        List<Book> sortedList1 = unsortredBooksList.stream().sorted(multipleFieldsComparator).collect(Collectors.toList());

        System.out.println("After sorting books list : ");


        for (Book book : sortedList1) {
            System.out.println(book);
        }

        Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);
        Comparator<Book> priceComparator = Comparator.comparing(Book::getPrice);

        Comparator<Book> multipleFieldsComparator2 = authorComparator.thenComparing(priceComparator);

        List<Book> unsortredBooksList2 = Arrays.asList(book1, book2, book3, book4, book5);

        System.out.println("Unsorted Books List 2 : ");
        for (Book book : unsortredBooksList2) {
            System.out.println(book);
        }

        List<Book> sortedList2 = unsortredBooksList2.stream().sorted(multipleFieldsComparator2).collect(Collectors.toList());

        System.out.println("After sorting books list 2: ");


        for (Book book : sortedList2) {
            System.out.println(book);
        }
    }
}

