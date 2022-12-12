package org.gad.library;

import java.util.ArrayList;

public class Novel extends Book {
    private String type;

    public Novel(String name, String author, int numberOfPages, String type) {
        super(name, author, numberOfPages);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() +
                " type='" + type + '\'' +
                '}';
    }
}
