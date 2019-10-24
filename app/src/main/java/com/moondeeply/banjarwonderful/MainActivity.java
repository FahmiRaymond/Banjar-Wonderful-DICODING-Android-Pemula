package com.moondeeply.banjarwonderful;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.moondeeply.banjarwonderful.adapter.DetailPlace;
import com.moondeeply.banjarwonderful.adapter.ListPlaceAdapter;
import com.moondeeply.banjarwonderful.model.Place;
import com.moondeeply.banjarwonderful.model.PlaceData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlace;
    private ArrayList<Place> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlace = findViewById(R.id.rv_place);
        rvPlace.setHasFixedSize(true);

        list.addAll(PlaceData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile:
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList(){
        rvPlace.setLayoutManager(new LinearLayoutManager(this));
        ListPlaceAdapter listPlaceAdapter = new ListPlaceAdapter(list);
        rvPlace.setAdapter(listPlaceAdapter);

        listPlaceAdapter.setOnItemClickCallback(new ListPlaceAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(Place data) {
                showSelectedPlace(data);
            }
        });
    }

    private void showSelectedPlace(Place data) {
        Intent intent = new Intent(MainActivity.this, DetailPlace.class);
        intent.putExtra(DetailPlace.EXTRA_NAME, data.getName());
        intent.putExtra(DetailPlace.EXTRA_IMG, data.getPhoto());
        intent.putExtra(DetailPlace.EXTRA_DETAIL, data.getDetail());
        startActivity(intent);
    }
}
