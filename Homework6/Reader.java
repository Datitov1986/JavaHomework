package Homework6;

import java.net.SocketTimeoutException;
import java.util.Arrays;

class Reader {
    String surname;
    String name;
    String lastname;
    int readerTicket;
    String faculity;
    String birthdate;
    String telNumber;

    public Reader(String surname, String name, String lastname,
                  int readerTicket, String faculity, String birthdate, String telNumber) {
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.readerTicket = readerTicket;
        this.faculity = faculity;
        this.birthdate = birthdate;
        this.telNumber = telNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public void takeBook(int numberOfBooks) {
        System.out.printf("Читатель %s %s %s взял %s книги", surname, name, lastname, numberOfBooks);
        System.out.println();
    }

    public void takeBook(String typeBook) {
        System.out.printf("Читатель %s %s %s взял книги: %s", surname, name, lastname, typeBook);
        System.out.println();
    }

    public void takeBook(String... books) {
        System.out.printf("Поиск читателя %s %s %s по базе\n", surname, name, lastname);
        for (String book : books) {
            System.out.printf("Читатель %s %s %s взял книги: %s\n", surname, name, lastname, book);
        }


    }

    public void returnBook(int numberOfBooks) {
        System.out.printf("Читатель %s %s %s вернул %s книги", surname, name, lastname, numberOfBooks);
        System.out.println();
    }

    public void returnBook(String typeBook) {
        System.out.printf("Читатель %s %s %s вернул книги: %s", surname, name, lastname, typeBook);
        System.out.println();
    }

    public void returnBook(String... books) {
        System.out.printf("Поиск читателя %s %s %s по базе\n", surname, name, lastname);
        for (String book : books) {
            System.out.printf("Читатель %s %s %s вернул книги: %s\n", surname, name, lastname, book);
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", readerTicket=" + readerTicket +
                ", faculity='" + faculity + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", telNumber='" + telNumber + '\'' +
                '}';
    }
}
