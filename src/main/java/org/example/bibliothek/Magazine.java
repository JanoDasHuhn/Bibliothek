package org.example.bibliothek;

public class Magazine extends  PhysicalItem implements MultipleVolumes{

    int volume;
    String volumeTitle;

    public Magazine(boolean checkedOut, int shelf, int ID, String author, String title,int volume,String volumeTitle, int year, Tag... tags1) {
        super(checkedOut, shelf, ID, author, title, year, tags1);
        setVolume(volume);
        setVolumeTile(volumeTitle);

    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolumeTile(String title) {
        this.volumeTitle = volumeTitle;
    }

    @Override
    public String getVolumeTitle() {
        return volumeTitle;
    }
}
