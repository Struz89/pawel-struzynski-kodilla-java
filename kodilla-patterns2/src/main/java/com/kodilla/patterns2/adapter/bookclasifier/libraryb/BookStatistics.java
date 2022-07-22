package com.kodilla.patterns2.adapter.bookclasifier.libraryb;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, Book> books);
    int medianPublicationYear(Map<BookSignature, Book> books);
}
