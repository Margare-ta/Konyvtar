package com.example.konyvtar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button addButton;
    private Button deleteButton;
    private EditText nameEditText;
    private EditText titleEditText;
    private EditText pageNumber;
    private TextView nameTextView;
    private TextView tilteTextView;
    private TextView pageNumberTextView;
    private ListView booksListView;
    private MyAdapter booksAdapter;
    private static ArrayList<Books> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        init();
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Author = nameEditText.getText().toString();
                String Title = titleEditText.getText().toString();
                Integer PageNumber = 0;
                try{
                    PageNumber = Integer.parseInt(pageNumber.getText().toString());
                }catch (NumberFormatException nfe){
                    Toast.makeText(MainActivity.this, "Not a number", Toast.LENGTH_SHORT).show();
                }

                if(!Author.isEmpty() || !Title.isEmpty() || PageNumber > 50){
                    books.add(new Books(Author,Title,PageNumber));
                    Toast.makeText(MainActivity.this, "Sikeres regisztráció",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Sikertelen regisztráció",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void init(){
        books = new ArrayList<Books>();
        addButton = findViewById(R.id.Add);
        deleteButton = findViewById(R.id.Delete);
        nameEditText = findViewById(R.id.Name);
        titleEditText = findViewById(R.id.Title);
        pageNumber = findViewById(R.id.PageNumber);
        nameTextView = findViewById(R.id.TextVName);
        tilteTextView = findViewById(R.id.TextVTitle);
        pageNumberTextView = findViewById(R.id.TextVPageNumber);
        booksAdapter = new MyAdapter(books, MainActivity.this);
        booksListView = findViewById(R.id.listView);
    }

    public static  ArrayList<Books> getBooks(){
        return books;
    }
}