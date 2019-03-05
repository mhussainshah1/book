package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * BookApplication 3
 * -----------------
 * A book database class will contain a method to return a book object. We haven't exactly learned how to create a
 * database or read/write to files yet. We're going to use the knowledge we already have to create a class. Our class
 * will simulate a database and return a populated book object. We'll simulate a database by simply using if or switch
 * statements to look up a book based on SKU. Later, we'll create a database using Oracle that also returns a book object.
 * <p>
 * Our book database will contain several book titles and the SKU code to look one up.
 * <p>
 * Your assignment
 * Create a class that contains a method that takes one parameter, the SKU, and returns a corresponding book object.
 * Use If Statements to populate the instance variables of the Book class and return the populated Book class.
 * <p>
 * Your database should contain the following books:
 *
 *
 * <table>
 *
 * <thead>
 * <tr>
 * <th>SKU</th>
 * <th>Title</th>
 * <th>Author</th>
 * <th>Description</th>
 * <th>Price</th>
 * </tr>
 * </thead>
 *
 * <tbody>
 *
 * <tr>
 * <td>Java1001</td>
 * <td>Head First Java</td>
 * <td>Kathy Sierra and Bert Bates</td>
 * <td>Easy to read Java workbook</td>
 * <td>47.50</td>
 * </tr>
 *
 * <tr>
 * <td>Java1002</td>
 * <td>Thinking in Java</td>
 * <td>Bruce Eckel</td>
 * <td>Details about Java under the hood</td>
 * <td>20.00</td>
 * </tr>
 * <tr>
 * <td>Orcl1003</td>
 * <td>OCP: Oracle Certified Professional JavaSE.</td>
 * <td>Jeanne Boyarsky</td>
 * <td>Everything you need to know in one place</td>
 * <td>45.00</td>
 * </tr>
 *
 * <tr>
 * <td>Python1004</td>
 * <tr>Automate the Boring Stuff with Python</td>
 * <tr>Al Sweigart</td>
 * <tr>Fun with Python	</td>
 * <tr>10.50</td>
 * </tr>
 * <tr>
 * <td>Zombie1005</td>
 * <tr>The Maker's Guide to the Zombie Apocalypse</td>
 * <tr>Simon Monk</td>
 * <tr>Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi</td>
 * <tr>16.50</td>
 * </tr>
 * <tr>
 * <td>Rasp1006</td>
 * <td>Raspberry Pi Projects for the Evil Genius</td>
 * <td>Donald Norris</td>
 * <td>A dozen fiendishly fun projects for the Raspberry Pi!</td>
 * <td>14.75</td>
 * </tr>
 *
 * </tbody>
 *
 * <tfoot>
 * <tr>
 * <td>Name</td>
 * <td colspan="2">Address</td>
 * </tr>
 * </tfoot>
 * </table>
 */

public class BookDatabase {

    private Book book;
    private List<Book> books;

    public BookDatabase() {
        books = new ArrayList<>();
        books.add(new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50, true));
        books.add(new Book("Java1002", "Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00, true));
        books.add(new Book("Orcl1003", "OCP: Oracle Certified Professional Java SE", "Jeanne Boyarsky", "Everything you need to know in one place", 45.00, true));
        books.add(new Book("Python1004", "Automate the Boring Stuff with Python", "Al Sweigart", "Fun with Python", 10.50, true));
        books.add(new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse", "Simon Monk", "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi", 16.50, false));
        books.add(new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris", "A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true));
    }

    public BookDatabase(String SKU) {
        this();
        book = getBook(SKU);
//        for (Book book : books) {
//            if (SKU.equalsIgnoreCase(book.getSKU())) {
//                this.book = book;
//            }
//        }
    }

    public Book getBook(String SKU) {
        for (Book book : books) {
            if (SKU.equalsIgnoreCase(book.getSKU())) {
                this.book = book;
                break;
            }
        }
        return book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
