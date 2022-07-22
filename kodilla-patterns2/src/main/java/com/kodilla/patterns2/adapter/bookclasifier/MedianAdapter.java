package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, Book> bookMap = new HashMap<>();
        for (Book book: bookSet) {
            BookSignature bookSignature = new BookSignature(book.getSignature());
            bookMap.put(bookSignature,book);
        }
        return medianPublicationYear(bookMap);
    }
}
