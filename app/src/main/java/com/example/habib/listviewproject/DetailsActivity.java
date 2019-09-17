package com.example.habib.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.habib.listviewproject.MainActivity.dataList;

public class DetailsActivity extends AppCompatActivity {
    ImageView flagImage;
    TextView tvCountry;
    TextView tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_details );

        int position = getIntent().getExtras().getInt( "key" );

        flagImage = findViewById( R.id.iv_activity_details_img );
        tvCountry = findViewById( R.id.tv_activity_details_social_media );
        tvDesc = findViewById( R.id.tv_activity_details_desc );

        flagImage.setImageResource( dataList.get( position ).getmImg() );
        tvCountry.setText( dataList.get( position ).getmCountryName() );
        tvDesc.setText( dataList.get( position ).getmDesc() );

    }
}
