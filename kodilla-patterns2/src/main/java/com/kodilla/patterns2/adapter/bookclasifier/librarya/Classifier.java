package com.kodilla.patterns2.adapter.bookclasifier.librarya;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
