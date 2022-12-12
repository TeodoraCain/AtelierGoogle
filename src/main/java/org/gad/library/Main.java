package org.gad.library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void addBook(Library library) {
        String nameOfBook, author;
        String typeOfBook, typeOfNovel, paperQuality;
        int numberOfPages;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(
                    "You are trying to add a book to the library.\n" +
                            "Is this book a novel, an art album or another?\n\n" +
                            "Please make your selection:\n" +
                            " n : for novel \n" +
                            " a : for art album \n" +
                            " o : for others.\n\n" +
                            "Your choice: ");
            typeOfBook = scanner.next();

        } while (!typeOfBook.equalsIgnoreCase("n") &&
                !typeOfBook.equalsIgnoreCase("a") &&
                !typeOfBook.equalsIgnoreCase("o"));

        System.out.println(
                "You are trying to add a book to the library.\n" +
                        "Please insert the following details and press Enter.\n\n" +
                        "Name of book: ");
        nameOfBook = scanner.next();

        System.out.println("Author:");
        author = scanner.next();

        try {
            System.out.println("Number of pages:");
            numberOfPages = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong number! Number of pages set to 0.");
            numberOfPages = 0;
        }


        if (typeOfBook.equalsIgnoreCase("n")) {
            System.out.println("Type of novel : \n [Historical, Picaresque, Sentimental, Gothic, " +
                    "Psychological, Novel of manners, Epistolary, Pastoral, Antinovel, Cult, " +
                    "Detective, Mystery, Thriller, Western, Fantasy, Proletarian]");
            typeOfNovel = scanner.next();

            library.addBookToLibrary(new Novel(nameOfBook, author, numberOfPages, typeOfNovel.toLowerCase()));

        } else if (typeOfBook.equalsIgnoreCase("a")) {
            System.out.println("Paper quality : \n [Matte, Bright White, Glossy, Coated ]");
            paperQuality = scanner.next();

            library.addBookToLibrary(new ArtAlbum(nameOfBook, author, numberOfPages, paperQuality.toLowerCase()));
        } else if (typeOfBook.equalsIgnoreCase("o")) {
            library.addBookToLibrary(new Book(nameOfBook, author, numberOfPages));
        }

    }

    public static void removeBookFromLibrary(Library library) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "You are trying to delete a book from the library.\n" +
                        "What's the name of the book?");
        String bookName = scanner.next();
        System.out.println("What's the name of the author?");
        String author = scanner.next();


        Book book = library.getBookByNameAndAuthor(bookName, author);
        library.removeBookFromLibrary(book);
    }

    public static void listBooksFromLibrary(Library library) {
        Scanner scanner = new Scanner(System.in);
        String listOption;
        do {
            System.out.println(
                    "You are trying to list books to the library.\n" +
                            "Choose one of the following options: \n\n" +
                            " 1 : list all books from the library \n" +
                            " 2 : list all books from an author \n" +
                            "Your choice: ");
            listOption = scanner.next();

        } while (!listOption.equalsIgnoreCase("1") &&
                !listOption.equalsIgnoreCase("2") &&
                !listOption.equalsIgnoreCase("3"));

        if (listOption.equalsIgnoreCase("1")) {
            library.listBooks();
        } else if (listOption.equalsIgnoreCase("2")) {
            System.out.println("Author: ");
            String author = scanner.next();
            library.listBooksByAuthor(author);
        }

    }

    public static void main(String[] args) {
        int command;
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        do {
            System.out.println("Main Menu. Choose an action.\n\n Press: " +
                    "\n 1 : to add a book to the library" +
                    "\n 2 : to delete a book from the library" +
                    "\n 3 : to list books from the library" +
                    "\n 0 : to exit\n" +
                    "\n Your choice: ");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    addBook(library);
                    break;
                case 2:
                    removeBookFromLibrary(library);
                    break;
                case 3:
                    listBooksFromLibrary(library);
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        } while (command != 0);
        scanner.close();

    }
}
