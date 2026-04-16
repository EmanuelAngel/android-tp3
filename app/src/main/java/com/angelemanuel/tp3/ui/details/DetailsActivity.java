package com.angelemanuel.tp3.ui.details;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.angelemanuel.tp3.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding activityDetailsBinding;
    private DetailsActivityViewModel bookActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityDetailsBinding = ActivityDetailsBinding.inflate(getLayoutInflater());
        bookActivityViewModel = new ViewModelProvider(this).get(DetailsActivityViewModel.class);

        setContentView(activityDetailsBinding.getRoot());

        bookActivityViewModel.getMutableBook().observe(
                this,
                book -> {
                    activityDetailsBinding.tvBookTitle.setText(book.getTitle());
                    activityDetailsBinding.tvBookAuthor.setText(book.getAuthor());
                    activityDetailsBinding.tvBookPagesQuantity.setText(String.valueOf(book.getPagesQuantity()));
                    activityDetailsBinding.tvBookPublishYear.setText(String.valueOf(book.getPublishYear()));
                    activityDetailsBinding.tvBookDescription.setText(book.getDescription());
                    activityDetailsBinding.ivBookImage.setImageResource(book.getImageResId());
                    activityDetailsBinding.ivBookImage.setContentDescription("Portada de " + book.getTitle());
                }
        );

        bookActivityViewModel.extractIntentData(getIntent());
    }
}