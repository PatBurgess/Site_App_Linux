package com.patburgess.site_app;

/*************************************************************************/
/*************************************************************************/
/*************************************************************************/
/*****                                                               *****/
/*****  Author:     Pat Burgess                                      *****/
/*****                                                               *****/
/*****  Class:      SDEV 264-30D Mobile Application Development      *****/
/*****              Ivy Tech Community College                       *****/
/*****              Lafayette, Indiana                               *****/
/*****                                                               *****/
/*****  Assignment: The Simple Way to Develop Your First Android App *****/
/*****              from                                             *****/
/*****              http://                                          *****/
/*****              redpillprogramming.com/simple-way-android-app/   *****/
/*****                                                               *****/
/*****  Date:       Friday, January 27, 2017                         *****/
/*****                                                               *****/
/*************************************************************************/
/*************************************************************************/
/*************************************************************************/

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;



public class MainActivity extends AppCompatActivity {

    String url = "http://www.patburgess.com";

    WebView pat_burgess_site;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pat_burgess_site = (WebView) findViewById(R.id.web_view);
        pat_burgess_site.getSettings().setJavaScriptEnabled(true);
        pat_burgess_site.getSettings().setDomStorageEnabled(true);
        pat_burgess_site.loadUrl(url);



    }
}


/*
0000000000111111111112222222222233333333333444444444445555555555566666666666777777777777
1234567789012345677890123456778901234567789012345677890123456778901234567789012345677890
*/

