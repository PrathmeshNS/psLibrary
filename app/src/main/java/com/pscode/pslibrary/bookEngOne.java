package com.pscode.pslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class bookEngOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_eng_one);
        PDFView pf = findViewById(R.id.showBookOne);
        //Loading The pdf in Device.
        pf.fromAsset("dearstrangeryoudeservetobeloved.pdf")
                .defaultPage(0)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(10)
                .load();
    }
}








