package edu.floridapoly.mobiledeviceapps.fall23.lopezgabriel.lopez_gabriel_pass_receive_between_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class favoriteCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_course);

        Button btnApprove = findViewById(R.id.btnApproveCourse);
        TextView receivedName = (TextView) findViewById(R.id.txtMyNameCourse);
        TextView receivedInfoCourse = (TextView) findViewById(R.id.txtFavoriteCourse);

        //------------------------------------------------------------------------------
        Intent intentCourse = getIntent();

        String strNameCourse = intentCourse.getStringExtra("message_key2");
        receivedName.setText((strNameCourse));

        String strCourse = intentCourse.getStringExtra("message_key1");
        receivedInfoCourse.setText(strCourse);
        //------------------------------------------------------------------------------

        btnApprove.setText("Approved");




    }
}