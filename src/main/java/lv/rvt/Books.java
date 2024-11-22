package lv.rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Books{

    private String title;
    private int publicationYear;
    private int pages;

    public Books(String title, int publicationYear, int pages) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {

        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }

}