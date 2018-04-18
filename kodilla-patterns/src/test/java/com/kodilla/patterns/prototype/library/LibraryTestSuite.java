package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Numbered books Library");
        IntStream.iterate(1, n -> n +1)
                .limit(3)
                .forEach(n -> library.getBooks().add(new Book("Book no. " + n, "Author " + n, LocalDate.of(1990 + n, 01, 01))));

        Library clonedLibrary = null;

        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Numbered books Library no. 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;

        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Numbered books Library no. 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //When
        library.getBooks().add(new Book("Added book", "Added author", LocalDate.of(2018, 04, 18)));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assert.assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}
