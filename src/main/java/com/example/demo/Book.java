package com.example.demo;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 * BookApplication 1
 * -----------------
 * Create a project in IntelliJ called BookApplication.
 *
 * Create a Book class that allows for Book title, author, description, price and isInStock variables
 *
 * The Book class shall contain private member variables, a default constructor, an overloaded constructor and a method
 * called getDisplayText() which prints the author, title and description.
 *
 *
 * The application shall also contain getters and setters for each private member variable.
 *
 * Create another class called BookApp which contains the main method. In the main method you shall create an instance
 * of a Book and print the Author, Title and Description.
 *
 * Publish your solution to GitHub and submit your GitHub url as the assignment.
 *
 */
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

