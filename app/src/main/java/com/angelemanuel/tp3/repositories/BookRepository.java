package com.angelemanuel.tp3.repositories;

import com.angelemanuel.tp3.R;
import com.angelemanuel.tp3.models.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class BookRepository {
    private final ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book(
                "Cien años de soledad",
                "Gabriel García Márquez",
                682,
                1967,
                new ArrayList<>(Arrays.asList("Realismo mágico", "Ficción", "Novela")),
                "La saga de la familia Buendía en el pueblo ficticio de Macondo.",
                R.drawable.cien_an_os_de_soledad
        ));

        books.add(new Book(
                "1984",
                "George Orwell",
                623,
                1949,
                new ArrayList<>(Arrays.asList("Distopía", "Ciencia ficción", "Política")),
                "Una sociedad totalitaria controlada por el Gran Hermano.",
                R.drawable.nineteen_eighty_four
        ));

        books.add(new Book(
                "El Quijote",
                "Miguel de Cervantes",
                729,
                1605,
                new ArrayList<>(Arrays.asList("Novela", "Aventura", "Clásico")),
                "Las aventuras de un hidalgo que enloquece leyendo libros de caballerías.",
                R.drawable.el_quijote
        ));

//        books.add(new Book(
//                "Crimen y castigo",
//                "Fiódor Dostoyevski",
//                238,
//                1866,
//                new ArrayList<>(Arrays.asList("Psicológico", "Filosófico", "Novela")),
//                "Un estudiante comete un asesinato y lucha con su conciencia."
//        ));
//
//        books.add(new Book(
//                "Harry Potter y la piedra filosofal",
//                "J.K. Rowling",
//                733,
//                1997,
//                new ArrayList<>(Arrays.asList("Fantasía", "Aventura", "Juvenil")),
//                "Un niño descubre que es mago y comienza su educación en Hogwarts."
//        ));
//
//        books.add(new Book(
//                "Orgullo y prejuicio",
//                "Jane Austen",
//                1023,
//                1813,
//                new ArrayList<>(Arrays.asList("Romance", "Clásico", "Novela")),
//                "La historia de Elizabeth Bennet y el señor Darcy en la Inglaterra rural."
//        ));
//
//        books.add(new Book(
//                "El señor de los anillos",
//                "J.R.R. Tolkien",
//                189,
//                1954,
//                new ArrayList<>(Arrays.asList("Fantasía", "Aventura", "Épico")),
//                "La búsqueda para destruir el Anillo Único en la Tierra Media."
//        ));
//
//        books.add(new Book(
//                "Matar a un ruiseñor",
//                "Harper Lee",
//                217,
//                1960,
//                new ArrayList<>(Arrays.asList("Drama", "Legal", "Coming-of-age")),
//                "Un abogado defiende a un hombre negro falsamente acusado en el sur racista."
//        ));
//
//        books.add(new Book(
//                "Donde habitan los ángeles",
//                "Claudia Celis",
//                212,
//                2005,
//                new ArrayList<>(Arrays.asList("Juvenil", "Drama", "Familia")),
//                "La vida de Panchito, un niño que enfrenta dificultades familiares."
//        ));
//
//        books.add(new Book(
//                "Fahrenheit 451",
//                "Ray Bradbury",
//                415,
//                1953,
//                new ArrayList<>(Arrays.asList("Distopía", "Ciencia ficción", "Filosófico")),
//                "En un futuro donde los libros están prohibidos y los bomberos los queman."
//        ));
//
//        books.add(new Book(
//                "El alquimista",
//                "Paulo Coelho",
//                374,
//                1988,
//                new ArrayList<>(Arrays.asList("Filosófico", "Aventura", "Espiritual")),
//                "Un pastor andaluz viaja en busca de su leyenda personal."
//        ));
//
//        books.add(new Book(
//                "La sombra del viento",
//                "Carlos Ruiz Zafón",
//                864,
//                2001,
//                new ArrayList<>(Arrays.asList("Misterio", "Histórico", "Gótico")),
//                "Un joven descubre un libro maldito en el Cementerio de los Libros Olvidados."
//        ));
    }

    public Optional<Book> searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle() != null && book.getTitle().toLowerCase().contentEquals(title)) {
                return Optional.of(book);
            }
        }

        return Optional.empty();
    }
}