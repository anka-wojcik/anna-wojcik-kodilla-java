package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //When
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Sapkowski Andrzej", "Krew elfów", 1994, "1234"));
        bookSet.add(new Book("Sapkowski Andrzej", "Ostatnie życzenie", 1995, "1235"));
        bookSet.add(new Book("Sapkowski Andrzej", "Pani Jeziora", 1999, "1236"));
        bookSet.add(new Book("Sapkowski Andrzej", "Żmija", 2009, "1237"));
        bookSet.add(new Book("Sapkowski Andrzej", "Wiedźmin", 1990, "1238"));

        MedianAdapter medianAdapter = new MedianAdapter();
        //Then
        int medianPublicationYear = medianAdapter.publicationYearMediana(bookSet);
        //Assert
        System.out.println(medianPublicationYear);
        assertEquals(medianPublicationYear, 1995, 0);
    }
}
