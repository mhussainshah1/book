package com.example.demo;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NonNull
    private String SKU;

    @NonNull
    @Size(min = 4)
    private String title;

    @NonNull
    @Size(min = 3)
    private String author;

    @NonNull
    @Size(min = 10)
    private String description;

    @NonNull
    @Min(0)
    private double price;

    @NonNull
    private boolean isInStock;

    public Book() {

    }

    public Book(String SKU, @Size(min = 4) String title, @Size(min = 3) String author, @Size(min = 10) String description, double price, boolean isInStock) {
        this.SKU = SKU;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    @Override
    public String toString() {
        return "Author: " + author +"\nTitle: " +title + "\nDescription: " + description ;
    }
}

