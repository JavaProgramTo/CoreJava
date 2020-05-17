package com.javaprogramto.jackson.datetime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.joda.time.DateTime;

public class Book {

    private int id;
    private String title;
    private int pages;

   // @JsonSerialize(using = CustomDateTimeSerializer.class)
    @JsonDeserialize(using = CustomDateTimeDeserializer.class)
    private DateTime timeReleased;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public DateTime getTimeReleased() {
        return timeReleased;
    }

    public void setTimeReleased(DateTime timeReleased) {
        this.timeReleased = timeReleased;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                ", timeReleased=" + timeReleased +
                '}';
    }
}
