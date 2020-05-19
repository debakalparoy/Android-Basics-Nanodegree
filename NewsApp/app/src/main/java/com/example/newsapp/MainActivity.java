package com.example.newsapp;

import android.annotation.SuppressLint;
import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<NewsData>> {
    private NewsAdapter newsAdapter;
    private static final String REQUEST_URL = "http://content.guardianapis.com/search?show-tags=contributor&api-key=47a78317-d9b5-4c11-b2f8-4871d1aefd55";
    private TextView emptyTextView;
    private ProgressBar progressBar;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress_bar);
        emptyTextView = findViewById(R.id.empty);

        ConnectivityManager CM = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        assert CM != null;
        NetworkInfo NI = CM.getActiveNetworkInfo();
        if (NI != null && NI.isConnected()) {
            LoaderManager loaderManager = getLoaderManager();
            loaderManager.initLoader(0, null, this);

        } else {
            progressBar.setVisibility(View.GONE);
            emptyTextView.setText("No Internet Connection");
        }

        newsAdapter = new NewsAdapter(this, new ArrayList<NewsData>());
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(newsAdapter);
        listView.setEmptyView(emptyTextView);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                NewsData current = newsAdapter.getItem(position);

                assert current != null;
                Uri news_Uri = Uri.parse(current.getWebURL());

                Intent website = new Intent(Intent.ACTION_VIEW, news_Uri);
                startActivity(website);
            }
        });


    }

    //Loaders override methods below
    @Override
    public Loader<List<NewsData>> onCreateLoader(int i, Bundle bundle) {

        return new NewsLoader(this, REQUEST_URL);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onLoadFinished(Loader<List<NewsData>> loader, List<NewsData> earthquakes) {

        newsAdapter.clear();
        progressBar.setVisibility(View.GONE);
        emptyTextView.setText("No News found");


        if (earthquakes != null && !earthquakes.isEmpty()) {
            newsAdapter.addAll(earthquakes);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<NewsData>> loader) {

        newsAdapter.clear();
    }


}