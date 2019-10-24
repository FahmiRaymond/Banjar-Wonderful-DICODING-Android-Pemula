package com.moondeeply.banjarwonderful.adapter;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.moondeeply.banjarwonderful.R;

import org.w3c.dom.Text;

public class DetailPlace extends AppCompatActivity {
    public static String EXTRA_NAME = "place_name";
    public static String EXTRA_DETAIL = "place_detail";
    public static String EXTRA_IMG = "place_img";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_detail);

        int img = getIntent().getIntExtra(EXTRA_IMG, 0);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);

        ImageView placeImg = findViewById(R.id.img_place);
        TextView placeName = findViewById(R.id.tv_item_name);
        TextView placeDetail = findViewById(R.id.tv_item_detail);

        Glide.with(this).load(img).into(placeImg);
        placeName.setText(name);
        placeDetail.setText(detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(getIntent().getStringExtra(EXTRA_NAME));
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }

}
