package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        int signature = 1;
        Map<BookSignature, Book> bookMap = new HashMap<>();
        for (Book book: bookSet) {
            String signatureString = String.valueOf(signature);
            BookSignature bookSignature = new BookSignature(signatureString);
            bookMap.put(bookSignature,book);
            signature++;
            
        }
        return medianPublicationYear(bookMap);
    }
}
