package com.pscode.pslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class bookEngFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_eng_four);
        PDFView pf = findViewById(R.id.showBookFour);
        //Loading The pdf in Device.
        pf.fromAsset("thinkandgrowrich.pdf")
                .defaultPage(0)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(10)
                .load();
    }
}