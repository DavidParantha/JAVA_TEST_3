package dev.underthis.Abstraction.test3;
     class Book {
    String isbn;
    String title;
    boolean isAvailable;
    public Book(String isbn, String title, boolean isAvailable) {
        this.isbn = isbn;
        this.title = title;
        this.isAvailable = isAvailable;
    }
    class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}
    }
}

