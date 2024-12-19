package org.example.bibliothek;

public abstract class PhysicalItem extends Item{
    private int ID;
    private int shelf;
    private boolean checkedOut;


    public PhysicalItem(boolean checkedOut,int shelf,int ID,String author, String title, int year, Tag... tags1) {
        super(author, title, year, tags1);
        this.checkedOut = checkedOut;
        this.ID = ID;
        this.shelf = shelf;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public int getShelf() {
        return shelf;
    }

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
