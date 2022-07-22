package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Henryk Sienkiewicz", "Krzyżacy", 1920));
        books.add(new Book("Adam Mickiewicz", "Pan Tadeusz", 1940));
        books.add(new Book("Henryk Sienkiewicz", "W pustyni i w puszczy", 2000));
        books.add(new Book("Zygmunt Miłoszewski", "Uwikłanie", 2001));
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int medianYearOfPublication = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(2000,medianYearOfPublication);
    }
}
