package com.angelemanuel.tp3.ui.search;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.angelemanuel.tp3.models.Book;
import com.angelemanuel.tp3.repositories.BookRepository;

import java.util.Optional;

public class SearchActivityViewModel extends AndroidViewModel {
    private MutableLiveData<Book> mutableBook;
    private MutableLiveData<String> mutableFindResultMessage;
    private final BookRepository bookRepository = new BookRepository();

    public SearchActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Book> getMutableBook() {
        if (mutableBook == null) {
            mutableBook = new MutableLiveData<>();
        }

        return mutableBook;
    }

    public LiveData<String> getMutableFindResultMessage() {
        if (mutableFindResultMessage == null) {
            mutableFindResultMessage = new MutableLiveData<>();
        }

        return mutableFindResultMessage;
    }

    public void findBookByTitle(String title) {
        if (title == null) {
            mutableFindResultMessage.setValue("Ingrese un título para buscar");

            return;
        }

        String trimmedTitle = title.trim();

        if (trimmedTitle.isEmpty()) {
            mutableFindResultMessage.setValue("El título no puede estar vacío");

            return;
        }

        String searchTitle = trimmedTitle.toLowerCase();

        Optional<Book> result = bookRepository.searchByTitle(searchTitle);

        if (result.isPresent()) {
            var book = result.get();

            mutableBook.setValue(book);
        } else {
            mutableFindResultMessage.setValue(
                    "No se ha encontrado el libro con el título: " + title
            );
        }
    }
}