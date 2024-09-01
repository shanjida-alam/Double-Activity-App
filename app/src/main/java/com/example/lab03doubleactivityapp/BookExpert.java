package com.example.lab03doubleactivityapp;

import java.util.ArrayList;
import java.util.List;

public class BookExpert {
    public List<String> getBook(String Category) {
        List<String> Books = new ArrayList<>();
        if (Category.equals("Fiction")) {
            Books.add("List of Fiction Books:\n");
            Books.add("1. The Alchemist");
            Books.add("2. The Kite Runner");
            Books.add("3. Harry Potter");
        }
        else if (Category.equals("Non-fiction")) {
            Books.add("List of Non-Fiction Books:\n");
            Books.add("1.In Cold Blood");
            Books.add("2.Into Thin Air");
            Books.add("3.The Diary of a Young Girl");
        }
        else if (Category.equals("Science Fiction")) {
            Books.add("List of Science Fiction Books:\n");
            Books.add("1. The Martian");
            Books.add("2. Brave New World");
            Books.add("3. Fahrenheit 451");
        }
        return Books;
    }
}