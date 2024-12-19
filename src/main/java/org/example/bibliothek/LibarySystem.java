package org.example.bibliothek;

import org.example.Main;
import org.example.bibliothek.ItemType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class LibarySystem {
    public ArrayList<Item> items;
    public HashMap<PhysicalItem, Integer> physicalIDs;
    public LibarySystem(){
        items = new ArrayList<>();
        physicalIDs = new HashMap<>();
    }

    public void createItem(ItemType ItemType){
        Random random = new Random();

        //erstellt Item und befüllt es random
        switch (ItemType){
            case Book:
                boolean checkedOut  = random.nextBoolean();
                //Book book = new Book(checkedOut, random.nextInt(50), createID(),getRandomAuthor(),getRandomTitle(),getRandomYear(),);
                break;
            case Movie:
                break;
            case eBook:
                break;
            case Magazine:
                break;
            case eMagazine:
                break;
            case Newspaper:
                break;
            case eNewspaper:
                break;

        }
    }


    private String getRandomAuthor(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Rainer");
        names.add("Test");
        names.add("Blu");
        names.add("Luan");
        Random random = new Random();
        return names.get(random.nextInt(names.size()));

    }
    private String getRandomTitle(){
        ArrayList<String> titles = new ArrayList<>();
        titles.add("Drachencronik");
        titles.add("Java ist eine Insel");
        titles.add("Cyberpunk 2077");
        titles.add("Test2");
        Random random = new Random();
        return titles.get(random.nextInt(titles.size()));

    }
    private int getRandomYear(){
        return new Random().nextInt(1950,2024);
    }
    private int createID(){
        return physicalIDs.size() + 1;
    }

    private List<String> get(){

    }

}
