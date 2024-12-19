package org.example.bibliothek;

public class eMagazine extends VirtualItem implements MultipleVolumes{

    private int volume;
    private String volumeTitle;
    public eMagazine(String volumeTitle,int volume,String author, String title, int year, String link, Tag... tags1) {
        super(author, title, year, link, tags1);
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
