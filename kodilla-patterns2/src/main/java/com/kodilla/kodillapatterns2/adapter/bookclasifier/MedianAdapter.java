package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMediana(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book> bookMap = new HashMap<>();

        bookMap = bookSet.stream()
                .collect(Collectors.toMap(b -> new BookSignature(b.getSignature()),
                        b -> new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book(b.getAuthor(), b.getTitle(), b.getPublicationYear())));
    return medianPublicationYear(bookMap);
    }
}
