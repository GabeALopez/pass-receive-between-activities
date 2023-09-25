package edu.floridapoly.mobiledeviceapps.fall23.lopezgabriel.lopez_gabriel_pass_receive_between_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;


public class favoriteSong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_song);

        //Variable Set Up
        TextView txtMyName = findViewById(R.id.txtMyNameSong);
        TextView txtSong = findViewById(R.id.txtFavoriteSong);
        Button btnApprove = findViewById(R.id.btnApproveSong);

        //--------------Get Intent and Take Values-----------------------------------------
        Intent intentSong = getIntent();

        String strMyName = intentSong.getStringExtra("message_key4");
        txtMyName.setText(strMyName);

        String strSong = intentSong.getStringExtra("message_key3");
        txtSong.setText(strSong);
        //---------------------------------------------------------------------------------

        //--------------Change Text of Button----------------------------------------------
        btnApprove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnApprove.setText("Approved");

            }
        });
        //---------------------------------------------------------------------------------

    }

    //-----------------Send Message on Back Button Pressed---------------------------------
    @Override
    public void onBackPressed() {

        Button btnApproveCheck = findViewById(R.id.btnApproveSong);
        String message;

        if(btnApproveCheck.getText().toString() == "Approved")
        {

            message = "Returned from Song, Received: APPROVED!";

        }
        else
        {

            message = "Returned from Song, Received: NOT APPROVED!";

        }

        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        toast.show();

        super.onBackPressed();
    }
    //---------------------------------------------------------------------------------
}