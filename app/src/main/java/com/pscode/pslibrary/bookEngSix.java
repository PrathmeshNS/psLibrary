package com.pscode.pslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class bookEngSix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_eng_six);
        PDFView pf = findViewById(R.id.showBookSix);
        //Loading The pdf in Device.
        pf.fromAsset("fivewaystoboostyourmentalenergytoday.pdf")
                .defaultPage(0)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(10)
                .load();
    }
}