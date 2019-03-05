package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * BookApplication 4
 * -----------------
 * The BookDB class already contains private member variables and a default constructor. It also contains public getters
 * and setters for each private member variable.
 *
 * While it is possible to create public member variables and avoid the getters/setters please don't do this. A small
 * puppy will run away from home every time you do this.
 *
 * Next, you'll add an overloaded constructor and a method.
 *
 * An overloaded constructor is a constructor that takes one or more parameters. You can create multiple constructors as
 * long as the parameter types and counts are unique. Create a constructor  in the BookDB  class that takes an SKU and
 * populates the private member variables. The constructor by default will return the appropriate BookDB object when it
 * is called. You do not need to include a return statement.
 *
 * Next, create a method in your Book class called getDisplayText(). It takes no parameters. When called it returns a
 * string containing the author, title and description. Do not use System.out.print() in your class. Simply return the
 * string and let the calling class handle the print statements. You can use this method to print your book information
 * to the console or a file or a web page.
 *
 */

/**
 * BookApplication 2
 * -----------------
 * Create a method that returns the pricing for a requested number of books. Five books at $20.00 should return
 * $100, if they are in stock. If they are not in stock, that should be handled appropriately (hint - you decide).
 */

public class BookApp {
    public static void main(String[] args) {
        BookDatabase database = new BookDatabase();

        Scanner keyboard = new Scanner(System.in);
        List<Book> customerBookList = new ArrayList<>();

        Book book;
        String SKU;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter book SKU: ");
            SKU = keyboard.next();
            book = database.getBook(SKU);
            customerBookList.add(book);
        }

//        List<Book> databaseBookList = database.getBooks();
//        String bookNameInput, bookName;
//        for(Book book:databaseBookList){
//        System.out.print("Enter book Name: ");
//            bookName = book.getTitle().toLowerCase();
//            bookNameInput = keyboard.next().toLowerCase();
//            if(bookName.contains(bookNameInput)){
//                customerBookList.add(book);
//            }
//        }
        BookApp app = new BookApp();
        System.out.println("The total price is " + app.getTotal(customerBookList));
    }

    public double getTotal(List<Book> books) {
        double sum = 0.0;
        for (Book book : books) {
            if (book.isInStock()) {
                sum += book.getPrice();
            } else {
                System.out.println(book.getTitle() + " is out of stock");
            }
        }
        return sum;
    }
}