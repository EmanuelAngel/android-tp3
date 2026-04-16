package com.angelemanuel.tp3.ui.search;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import com.angelemanuel.tp3.R;
import com.angelemanuel.tp3.databinding.ActivitySearchBinding;
import com.angelemanuel.tp3.ui.details.DetailsActivity;

public class SearchActivity extends AppCompatActivity {
    private ActivitySearchBinding activitySearchBinding;
    private SearchActivityViewModel searchActivityViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activitySearchBinding = ActivitySearchBinding.inflate(getLayoutInflater());
        searchActivityViewModel = new ViewModelProvider(this).get(SearchActivityViewModel.class);

        setContentView(activitySearchBinding.getRoot());

        searchActivityViewModel.getMutableFindResultMessage().observe(
                this,
                message -> Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        );

        activitySearchBinding.btSearchBook.setOnClickListener(
                view -> searchActivityViewModel.findBookByTitle(
                        activitySearchBinding.etSearchBook.getText().toString()
                )
        );

        searchActivityViewModel.getMutableBook().observe(
                this,
                book -> {
                    var goToBook = new Intent(this, DetailsActivity.class);

                    goToBook.putExtra("book", book);

                    startActivity(goToBook);
                }
        );
    }
}