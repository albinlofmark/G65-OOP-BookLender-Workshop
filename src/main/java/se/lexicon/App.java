package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book

        Person person1 = new Person("Albin", "Löfmark");
        Person person2 = new Person("Jacob", "Svensson");

        System.out.println(person1.getPersonInformation());
        System.out.println(person2.getPersonInformation());

        Book höns = new Book("Bok om 15 höns", "Gösta Hansson");
        Book yoggi = new Book("Bok om yoggi", "Anders Ragnarok", person2);

        person2.returnBook(höns);
        person1.returnBook(höns);

        person2.returnBook(yoggi);
        person1.returnBook(yoggi);

        System.out.println(höns.getBookInformation());
        person1.loanBook(höns);

        System.out.println(höns.getBookInformation());
        person1.returnBook(höns);

        System.out.println(yoggi.getBookInformation());
        person2.loanBook(yoggi);

        System.out.println(yoggi.getBookInformation());
        person2.returnBook(yoggi);
    }

}
