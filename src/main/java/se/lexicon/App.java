package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book

        Person albin = new Person("Albin", "Löfmark");
        Person jacob = new Person("Jacob", "Svensson");

        System.out.println(albin.getPersonInformation());
        System.out.println(jacob.getPersonInformation());

        Book hans = new Book("Hans", "Anders Hansson", albin);

        System.out.println(hans.getBookInformation());



    }

}
