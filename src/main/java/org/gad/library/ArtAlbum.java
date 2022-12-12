package org.gad.library;

public class ArtAlbum extends Book {
    private String paperQuality;

    public ArtAlbum(String name, String author, int numberOfPages, String paperQuality) {
        super(name, author, numberOfPages);
        this.paperQuality = paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }

    @Override
    public String toString() {
        return super.toString() +
                " paperQuality='" + paperQuality + '\'' +
                '}';
    }
}
