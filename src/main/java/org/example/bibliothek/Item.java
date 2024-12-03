package org.example.bibliothek;

import java.util.ArrayList;
import java.util.Collections;

public class Item {
    public String author,title;
    public int year;
    public ArrayList<Tag> tags;

    public Item(String author,String title,int year,Tag... tags1){
        this.author = author;
        this.title = title;
        this.year = year;
        tags = new ArrayList<>();
        Collections.addAll(tags, tags1);
    }

}
