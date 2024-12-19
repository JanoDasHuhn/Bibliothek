package org.example.bibliothek;

public abstract class VirtualItem extends Item{
    private String link;
    public VirtualItem(String author, String title, int year,String link, Tag... tags1) {
        super(author, title, year, tags1);
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
