package com.in28minutes.springboot.myfirstwebapp.todo;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String author;
    @Size(min=10, message="Enter at least 10 characters")
    private String description;
    private LocalDate targetDate;

    private Boolean done;

    public Todo(int id, String author, String description, LocalDate targetDate, Boolean done) {
        this.id = id;
        this.author = author;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + description + '\'' +
                ", todoDate=" + targetDate +
                ", completed=" + done +
                '}';
    }
}
