package org.gad.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> libraryCollection;

    public Library() {
        this.libraryCollection = new ArrayList<Book>();
    }

    public Library(ArrayList<Book> libraryCollection) {
        this.libraryCollection = libraryCollection;
    }

    public ArrayList<Book> getLibraryCollection() {
        return libraryCollection;
    }

    public void setLibraryCollection(ArrayList<Book> libraryCollection) {
        this.libraryCollection = libraryCollection;
    }

    public void addBookToLibrary(Book book) {
        this.libraryCollection.add(book);
        System.out.println("Book has been added to the library: " + book);
    }

    public Book getBookByNameAndAuthor(String name, String author) {
        int index = 0;
        for (int i = 0; i < libraryCollection.size(); i++) {
            if (libraryCollection.get(i).getName().equals(name) && libraryCollection.get(i).getAuthor().equals(author)) {
                index = i;
            }
        }
        return libraryCollection.get(index);
    }

    public void removeBookFromLibrary(Book book) {
        if (libraryCollection.get(book.getId()) != null) {
            libraryCollection.remove(book.getId());
            System.out.println("Book " + book.getName() + " by " + book.getAuthor() + " has been removed from library.");
        }
    }

    public void listBooks() {
        libraryCollection.forEach((book) -> System.out.println(book));
    }

    public void listBooksByAuthor(String author) {
        for (int i = 0; i < libraryCollection.size(); i++) {
            if (libraryCollection.get(i).getAuthor().equalsIgnoreCase(author)) {
                System.out.println(libraryCollection.get(i));
            }
        }

    }
}
