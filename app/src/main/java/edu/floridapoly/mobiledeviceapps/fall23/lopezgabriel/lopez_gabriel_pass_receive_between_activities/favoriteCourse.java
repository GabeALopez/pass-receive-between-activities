package edu.floridapoly.mobiledeviceapps.fall23.lopezgabriel.lopez_gabriel_pass_receive_between_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class favoriteCourse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_course);

        //Variable Set Up
        Button btnApprove = findViewById(R.id.btnApproveCourse);
        TextView receivedName = (TextView) findViewById(R.id.txtMyNameCourse);
        TextView receivedInfoCourse = (TextView) findViewById(R.id.txtFavoriteCourse);

        //---------------------Getting the Intent---------------------------------------------------------
        Intent intentCourse = getIntent();

        String strNameCourse = intentCourse.getStringExtra("message_key2");
        receivedName.setText((strNameCourse));

        String strCourse = intentCourse.getStringExtra("message_key1");
        receivedInfoCourse.setText(strCourse);
        //------------------------------------------------------------------------------

        //-------------------Change Text of Button-----------------------------------------------------------
        btnApprove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnApprove.setText("Approved");

            }
        });
        //------------------------------------------------------------------------------

    }
    //-----------------------Send Message Back on Back Button Pressed-------------------------------------------------------
    @Override
    public void onBackPressed() {

        Button btnApprovedCheck = findViewById(R.id.btnApproveCourse);
        TextView txtFavoriteSendBack = findViewById(R.id.txtFavoriteCourse);
        String message;

        if (btnApprovedCheck.getText().toString() == "Approved")
        {
            message = "Returned from Course, Received: APPROVED!";

        }
        else
        {
            message = "Returned from Course, Received: NOT APPROVED!";
        }

        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        toast.show();

        finish();

        super.onBackPressed();
    }
    //------------------------------------------------------------------------------
}