package com.angelemanuel.tp3.ui.details;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.angelemanuel.tp3.models.Book;

public class DetailsActivityViewModel extends AndroidViewModel {
    private MutableLiveData<Book> mutableBook;

    public DetailsActivityViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Book> getMutableBook() {
        if (mutableBook == null) {
            mutableBook = new MutableLiveData<>();
        }

        return mutableBook;
    }

    public void extractIntentData(@NonNull Intent intent) {
        var book = intent.getSerializableExtra("book", Book.class);

        if (book != null) {
            mutableBook.setValue(book);
        }
    }
}