package org.example.bibliothek;

public class Book extends PhysicalItem{

    public Book(boolean checkedOut, int shelf, int ID, String author, String title, int year, Tag... tags1) {
        super(checkedOut, shelf, ID, author, title, year, tags1);
    }
}
