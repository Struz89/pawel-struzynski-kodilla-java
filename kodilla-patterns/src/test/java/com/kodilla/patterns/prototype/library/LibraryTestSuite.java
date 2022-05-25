package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library number 1");
        library.getBooks().add(new Book("Syzyfowe prace", "Stefan Zeromski", LocalDate.of(2010,10,10)));
        library.getBooks().add(new Book("Pan Tadeusz", "Adam Mickiewicz", LocalDate.of(1990,05,05)));
        library.getBooks().add(new Book("Krzyzacy", "Henryk Sienkiewicz", LocalDate.of(1995,12,01)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //When
        library.getBooks().add(new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", LocalDate.of(1992,07,11)));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assertions.assertEquals(4,library.getBooks().size());
        Assertions.assertEquals(4,clonedLibrary.getBooks().size());
        Assertions.assertEquals(3,deepClonedLibrary.getBooks().size());
    }
}
